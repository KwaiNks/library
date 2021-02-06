
public class Book {

  private String title;

  public Book(String title) {
    this.title = title;
  }

  public Book() {

  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "Book";
  }
}
