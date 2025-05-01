import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleJUnitTests {
    @Test
    void calulateTest() {
        int a = 1;
        int b = 2;
        int sum = a + b;
        Assertions.assertEquals(3, sum);
    }
}
