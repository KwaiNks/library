import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class LibraryCollectionTest {

    LibraryCollection libraryCollection;
    Book book;
    Cd cd;
    Dvd dvd;

    @Before
    public void setUp() {
        libraryCollection = new LibraryCollection(10, 10, 10);
    }

    @Test
    public void shouldReturnTotalNumberOfBooksInTheLibraryCollection() {
        assertEquals(10, libraryCollection.getTotalNumberOfBooksInTheLibraryCollection());
    }

    @Test
    public void shouldAddABookToListOfAvailableBooksInLibraryCollection() {
        book = new Book("Richmond");
        libraryCollection.addBookToListOfAvailableBooksInLibraryCollection(book);
        assertEquals(11, libraryCollection.getTotalNumberOfBooksInTheLibraryCollection());
    }

    @Test
    public void shouldRemoveABookFromListOfAvailableBooksInLibraryCollection() {
        Book book1 = new Book("Code Ethics");
        Book book2 = new Book("Code Ethics 2");
        libraryCollection.addBookToListOfAvailableBooksInLibraryCollection(book1);
        libraryCollection.addBookToListOfAvailableBooksInLibraryCollection(book2);
        libraryCollection.removeBookFromTheListOfAvailableBooksInLibraryCollection(book1);
        assertEquals(11, libraryCollection.getTotalNumberOfBooksInTheLibraryCollection());
    }

    @Test
    public void shouldReturnTotalNumberOfCdsInTheLibraryCollection() {
        assertEquals(10, libraryCollection.getTotalNumberOfCdsInTheLibraryCollection());
    }

    @Test
    public void shouldReturnTotalNumberOfDvdsInTheLibraryCollection() {
        assertEquals(10, libraryCollection.getTotalNumberOfDvdsInTheLibraryCollection());
    }
}