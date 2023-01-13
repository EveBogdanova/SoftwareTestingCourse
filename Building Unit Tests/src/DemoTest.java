import static org.junit.Assert.*;


import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class DemoTest {

    @Test
    public void regularTriangle(){
        assertTrue(Demo.isTriangle(3,4,5));
    }

    @Test
    public void regularTriangle2(){
        assertTrue(Demo.isTriangle(4,5,3));
    }

    @Test
    public void regularTriangle3(){
        assertTrue(Demo.isTriangle(8,11,12));
    }
    
    @Test
    public void sumOfTwoSidesIsLessThanThirdSide(){
        assertFalse(Demo.isTriangle(1,3,4));
    }

    @Test
    public void aMinusBisC(){
        assertFalse(Demo.isTriangle(5,1,4));
    }


    @Test
    public void checkOneZero(){
        assertFalse(Demo.isTriangle(2,0,4));
    }

    @Test
    public void checkTwoZeroes(){
        assertFalse(Demo.isTriangle(0,0,15));
    }
    
    @Test
    public void checkThreeZeroes(){
        assertFalse(Demo.isTriangle(0,0,0));
    }

    @Test
    public void checkNegativeNumber(){
        assertFalse(Demo.isTriangle(-1,3,4));
    }

    @Test
    public void checkNegativeNumber2(){
        assertFalse(Demo.isTriangle(3,-3,0));
    }

    @Test
    public void checkNegativeNumber3(){
        assertFalse(Demo.isTriangle(+3,+3,-6));
    }

    @Test
    public void sumEqualsLength(){
        assertFalse(Demo.isTriangle(1,2,3));
    }

    @Test
    public void sumEqualsLength2(){
        assertFalse(Demo.isTriangle(1,1,2));
    }
    
    @Test
    public void testRightTriangle(){
        assertTrue(Demo.isTriangle(2,2,2));
    }
    

    @Test
    public void checkPlus(){
        assertTrue(Demo.isTriangle(+5,+3,+4));
    }

    @Test
    public void checkEmpty(){
        assertFalse(Demo.isTriangle('\n',3,'!'));
    }

    @Test
    public void test_main_program_1() {
        ByteArrayInputStream in = new ByteArrayInputStream("5\n12\n13\n".getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String[] args = {};
        Demo.main(args);
        String consoleOutput = "Enter side 1: \n";
        consoleOutput += "Enter side 2: \n";
        consoleOutput += "Enter side 3: \n";
        consoleOutput += "This is a triangle.\n";
        assertEquals(out.toString(),consoleOutput);
    }


}
