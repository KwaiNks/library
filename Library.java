import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Member> listOfMembers;
    private LibraryCollection libraryCollection;
    private LibraryRecords libraryRecords;

    public Library(LibraryCollection libraryCollection, int numberOfMembers, LibraryRecords libraryRecords) {
        this.libraryCollection = libraryCollection;
        libraryCollection.getTotalNumberOfBooksInTheLibraryCollection();
        libraryCollection.getTotalNumberOfCdsInTheLibraryCollection();
        libraryCollection.getTotalNumberOfDvdsInTheLibraryCollection();

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
        int numberOfItemsInLibraryCollection = libraryCollection.getTotalNumberOfBooksInTheLibraryCollection()
                + libraryCollection.getTotalNumberOfCdsInTheLibraryCollection()
                + libraryCollection.getTotalNumberOfDvdsInTheLibraryCollection();
        return numberOfItemsInLibraryCollection;
    }

    public void borrowBook(Book bookToBorrow, Member member) {
        String bookStatus = "";
        if (libraryCollection.getListOfBooks().contains(bookToBorrow)) {
            bookStatus = "Borrowed";
            libraryCollection.removeBookFromTheListOfAvailableBooksInLibraryCollection(bookToBorrow);
        } else {
            bookStatus = "Not Available";
        }
        libraryRecords.addToRecord(bookToBorrow.toString(), bookToBorrow.getTitle(), bookStatus, member.getName());
    }

    public void returnBook(Book bookToReturn, Member member) {
        libraryCollection.addBookToListOfAvailableBooksInLibraryCollection(bookToReturn);
        String bookStatus = "Returned";
        libraryRecords.addToRecord(bookToReturn.toString(), bookToReturn.getTitle(), bookStatus, member.getName());
    }

    public void borrowCd(Cd cdToBorrow, Member member) {
        String cdStatus = "";
        if (libraryCollection.getListOfCds().contains(cdToBorrow)) {
            cdStatus = "Borrowed";
            libraryCollection.removeCdFromTheListOfAvailableCdsInLibraryCollection(cdToBorrow);
        } else {
            cdStatus = "Not Available";
        }
        libraryRecords.addToRecord(cdToBorrow.toString(), cdToBorrow.getTitle(), cdStatus, member.getName());
    }

    public void returnCd(Cd cdToBeReturned, Member member){ 
        libraryCollection.addCdToListOfAvailableCdsInLibraryCollection(cdToBeReturned);
        String cdStatus = "Returned";
        libraryRecords.addToRecord(cdToBeReturned.toString(), cdToBeReturned.getTitle(), cdStatus, member.getName());
    }

    public void borrowDvd(Dvd dvdToBorrow, Member member) {
        String dvdStatus = "";
        if (libraryCollection.getListOfDvds().contains(dvdToBorrow)) {
            dvdStatus = "Borrowed";
            libraryCollection.removeDvdFromTheListOfAvailableDvdsInLibraryCollection(dvdToBorrow);
        } else {
            dvdStatus = "Not Available";
        }
        libraryRecords.addToRecord(dvdToBorrow.toString(), dvdToBorrow.getTitle(), dvdStatus, member.getName());
    }

    public void returnDvd(Dvd dvdToBeReturned, Member member) {
        libraryCollection.addDvdToListOfAvailableDvdsInLibraryCollection(dvdToBeReturned);
        String dvdStatus = "Returned";
        libraryRecords.addToRecord(dvdToBeReturned.toString(), dvdToBeReturned.getTitle(), dvdStatus, member.getName());
    }
}