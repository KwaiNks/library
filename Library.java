import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> listOfBooks;
    List<Cd> listOfCds;
    List<Dvd> listOfDvds;
    List<Member> listOfMembers;
    List<String> lisOfAvailableItems;
    List<String> listOfLibraryMembers;
    List<String> listOfBorrowedItems;
    List<String> listOfReturnedItems;
    boolean isBorrowed = false;
    boolean isReturned = false;
    Book book;

    public Library(int numberOfBooks, int numberOfCds, int numberOfDvds, int numberOfMembers) {
        lisOfAvailableItems = new ArrayList<String>();
        listOfBorrowedItems = new ArrayList<String>();
        listOfReturnedItems = new ArrayList<String>();

        listOfBooks = new ArrayList<Book>(numberOfBooks);
        for (int i = 0; i < numberOfBooks; i++) {
            listOfBooks.add(new Book());
            lisOfAvailableItems.add(new Book().getTitle());
        }
        listOfCds = new ArrayList<Cd>(numberOfCds);
        for (int i = 0; i < numberOfCds; i++) {
            listOfCds.add(new Cd());
            lisOfAvailableItems.add(new Cd().getTitle());
        }
        listOfDvds = new ArrayList<Dvd>(numberOfDvds);
        for (int i = 0; i < numberOfDvds; i++) {
            listOfDvds.add(new Dvd());
            lisOfAvailableItems.add(new Dvd().getTitle());
        }
        listOfLibraryMembers = new ArrayList<String>();
        listOfMembers = new ArrayList<Member>(numberOfMembers);
        for (int i = 0; i < numberOfMembers; i++) {
            listOfMembers.add(new Member());
            listOfLibraryMembers.add(new Member().getName());
        }
    }

    public int getTotalNumberOfBooksInTheLibrary() {
        return listOfBooks.size();
    }

    public int getTotalNumberOfCdsInTheLibrary() {
        return listOfCds.size();
    }

    public int getTotalNumberOfDvdsInTheLibrary() {
        return listOfDvds.size();
    }

    public int getTotalNumberOfMembersOffTheLibrary() {
        return listOfMembers.size();
    }

    public void addBookToListOfAvailableBooks(Book bookToBeAdded) {
        listOfBooks.add(bookToBeAdded);
        lisOfAvailableItems.add(bookToBeAdded.getTitle());
    }

    public int getNumberOfAvailableTitlesInTheLibrary() {
        return lisOfAvailableItems.size();
    }

    public void removeBookFromTheListOfBooksAvailable(Book bookToBeRemoved) {
        bookToBeRemoved.getTitle();
        listOfBooks.remove(bookToBeRemoved);
        lisOfAvailableItems.remove(bookToBeRemoved.getTitle());
    }

    public void addTitleToTheListOfAvailableTitles(String book) {
        lisOfAvailableItems.add(book);
    }

    public void removeTitleFromTheListOfAvailableTitles(String book) {
        lisOfAvailableItems.remove(book);
    }

    public void borrowBook(Book bookToBorrow, Member member) {
        if (lisOfAvailableItems.contains(bookToBorrow.getTitle())) {
            listOfBorrowedItems.add(bookToBorrow.getTitle());
            lisOfAvailableItems.remove(bookToBorrow.getTitle());
            listOfBooks.remove(bookToBorrow);
            listOfMembers.add(member);
            isBorrowed = true;
        } else {
            isBorrowed = false;
        }
    }

}