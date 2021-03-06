import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class LibraryCollectionTest {

    private LibraryCollection libraryCollection;
    private Book book;
    private Cd cd;
    private Dvd dvd;
    private List<Book> listOfBooks;
    private List<Cd> listOfCds;
    private List<Dvd> listOfDvds;


    @Before
    public void setUp() {
        libraryCollection = new LibraryCollection(10, 10, 10);
    }

    @Test
    public void shouldReturnABook() {
        libraryCollection.setBook(book);
        assertEquals(book, libraryCollection.getBook());
    }

    @Test
    public void shouldReturnTheListOfBooksInLibraryCollection() {
        libraryCollection.setListOfBooks(listOfBooks);
        assertEquals(listOfBooks, libraryCollection.getListOfBooks());
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
    public void shouldReturnACd() {
        libraryCollection.setCd(cd);
        assertEquals(cd, libraryCollection.getCd());
    }

    @Test
    public void shouldReturnTheListOfCdsInLibraryCollection() {
        libraryCollection.setListOfCds(listOfCds);
        assertEquals(listOfCds, libraryCollection.getListOfCds());
    }

    @Test
    public void shouldReturnTotalNumberOfCdsInTheLibraryCollection() {
        assertEquals(10, libraryCollection.getTotalNumberOfCdsInTheLibraryCollection());
    }

    @Test
    public void shouldAddACdToListOfAvailableCdsInLibraryCollection() {
        cd = new Cd("Learning Italian");
        libraryCollection.addCdToListOfAvailableCdsInLibraryCollection(cd);
        assertEquals(11, libraryCollection.getTotalNumberOfCdsInTheLibraryCollection());
    }

    @Test
    public void shouldRemoveACdFromListOfAvailableCdsInLibraryCollection() {
        Cd cdOne = new Cd("Learning French");
        Cd cdTwo = new Cd("Learning English");
        libraryCollection.addCdToListOfAvailableCdsInLibraryCollection(cdOne);
        libraryCollection.addCdToListOfAvailableCdsInLibraryCollection(cdTwo);
        libraryCollection.removeCdFromTheListOfAvailableCdsInLibraryCollection(cdOne);
        assertEquals(11, libraryCollection.getTotalNumberOfCdsInTheLibraryCollection());
    }

    @Test
    public void shouldReturnADvd() {
        libraryCollection.setDvd(dvd);
        assertEquals(dvd, libraryCollection.getDvd());
    }

    @Test
    public void shouldReturnTheListOfDdsInLibraryCollection() {
        libraryCollection.setListOfDvds(listOfDvds);
        assertEquals(listOfDvds, libraryCollection.getListOfDvds());
    }

    @Test
    public void shouldReturnTotalNumberOfDvdsInTheLibraryCollection() {
        assertEquals(10, libraryCollection.getTotalNumberOfDvdsInTheLibraryCollection());
    }

    @Test
    public void shouldAddADvdToListOfAvailableDvdsInLibraryCollection() {
        dvd = new Dvd("Unit Testing");
        libraryCollection.addDvdToListOfAvailableDvdsInLibraryCollection(dvd);
        assertEquals(11, libraryCollection.getTotalNumberOfDvdsInTheLibraryCollection());
    }
    
    @Test
    public void shouldRemoveADvdFromListOfAvailableDvdsInLibraryCollection() {
        Dvd dvdOne = new Dvd("Peppa Pig");
        Dvd dvdTwo = new Dvd("Learning English");
        libraryCollection.addDvdToListOfAvailableDvdsInLibraryCollection(dvdOne);
        libraryCollection.addDvdToListOfAvailableDvdsInLibraryCollection(dvdTwo);
        libraryCollection.removeDvdFromTheListOfAvailableDvdsInLibraryCollection(dvdOne);
        assertEquals(11, libraryCollection.getTotalNumberOfDvdsInTheLibraryCollection());
    }
}