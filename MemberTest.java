import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class MemberTest {

    private Member member;

    @Before
    public void setUp() {
        member = new Member();
    }

    @Test
    public void shouldReturnTheNameOfAMember() {
        member.setName("Richmond");
        assertEquals("Richmond", member.getName());
    }
}
