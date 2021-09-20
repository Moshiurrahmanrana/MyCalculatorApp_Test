
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestRunner extends BasePage {
    TestCase objTest;

    public TestRunner() throws IOException, InterruptedException {
    }

    @Test(priority = 2)
    public void doSum() throws IOException, InterruptedException {
        objTest = new TestCase();
        String Plus = objTest.doSum();
        Assert.assertEquals(Plus, "12");
    }

    @Test(priority = 1)
    public void doSubtraction() throws IOException, InterruptedException {
        objTest = new TestCase();
        String minus = objTest.doSubtraction();
        Assert.assertEquals(minus, "8");
    }

    @Test(priority = 3)
    public void doMultiplication() throws IOException, InterruptedException {
        objTest = new TestCase();
        String minus = objTest.doMultiplication();
        Assert.assertEquals(minus, "9");
    }

    @Test(priority = 4)
    public void doDivision() throws IOException, InterruptedException {
        objTest = new TestCase();
        String minus = objTest.doDivision();
        Assert.assertEquals(minus, "4");

    }
}