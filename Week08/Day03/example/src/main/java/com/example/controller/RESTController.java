package com.example.controller;

import com.example.model.SabersService;
import com.example.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RESTController {

    @Autowired
    private SabersService sabersService;

    @RequestMapping("/")
    public Student home() {
        return new Student("Ferenc");
    }

    @RequestMapping("/sabers")
    public List<String> sabers() {
        return sabersService.getSabers();
    }

    @RequestMapping("/sabers/{id}")
    public String getName(@PathVariable("id") int id) {
        return sabersService.getName(id);
    }

    @RequestMapping(value = "/sabers", method = RequestMethod.POST)
    public void addName(String name){
        sabersService.addName(name);
    }

    @RequestMapping(value = "/sabers/{name}", method = RequestMethod.POST)
    public String addNames(@PathVariable("name") String name){
        try {
            sabersService.addName(name);
            return "Ok!";
        }
        catch (Exception ex) {
            System.out.println(ex);
            return "Ohh f**k!";
        }
    }
}
