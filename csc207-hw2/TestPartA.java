<<<<<<< HEAD
package com.homework.tao.hw2;
=======
package cs207.hw2;
>>>>>>> e83c340039355b60d86d0d43e365f71829df9067
import static org.junit.Assert.*;

import org.junit.Test;

public class TestPartA
{
  @Test
  public void test_isMultiple()
    throws Exception
  {
    assertEquals(true, PartA.isMultiple(4, 2));
    assertEquals(true, PartA.isMultiple(6, -3));
    assertEquals(true, PartA.isMultiple(-8, 2));
    assertEquals(true, PartA.isMultiple(1, 1));
  } // test_isMultiple
  
  @Test
  public void test_isOdd() 
    throws Exception
  {
	assertEquals(false, PartA.isOdd(8));
	assertEquals(true, PartA.isOdd(9));
	assertEquals(true, PartA.isOdd(-7));
	assertEquals(false, PartA.isOdd(0));
    assertEquals("negative even", false, PartA.isOdd(-10));
    // Integer.MAX_VALUE is 2^31 - 1, which is odd
    assertEquals("MAX_VALUE", true, PartA.isOdd(Integer.MAX_VALUE));
  } // test_isOdd
  
  @Test
  public void test_oddSumTo()
    throws Exception
  {
    assertEquals(4, PartA.oddSumTo(5));
    assertEquals(25, PartA.oddSumTo(10));
    assertEquals(100, PartA.oddSumTo(20));
    assertEquals(1, PartA.oddSumTo(2));
  } // test_oddSumTo

  @Test
  public void test_isOddProd()
    throws Exception
  {
    assertEquals(true, PartA.isOddProd(new int[] {1, 2, 3}));
    assertEquals(false, PartA.isOddProd(new int[] {1, 2, 4}));
    assertEquals(true, PartA.isOddProd(new int[] {3, 3, 3}));
    assertEquals(false, PartA.isOddProd(new int[] {5, 2, 4}));
  } // test_isOddProd
  
  @Test
  public void test_allDistinct()
   throws Exception
 {
   assertEquals(true, PartA.allDistinct(new int[] {1, 2, 3, 4, 5}));
   assertEquals(false, PartA.allDistinct(new int[] {2, 2, 3, 4, 5}));
   assertEquals(true, PartA.allDistinct(new int[] {1, -1, 3, -3}));
   assertEquals(false, PartA.allDistinct(new int[] {5, 7, 6, 5}));
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
    assertArrayEquals(new int[] { 2, 3, 4, 5, 6},
    				  PartA.reverseInts(new int[] {6, 5, 4, 3, 2}));
    
  } // test_reverseInts
} //NOTE: we learned that one cannot compare tests when the method 
//being tested returns a void
//NOTE 2: any public method being tested should also have a test 
//method that is ALSO PUBLIC