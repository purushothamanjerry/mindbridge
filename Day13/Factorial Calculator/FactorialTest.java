package test1;

import org.junit.Assert;
import org.junit.Test;

import Day13.Factorial;

public class FactorialTest {

    @Test
    public void negativenumber() {
        Factorial re = new Factorial();
        int result = re.factorial(-5);
        Assert.assertEquals(1, result);
    }
    @Test
    public void zero() {
        Factorial re = new Factorial();
        int result = re.factorial(0);
        Assert.assertEquals(1, result);
    }
    @Test
    public void positivenumber() {
        Factorial re = new Factorial();
        int result = re.factorial(5);
        Assert.assertEquals(120, result);
    }
    @Test
    public void smallpositivenumber() {
        Factorial re = new Factorial();
        int result = re.factorial(2);
        Assert.assertEquals(2, result);
    }
    @Test
    public void largenumber() {
        Factorial re = new Factorial();
        int result = re.factorial(1234567);
        Assert.assertEquals(0, result);
    }
	
}
