import static org.junit.Assert.*;
import org.junit.Test;

public class TestPartA
{
  @Test
  public void test_isMultiple()
    throws Exception
  {
    //STUB
  } // test_isMultiple
  
  @Test
  public void test_isOdd() 
    throws Exception
  {
    assertEquals("negative even", false, PartA.isOdd(-4));
    // Integer.MAX_VALUE is 2^31 - 1, which is odd
    assertEquals("MAX_VALUE", true, PartA.isOdd(Integer.MAX_VALUE));
  } // test_isOdd
  
  @Test
  public void test_oddSumTo()
    throws Exception
  {
    //STUB
  } // test_oddSumTo

  @Test
  public void test_isOddProd()
    throws Exception
  {
    //STUB    
  } // test_isOddProd
  
  @Test
  public void test_allDistinct()
   throws Exception
 {
   //STUB  
 } // test_allDistinct(void)
  
  @Test
  public void test_reverseInts()
    throws Exception
  {
    assertArrayEquals(new int[] {},
                      PartA.reverseInts(new int[] {}));
    assertArrayEquals(new int[] { 1 }, 
                      PartA.reverseInts(new int[] { 1 }));
    assertArrayEquals(new int[] { 1, 2 }, 
                      PartA.reverseInts(new int[] { 2, 1 }));
  } // test_reverseInts
} //NOTE: we learned that one cannot compare tests when the method 
//being tested returns a void
//NOTE 2: any public method being tested should also have a test 
//method that is ALSO PUBLIC