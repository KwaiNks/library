import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LibraryRecordEntryTest {

    LibraryRecordEntry libraryRecordEntry;

    @Before
    public void setUp() {
        libraryRecordEntry = new LibraryRecordEntry("Book", "Java for Beginners", "Borrowed", "Daniel");
    }

    @Test
    public void shouldReturnItemType() {
       libraryRecordEntry.setItemType("Cd");
       assertEquals("Cd", libraryRecordEntry.getItemType());
    }

    @Test
    public void shouldReturnItemTitle() {
        libraryRecordEntry.setItemTitle("Learning Java");
        assertEquals("Learning Java", libraryRecordEntry.getItemTitle());
    }
    
    @Test
    public void shouldReturnItemStatus() {
        libraryRecordEntry.setItemStatus("Borrowed");
        assertEquals("Borrowed", libraryRecordEntry.getItemStatus());

    }

    @Test
    public void shouldReturnMemberAssociatedWithItem() {
        libraryRecordEntry.setMemberAssociatedWithItem("Peter");
        assertEquals("Peter", libraryRecordEntry.getMemberAssociatedWithItem());
    }
}
