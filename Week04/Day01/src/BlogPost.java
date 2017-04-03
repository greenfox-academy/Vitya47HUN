public class BlogPost {
  String authorName;
  String title;
  String text;
  String publicationDate;

  @Override
  public String toString() {
    return "BlogPost{" +
            "authorName='" + authorName + '\'' +
            ", title='" + title + '\'' +
            ", text='" + text + '\'' +
            ", publicationDate='" + publicationDate + '\'' +
            '}';
  }

  public BlogPost(String authorName, String title, String text, String publicationDate){
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this.publicationDate = publicationDate;

  }
}
