package test1;

import org.junit.Assert;
import org.junit.Test;

import Day13.Primenumber;

public class PrimenumberTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeNumberException() {
        Primenumber primeChecker = new Primenumber();
        primeChecker.isprimenumber(-5); 
    }

    @Test
    public void testZero() {
        Primenumber primeChecker = new Primenumber();
        boolean result = primeChecker.isprimenumber(0);
        Assert.assertFalse(result);
    }

    @Test
    public void testSmallPrime() {
        Primenumber primeChecker = new Primenumber();
        boolean result = primeChecker.isprimenumber(2);
        Assert.assertTrue(result);
    }


    @Test
    public void testLargePrime() {
        Primenumber primeChecker = new Primenumber();
        boolean result = primeChecker.isprimenumber(104729); 
        Assert.assertTrue(result);
    }

    @Test
    public void testLargeNonPrime() {
        Primenumber primeChecker = new Primenumber();
        boolean result = primeChecker.isprimenumber(123456);
        Assert.assertFalse(result);
    }
}
