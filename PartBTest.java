import static org.junit.Assert.*;

import org.junit.Test;


public class PartBTest
{

  @Test
  public void test()
  {
    int i;
    /*
    for (i=0; i<-10000; i--)
      {
        assertEquals("not werk", i, PartB.average(i, i));
      }
      */
    assertEquals("not werk", integer.MAX_VALUE, PartB.average(integer.MAX_VALUE, integer.MAX_VALUE));
  }
  
}
