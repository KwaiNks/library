import java.util.ArrayList;
import java.util.List;

public class LibraryCollection {

    private Book book;
    private Cd cd;
    private Dvd dvd;
    private List<Book> listOfBooks;
    private List<Cd> listOfCds;
    private List<Dvd> listOfDvds;

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

    public void setListOfBooks(List<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public List<Book> getListOfBooks() {
        return listOfBooks;
    }

    public int getTotalNumberOfBooksInTheLibraryCollection() {
        return getListOfBooks().size();
    }

    public void addBookToListOfAvailableBooksInLibraryCollection(Book bookToBeAdded) {
        getListOfBooks().add(bookToBeAdded);
    }

    public void removeBookFromTheListOfAvailableBooksInLibraryCollection(Book bookToBeRemoved) {
        getListOfBooks().remove(bookToBeRemoved);
    }

    public Cd getCd() {
        return cd;
    }

    public void setCd(Cd cd) {
        this.cd = cd;
    }

    public void setListOfCds(List<Cd> listOfCds) {
        this.listOfCds = listOfCds;
    }

    public List<Cd> getListOfCds() {
        return listOfCds;
    }

    public int getTotalNumberOfCdsInTheLibraryCollection() {
        return getListOfCds().size();
    }

    public void addCdToListOfAvailableCdsInLibraryCollection(Cd cdToBeAdded) {
        getListOfCds().add(cdToBeAdded);
    }

    public void removeCdFromTheListOfAvailableCdsInLibraryCollection(Cd cdToBeRemoved) {
        getListOfCds().remove(cdToBeRemoved);
    }

    public Dvd getDvd() {
        return dvd;
    }

    public void setDvd(Dvd dvd) {
        this.dvd = dvd;
    }

    public void setListOfDvds(List<Dvd> listOfDvds) {
        this.listOfDvds = listOfDvds;
    }

    public List<Dvd> getListOfDvds() {
        return listOfDvds;
    }

    public int getTotalNumberOfDvdsInTheLibraryCollection() {
        return getListOfDvds().size();
    }

    public void addDvdToListOfAvailableDvdsInLibraryCollection(Dvd dvdToBeAdded) {
        getListOfDvds().add(dvdToBeAdded);
    }

    public void removeDvdFromTheListOfAvailableDvdsInLibraryCollection(Dvd dvdToRemove) {
        getListOfDvds().remove(dvdToRemove);
    }
}
