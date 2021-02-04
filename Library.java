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

    public int getTotalNumberOfItemsAvailableInLibraryCollection() {
        int numberOfItemsInLibraryCollection = libraryCollection.listOfBooks.size() + libraryCollection.listOfCds.size()
                + libraryCollection.listOfDvds.size();
        return numberOfItemsInLibraryCollection;
    }

    public int getTotalNumberOfMembersTheLibraryHas() {
        return listOfMembers.size();
    }

    public void addMemberToTheListOfMembersOfTheLibrary(Member member) {
        listOfMembers.add(member);
    }

    public void borrowBook(Book bookToBorrow, Member member) {
        boolean isBorrowed = false;
        if (libraryCollection.listOfBooks.contains(bookToBorrow)) {
            isBorrowed = true;
            libraryCollection.listOfBooks.remove(bookToBorrow);
        } else {
            isBorrowed = false;
        }
        libraryRecords.addToRecord(bookToBorrow.toString(), bookToBorrow.getTitle(), isBorrowed, member.getName());
    }
}