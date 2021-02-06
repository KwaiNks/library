import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BookTest {

   private Book book;

    @Before
    public void setUp() {
        book = new Book();
    }

    @Test
    public void shouldReturnTheTitleOfABook() {
        book.setTitle("My Journey");
        assertEquals("My Journey", book.getTitle());
    }
}