import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class LibraryTest {

    Library library;
    int numberOfMembers = 3;
    LibraryCollection libraryCollection;
    LibraryRecords libraryRecords;
    Member member;

    @Before
    public void setUp() {
        libraryCollection = new LibraryCollection(10, 10, 10);
        numberOfMembers = 3;
        libraryRecords = new LibraryRecords();
        library = new Library(libraryCollection, numberOfMembers, libraryRecords);
    }

    @Test
    public void shouldReturnTotalNumberOfMembersTheLibraryHas() {
        assertEquals(3, library.getTotalNumberOfMembersTheLibraryHas());
    }

    @Test
    public void shouldReturnTotalNumberOfItemsAvailableInLibraryCollection() {
        libraryCollection.book = new Book("Practice your coding skills");
        libraryCollection.addBookToListOfAvailableBooksInLibraryCollection(libraryCollection.book);
        assertEquals(31, library.getTotalNumberOfItemsAvailableInLibraryCollection());
    }

    @Test
    public void shouldAddMemberToTheListOfMembersOfTheLibrary() {
        Member memberOne = new Member();
        library.addMemberToTheListOfMembersOfTheLibrary(memberOne);
        assertEquals(4, library.getTotalNumberOfMembersTheLibraryHas());
    }

    @Test
    public void shouldBorrowABookFromTheLibraryCollection() {
        libraryCollection.book = new Book("Object Oriented Programming");
        libraryCollection.addBookToListOfAvailableBooksInLibraryCollection(libraryCollection.book);
        member = new Member("Darrel");

        library.borrowBook(libraryCollection.book, member);

        assertEquals(1, libraryRecords.getRecord().size());
        assertEquals(30, library.getTotalNumberOfItemsAvailableInLibraryCollection());
    }
}