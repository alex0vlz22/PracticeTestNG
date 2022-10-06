import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestingAssertsClass {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void testTrue(){
        Assert.assertTrue(returnFalse(), "The test was true.");
    }

    @Test
    public void testFalse(){
        Assert.assertFalse(returnTrue(), "The test was false.");
    }

    @Test
    public void testEquals(){
        Assert.assertEquals(returnString(), "Hello world test", "The test is equals.");
    }

    @Test
    public void testNotEquals(){
        Assert.assertNotEquals(returnString(), "Hello world OMG", "The test is not equals.");
    }

    // Business.

    public boolean returnFalse(){
        int x = 2, y = 3;
        return (x>y);
    }

    public boolean returnTrue(){
        int x = 2, y = 3;
        return (x<y);
    }

    public String returnString(){
        return "Hello world!";
    }



}
