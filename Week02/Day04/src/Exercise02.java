// Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
// Also, the URL is missing a crutial component, find out what it is and insert it too!
// Try to solve it more than once using different String functions!
public class Exercise02 {
  public static void main(String... args) {
    String url = "https//www.reddit.com/r/nevertellmethebots";
    String url2 = url.replace("bots","odds");
    url2 = url2.substring(0,5) + ":" + url2.substring(5,url2.length());


    System.out.println(url2);
  }
}

