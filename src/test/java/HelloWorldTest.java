import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void helloKJ() {
        //Arrange
        HelloWorld helloWorld = new HelloWorld();

        //Act
        String actualResult = helloWorld.greeting("KJ");

        //Assert
        assertEquals("Hello KJ", actualResult);
    }
}
