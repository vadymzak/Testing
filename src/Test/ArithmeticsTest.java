package Test;

import Calculation.Arithmetics;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ArithmeticsTest {

    private static Arithmetics a;

    @BeforeClass
    public static void initA(){
        a = new Arithmetics();
    }

    @Rule
    public final ExpectedException exp = ExpectedException.none();

    @Rule
    public Timeout time = new Timeout(1000);

    @Test
    public void testAdd(){
        double res = a.add(7, 3);
        Assert.assertTrue(res == 10);
    }

    @Ignore
    @Test
    public void testDeduct(){
        double res = a.deduct(7, 3);
        Assert.assertTrue(res == 4.0);
    }

    @Test
    public void testMultiply(){
        double res = a.multiply(3, 7);
        if (res != 21) {
            Assert.fail();
        }

    }

    @Test
    public void testDiv(){
        double res = a.div(10, 5);
        if (res != 2.0) {
            Assert.fail();
        }
    }

    @Test(expected = ArithmeticException.class)
    public void testDivException(){
        a.div(10.0, 0.0);
    }

    @Test
    public void testDivExceptionWithRule(){
        exp.expect(ArithmeticException.class);
        a.div(10.0, 0.0);
    }

    //@Test(timeout = 1000)
    @Test
    public void testN(){
        while (true){

        }
    }


}