# library

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class LibraryTest{

    Library library;
    List<Books> listOfBooks;
    List<Cds> listOfCds;
    List<Dvds> listOfDvds;
    List<Members> listOfMembers;

@Before
public void setUp(){
    library = new Library(10,10,10,3);
    
}

@Test
public void shouldReturnTheTotalNumberOfBooksInTheLibrary(){
    assertArrayEquals(10, library.getTotalNumberOfBooksInTheLibrary() );
}

@Test
public void shouldReturnTheTotalNumberOfCdsInTheLibrary(){
    assertArrayEquals(10, library.getTotalNumberOfCdsInTheLibrary() );
}

@Test
public void shouldReturnTheTotalNumberOfDvdsInTheLibrary(){
    assertArrayEquals(10, library.getTotalNumberOfDvdsInTheLibrary() );
}

@Test
public void shouldReturnTheTotalNumberOfMembersOfTheLibrary(){
    assertArrayEquals(10, library.getTotalNumberOfMembersOffTheLibrary() );
}

@Test
public void shouldReturnTheTotalNumberOfBooksBorrowed(){
    assertArrayEquals(3, library.getTotalNumberOfBooksBorrowed());
}

@Test
public void shouldReturnTheTotalNumberOfCdsBorrowed(){
    assertArrayEquals(3, library.getTotalNumberOfCdsBorrowed());
}

@Test
public void shouldReturnTheTotalNumberOfDvdsBorrowed(){
    assertArrayEquals(3, library.getTotalNumberOfDvdsBorrowed());
}

@Test
public void shouldReturnTheTotalNumberOfBooksReturned(){
    assertArrayEquals(3, library.getTotalNumberOfBooksReturned());
}

@Test
public void shouldReturnTheTotalNumberOfCdsReturned(){
    assertArrayEquals(3, library.getTotalNumberOfCdsReturned());
}

@Test
public void shouldReturnTheTotalNumberOfDvdsReturned(){
    assertArrayEquals(3, library.getTotalNumberOfDvdsReturned());
}



    
}