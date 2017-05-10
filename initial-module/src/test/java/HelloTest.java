import org.junit.Assert;
import org.junit.Test;

/**
 * Created by @amanmehara on 10/05/2017.
 */
public class HelloTest {

    @Test
    public void greetTest() {
        Assert.assertEquals("Hello, Aman.",Hello.greet("Aman"));
    }

}
