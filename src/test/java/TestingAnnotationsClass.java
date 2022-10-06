import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingAnnotationsClass {

    @BeforeTest
    public void beforeClass(){
        System.out.println("I'm going to be executed right before the test.");
    }

    /**
     * Normally, it's a good practice to name the method as the annotation followed by the operation itself or with
     * the name of one expected assertion.
     */
    @Test
    public void testAboutAnnotations(){
        System.out.println("This is a test method.");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("I'm going to be executed right after the test.");
    }

}
