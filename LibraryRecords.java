import java.util.ArrayList;
import java.util.List;

public class LibraryRecords {

private List<LibraryRecordEntry> libraryRecordEntries = new ArrayList<LibraryRecordEntry>();

	public void addToRecord(String itemType, String itemTitle, String itemStatus,  String memberAssociatedWithItem) {
        libraryRecordEntries.add(new LibraryRecordEntry(itemType, itemTitle, itemStatus, memberAssociatedWithItem));
	}

	public List<LibraryRecordEntry> getRecord() {
		return libraryRecordEntries ;
	}
}