package cs207.hw2;
import static org.junit.Assert.*;

import org.junit.Test;

public class PartBTest
{
@SuppressWarnings("deprecation")
@Test
  public void test()
  {
    
    //assertEquals("not werk", Integer.MAX_VALUE, PartB.average(Integer.MAX_VALUE, Integer.MAX_VALUE));
    // this is the test that we used to affirm the "bug" 
	
	
	assertEquals("not werk", 14, PartB.average(14, 14));
	assertEquals("not werk", 8, PartB.average(7, 9));
	assertEquals("not werk", 21, PartB.average(14, 28));
	assertEquals("not werk", 2, PartB.average(1, 3));
	
	//Actual Tests
  }
  
}
