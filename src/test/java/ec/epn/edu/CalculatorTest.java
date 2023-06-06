package ec.epn.edu;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator c = null;

    @BeforeClass
    public static void setUpClass(){
        System.out.println("setUpClass()");
    }

    @Before
    public void setUp(){
        c = new Calculator();
        System.out.println("setUp()");
    }

    @Test
    public void given_two_integers_when_addition_then_ok(){
        assertEquals(6,c.addition(4,2));
        System.out.println("Test 1");
    }

    @Test
    public void given_two_integers_when_substraccion_then_ok(){
        assertEquals(2,c.substraction(4,2));
        System.out.println("Test 2");
    }

    @Test(expected = ArithmeticException.class)
    public void given_two_integers_when_division_then_exception(){
        assertEquals(1, c.division(1,0), 0);
        System.out.println("Test 3");
    }

    @Test(timeout = 150)
    public void given_a_time_when_timeout_then_exception(){
        c.timeout(100);
        System.out.println("Test 4");
    }

    @After
    public void tearDown(){
        c.setAnswer(0);
        System.out.println("tearDown()");
    }

    @AfterClass
    public static void tearDownClass(){
        System.out.println("tearDownClass()");
    }

}