import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class LibraryTest {

    Library library;
    int numberOfMembers;
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
    public void shouldAddMemberToTheListOfMembersOfTheLibrary() {
        library.addMemberToTheListOfMembersOfTheLibrary(member);
        assertEquals(4, library.getTotalNumberOfMembersTheLibraryHas());
    }

    @Test
    public void shouldRemoveMemberFromTheListOfMembersOfTheLibrary() {
        Member memberTwo = new Member();
        Member memberThree = new Member();
        library.addMemberToTheListOfMembersOfTheLibrary(memberTwo);
        library.addMemberToTheListOfMembersOfTheLibrary(memberThree);
        library.removeMemberFromTheListOfMembersOfTheLibrary(memberTwo);
        assertEquals(4, library.getTotalNumberOfMembersTheLibraryHas());
    }

    @Test
    public void shouldReturnTotalNumberOfItemsAvailableInLibraryCollection() {
        libraryCollection.book = new Book("Practice your coding skills");
        libraryCollection.addBookToListOfAvailableBooksInLibraryCollection(libraryCollection.book);
        assertEquals(31, library.getTotalNumberOfItemsAvailableInLibraryCollection());
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

    @Test
    public void shouldReturnABookToTheLibraryCollection() {
        libraryCollection.book = new Book("Java for Dummies");
        member = new Member("Daniel");

        library.returnBook(libraryCollection.book, member);

        assertEquals(1, libraryRecords.getRecord().size());
        assertEquals(31, library.getTotalNumberOfItemsAvailableInLibraryCollection());
    }

    @Test
    public void shouldBorrowACdFromTheLibraryCollection() {
        libraryCollection.cd = new Cd("Learning the Alphabet");
        libraryCollection.addCdToListOfAvailableCdsInLibraryCollection(libraryCollection.cd);
        member = new Member("John");

        library.borrowCd(libraryCollection.cd, member);

        assertEquals(1, libraryRecords.getRecord().size());
        assertEquals(30, library.getTotalNumberOfItemsAvailableInLibraryCollection());
    }

    @Test
    public void shouldReturnACdToTheLibraryCollection() {
        libraryCollection.cd = new Cd("Supplementary material");
        member = new Member("Emily");

        library.returnCd(libraryCollection.cd, member);

        assertEquals(1, libraryRecords.getRecord().size());
        assertEquals(31, library.getTotalNumberOfItemsAvailableInLibraryCollection());
    }

    @Test
    public void shouldBorrowADvdFromTheLibraryCollection() {
        libraryCollection.dvd = new Dvd("The Last Trial");
        libraryCollection.addDvdToListOfAvailableDvdsInLibraryCollection(libraryCollection.dvd);
        member = new Member("John");

        library.borrowDvd(libraryCollection.dvd, member);

        assertEquals(1, libraryRecords.getRecord().size());
        assertEquals(30, library.getTotalNumberOfItemsAvailableInLibraryCollection());
    }

    @Test
    public void shouldReturnADvdToTheLibraryCollection() {
        libraryCollection.dvd = new Dvd("Supplementary material");
        member = new Member("Nichole");

        library.returnDvd(libraryCollection.dvd, member);

        assertEquals(1, libraryRecords.getRecord().size());
        assertEquals(31, library.getTotalNumberOfItemsAvailableInLibraryCollection());
    }
}