import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LibraryRecordsTest {
    
    LibraryRecords libraryRecords;

    @Before
    public void setUp() {
        libraryRecords = new LibraryRecords();
    }

    @Test
    public void shouldAddItemsAndMembersRecordToLibraryRecord(){
        libraryRecords.addToRecord("Book", "My Journey", "Borrowed", "Frank Davis");
        assertEquals(1, libraryRecords.getRecord().size());

        LibraryRecordEntry libraryRecordEntryOne = libraryRecords.getRecord().get(0);
        assertEquals("Book", libraryRecordEntryOne.getItemType());
        assertEquals("My Journey", libraryRecordEntryOne.getItemTitle());
        assertEquals("Borrowed", libraryRecordEntryOne.getItemStatus());
        assertEquals("Frank Davis", libraryRecordEntryOne.getMemberAssociatedWithItem());
    }
}
