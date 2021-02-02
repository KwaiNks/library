import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class LibraryTest {

    Library library;
    Book book;
    Member member;

    @Before
    public void setUp() {
        library = new Library(10, 10, 10, 3);
    }

    @Test
    public void shouldReturnTheTotalNumberOfBooksInTheLibrary() {
        assertEquals(10, library.getTotalNumberOfBooksInTheLibrary());
    }

    @Test
    public void shouldReturnTheTotalNumberOfCdsInTheLibrary() {
        assertEquals(10, library.getTotalNumberOfCdsInTheLibrary());
    }

    @Test
    public void shouldReturnTheTotalNumberOfDvdsInTheLibrary() {
        assertEquals(10, library.getTotalNumberOfDvdsInTheLibrary());
    }

    @Test
    public void shouldReturnTheTotalNumberOfMembersOfTheLibrary() {
        assertEquals(3, library.getTotalNumberOfMembersOffTheLibrary());
    }

    @Test
    public void shouldReturnTheTotalNumberOfAvailableTitles() {
        book = new Book("Practice your coding skills");
        library.addBookToListOfAvailableBooks(book);
        assertEquals(31, library.getNumberOfAvailableTitlesInTheLibrary());
    }

    @Test
    public void shouldAddABookToTheListOfBooksAvailable() {
        book = new Book("Richmond");
        library.addBookToListOfAvailableBooks(book);
        assertEquals(11, library.getTotalNumberOfBooksInTheLibrary());
    }

    @Test
    public void shouldRemoveABookFromAListOfBooksAvailable() {
        Book book = new Book("Code Ethics");
        Book book1 = new Book("Code Ethics 2");
        library.addBookToListOfAvailableBooks(book1);
        library.addBookToListOfAvailableBooks(book);
        library.removeBookFromTheListOfBooksAvailable(book);
        assertEquals(11, library.getTotalNumberOfBooksInTheLibrary());
    }

    @Test
    public void shouldAddATitleToTheListOfAvailableTitles() {
        String bookTitle = new Book("Test Driven Development").getTitle();
        library.addTitleToTheListOfAvailableTitles(bookTitle);
        assertEquals(31, library.getNumberOfAvailableTitlesInTheLibrary());
    }

    @Test
    public void shouldRemoveTitleFromTheListOffAvailableTitles() {
        Cd cdOne = new Cd("Jingle Jangle");
        library.addTitleToTheListOfAvailableTitles(cdOne.getTitle());
        Book bookOne = new Book("Java for beginners");
        library.addTitleToTheListOfAvailableTitles(bookOne.getTitle());
        Dvd dvdOne = new Dvd("Terminator");
        library.addTitleToTheListOfAvailableTitles(dvdOne.getTitle());
        library.removeTitleFromTheListOfAvailableTitles(bookOne.getTitle());
        assertEquals(32, library.getNumberOfAvailableTitlesInTheLibrary());
    }
}