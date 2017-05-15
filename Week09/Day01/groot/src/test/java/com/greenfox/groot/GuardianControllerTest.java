package com.greenfox.groot;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = GrootApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class GuardianControllerTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void testStatusOk() throws Exception {
    mockMvc.perform(get("/groot?message=somemessage"))

//            .contentType(MediaType.APPLICATION_JSON)
//            .content("{\"received\": \"somemessage\"}"))

            .andExpect(status().isOk())
            .andExpect(jsonPath("$.received", is("somemessage")))
            .andExpect(jsonPath("$.translated", is("I am Groot!")));
  }

  @Test
  public void testStatusNotOK() throws Exception {
    mockMvc.perform(get("/groot"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error", is("I am Groot!")));
  }

  @Test
  public void testYonduSpeed() throws Exception {
    mockMvc.perform(get("/yondu?distance=100.0&time=10.0"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.speed", is(10.0)));
  }

  @Test
  public void testYonduStatusNoInput() throws Exception {
    mockMvc.perform(get("/yondu"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error", is("I am Groot!")));
  }

  @Test
  public void testRocket() throws Exception {
    mockMvc.perform(get("/rocket"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.shipstatus", is("empty")))
            .andExpect(jsonPath("$.ready", is(false)));
  }

  @Test
  public void testFill() throws Exception {
    mockMvc.perform(get("/rocket/fill?caliber=.50&amount=12500"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.received", is(".50")))
            .andExpect(jsonPath("$.amount", is(5000)))
            .andExpect(jsonPath("$.shipstatus", is("40%")));
  }

  @Test
  public void testFillNoValue() throws Exception {
    mockMvc.perform(get("/rocket/fill"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error", is("I am Groot!")));

  }

  @Test
  public void testCalorieRuns() throws Exception {
    mockMvc.perform(get("/drax"))
            .andExpect(status().isOk());
  }

  @Test
  public void testCalorieAdd() throws Exception {
    mockMvc.perform(post("/drax/add").contentType(MediaType.APPLICATION_JSON)
    .content("    {\n" +
            "      \"name\": \"korte\",\n" +
            "      \"amount\": 1,\n" +
            "      \"calorie\": 153\n" +
            "    }"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.name", is("korte")))
            .andExpect(jsonPath("$.amount", is(1)))
            .andExpect(jsonPath("$.calorie", is(153)));
  }

}
