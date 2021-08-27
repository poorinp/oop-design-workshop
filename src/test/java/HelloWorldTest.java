import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void helloKJ() {
        HelloWorld helloWorld = new HelloWorld();
        String actualResult = helloWorld.greeting("KJ");
        assertEquals("Hello KJ", actualResult);
    }
}
