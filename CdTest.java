import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CdTest {
    
    private Cd cd;

    @Before
    public void setUp() {
        cd = new Cd();
    }

    @Test
    public void shouldReturnTheTitleOfACd() {
        cd.setTitle("Moving on");
        assertEquals("Moving on", cd.getTitle());
    }
}