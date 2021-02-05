import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class DvdTest {

    Dvd dvd;

    @Before
    public void setUp() {
        dvd = new Dvd();
    }

    @Test
    public void shouldReturnTheTitleOfACd() {
        dvd.setTitle("Jingle Jungle");
        assertEquals("Jingle Jungle", dvd.getTitle());
    }
}