package com.yash.junit;

/**
 * @author tanay.ojha
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ProgramTest2 {
Program2 f = new Program2();
	
    @Test
    public void testFactorial1(){  
    	assertEquals(120,f.factorial(5));  
    } 
    
    @Test
    public void testFactorial2(){  
    	assertEquals(130,f.factorial(5));  
    } 
}
