<<<<<<< HEAD
package com.homework.tao.hw2;
=======
package cs207.hw2;
import static org.junit.Assert.*;
>>>>>>> e83c340039355b60d86d0d43e365f71829df9067


<<<<<<< HEAD
import org.junit.Test;

=======
>>>>>>> e83c340039355b60d86d0d43e365f71829df9067
public class PartBTest
{
@SuppressWarnings("deprecation")
@Test
  public void test()
  {
<<<<<<< HEAD
    //int i;
    /*
    for (i=0; i<-10000; i--)
      {
        assertEquals("not werk", i, PartB.average(i, i));
      }
      */
    //assertEquals("not werk", integer.MAX_VALUE, PartB.average(integer.MAX_VALUE, integer.MAX_VALUE));
    // this is the test that we used to affirm the "bug" 
=======
    
    //assertEquals("not werk", Integer.MAX_VALUE, PartB.average(Integer.MAX_VALUE, Integer.MAX_VALUE));
    // this is the test that we used to affirm the "bug" 
	
	
	assertEquals("not werk", 14, PartB.average(14, 14));
	assertEquals("not werk", 8, PartB.average(7, 9));
	assertEquals("not werk", 21, PartB.average(14, 28));
	assertEquals("not werk", 2, PartB.average(1, 3));
	
	//Actual Tests
>>>>>>> e83c340039355b60d86d0d43e365f71829df9067
  }
  
}
