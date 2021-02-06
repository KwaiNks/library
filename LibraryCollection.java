import java.util.ArrayList;
import java.util.List;

public class LibraryCollection {
    
    private Book book;
    private Cd cd;
    private Dvd dvd;
    List<Book> listOfBooks;
    List<Cd> listOfCds;
    List<Dvd> listOfDvds;

    public LibraryCollection(int numberOfBooks, int numberOfCds, int numberOfDvds) {

        listOfBooks = new ArrayList<Book>(numberOfBooks);
        for (int i = 0; i < numberOfBooks; i++) {
            listOfBooks.add(new Book());
        }
        listOfCds = new ArrayList<Cd>(numberOfCds);
        for (int i = 0; i < numberOfCds; i++) {
            listOfCds.add(new Cd());
        }
        listOfDvds = new ArrayList<Dvd>(numberOfDvds);
        for (int i = 0; i < numberOfDvds; i++) {
            listOfDvds.add(new Dvd());
        }
    }

    public Book getBook() {
		return book;
	}

    public void setBook(Book book) {
        this.book = book;
	}
    public int getTotalNumberOfBooksInTheLibraryCollection() {
        return listOfBooks.size();
    }

    public void addBookToListOfAvailableBooksInLibraryCollection(Book bookToBeAdded) {
        listOfBooks.add(bookToBeAdded);
    }

    public void removeBookFromTheListOfAvailableBooksInLibraryCollection(Book bookToBeRemoved) {
        listOfBooks.remove(bookToBeRemoved);
    }

    public Cd getCd() {
		return cd;
	}

    public void setCd(Cd cd) {
        this.cd = cd;
	}

    public int getTotalNumberOfCdsInTheLibraryCollection() {
        return listOfCds.size();
    }

    public void addCdToListOfAvailableCdsInLibraryCollection(Cd cdToBeAdded) {
    listOfCds.add(cdToBeAdded);
    }

    public void removeCdFromTheListOfAvailableCdsInLibraryCollection(Cd cdToBeRemoved) {
    listOfCds.remove(cdToBeRemoved);
    }

    public Dvd getDvd() {
		return dvd;
	}

    public void setDvd(Dvd dvd) {
        this.dvd = dvd;
	}

    public int getTotalNumberOfDvdsInTheLibraryCollection() {
        return listOfDvds.size();
    }

	public void addDvdToListOfAvailableDvdsInLibraryCollection(Dvd dvdToBeAdded) {
    listOfDvds.add(dvdToBeAdded);
    }

	public void removeDvdFromTheListOfAvailableDvdsInLibraryCollection(Dvd dvdToRemove) {
    listOfDvds.remove(dvdToRemove);
    }
}
