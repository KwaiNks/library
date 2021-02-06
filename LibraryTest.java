import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class LibraryTest {
    
    private Library library;
    private int numberOfMembers;
    private LibraryCollection libraryCollection;
    private LibraryRecords libraryRecords;
    private Member member;

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
        libraryCollection.setBook(new Book("Practice your coding skills"));
        libraryCollection.addBookToListOfAvailableBooksInLibraryCollection(libraryCollection.getBook());
        assertEquals(31, library.getTotalNumberOfItemsAvailableInLibraryCollection());
    }

    @Test
    public void shouldBorrowABookFromTheLibraryCollection() {
        libraryCollection.setBook(new Book("Object Oriented Programming"));
        libraryCollection.addBookToListOfAvailableBooksInLibraryCollection(libraryCollection.getBook());
        member = new Member("Darrel");

        library.borrowBook(libraryCollection.getBook(), member);

        assertEquals(1, libraryRecords.getRecord().size());
        assertEquals(30, library.getTotalNumberOfItemsAvailableInLibraryCollection());
    }

    @Test
    public void shouldReturnABookToTheLibraryCollection() {
        libraryCollection.setBook(new Book("Java for Dummies"));;
        member = new Member("Daniel");

        library.returnBook(libraryCollection.getBook(), member);

        assertEquals(1, libraryRecords.getRecord().size());
        assertEquals(31, library.getTotalNumberOfItemsAvailableInLibraryCollection());
    }

    @Test
    public void shouldBorrowACdFromTheLibraryCollection() {
        libraryCollection.setCd(new Cd("Learning the Alphabet"));
        libraryCollection.addCdToListOfAvailableCdsInLibraryCollection(libraryCollection.getCd());
        member = new Member("John");

        library.borrowCd(libraryCollection.getCd(), member);

        assertEquals(1, libraryRecords.getRecord().size());
        assertEquals(30, library.getTotalNumberOfItemsAvailableInLibraryCollection());
    }

    @Test
    public void shouldReturnACdToTheLibraryCollection() {
        libraryCollection.setCd(new Cd("Supplementary material"));
        member = new Member("Emily");

        library.returnCd(libraryCollection.getCd(), member);

        assertEquals(1, libraryRecords.getRecord().size());
        assertEquals(31, library.getTotalNumberOfItemsAvailableInLibraryCollection());
    }

    @Test
    public void shouldBorrowADvdFromTheLibraryCollection() {
        libraryCollection.setDvd(new Dvd("The Last Trial"));;
        libraryCollection.addDvdToListOfAvailableDvdsInLibraryCollection(libraryCollection.getDvd());
        member = new Member("John");

        library.borrowDvd(libraryCollection.getDvd(), member);

        assertEquals(1, libraryRecords.getRecord().size());
        assertEquals(30, library.getTotalNumberOfItemsAvailableInLibraryCollection());
    }

    @Test
    public void shouldReturnADvdToTheLibraryCollection() {
        libraryCollection.setDvd(new Dvd("Supplementary material"));
        member = new Member("Nichole");

        library.returnDvd(libraryCollection.getDvd(), member);

        assertEquals(1, libraryRecords.getRecord().size());
        assertEquals(31, library.getTotalNumberOfItemsAvailableInLibraryCollection());
    }
}