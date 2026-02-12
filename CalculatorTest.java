import org.junit.*;
public class CalculatorTest {
   public void testforPal()
    {
        Calculator cl = new Calculator();
        Assert.assertEquals(12, cl.add(7, 5));
    }
}
