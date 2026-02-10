import org.junit.*;
public class CalculatorTest {
   public void testforPal()
    {
        Calculator cl = new DemoPalindrome();
        Assert.assertEquals(12, cl.add(7, 5));
    }
}
