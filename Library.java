import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Member> listOfMembers;
    LibraryCollection libraryCollection;
    LibraryRecords libraryRecords;

    public Library(LibraryCollection libraryCollection, int numberOfMembers, LibraryRecords libraryRecords) {
        this.libraryCollection = libraryCollection;
        libraryCollection.listOfBooks.size();
        libraryCollection.listOfCds.size();
        libraryCollection.listOfDvds.size();

        this.libraryRecords = libraryRecords;
        libraryRecords = new LibraryRecords();

        listOfMembers = new ArrayList<Member>(numberOfMembers);
        for (int i = 0; i < numberOfMembers; i++)
            listOfMembers.add(new Member());
    }

    public int getTotalNumberOfMembersTheLibraryHas() {
        return listOfMembers.size();
    }

    public void addMemberToTheListOfMembersOfTheLibrary(Member member) {
        listOfMembers.add(member);
    }

    public void removeMemberFromTheListOfMembersOfTheLibrary(Member memberTwo) {
        listOfMembers.remove(memberTwo);
    }

    public int getTotalNumberOfItemsAvailableInLibraryCollection() {
        int numberOfItemsInLibraryCollection = libraryCollection.listOfBooks.size() + libraryCollection.listOfCds.size()
                + libraryCollection.listOfDvds.size();
        return numberOfItemsInLibraryCollection;
    }

    public void borrowBook(Book bookToBorrow, Member member) {
        String bookStatus = "";
        if (libraryCollection.listOfBooks.contains(bookToBorrow)) {
            bookStatus = "Borrowed";
            libraryCollection.removeBookFromTheListOfAvailableBooksInLibraryCollection(bookToBorrow);
        } else {
            bookStatus = "Not Available";
        }
        libraryRecords.addToRecord(bookToBorrow.toString(), bookToBorrow.getTitle(), bookStatus, member.getName());
    }

	public void returnBook(Book bookToReturn, Member member) {
        String bookStatus = "";
        libraryCollection.addBookToListOfAvailableBooksInLibraryCollection(bookToReturn);;
        bookStatus = "Returned";
        libraryRecords.addToRecord(bookToReturn.toString(), bookToReturn.getTitle(), bookStatus, member.getName());
	}

	public void borrowCd(Cd cdToBorrow, Member member) {
        String cdStatus = "";
        if (libraryCollection.listOfCds.contains(cdToBorrow)) {
            cdStatus = "Borrowed";
            libraryCollection.removeCdFromTheListOfAvailableCdsInLibraryCollection(cdToBorrow);
        } else {
            cdStatus = "Not Available";
        }
        libraryRecords.addToRecord(cdToBorrow.toString(), cdToBorrow.getTitle(), cdStatus, member.getName());
	}

	public void returnCd(Cd cdToBeReturned, Member member) {
        String cdStatus = "";
        libraryCollection.addCdToListOfAvailableCdsInLibraryCollection(cdToBeReturned);;
        cdStatus = "Returned";
        libraryRecords.addToRecord(cdToBeReturned.toString(), cdToBeReturned.getTitle(), cdStatus, member.getName());
	}
}