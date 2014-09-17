import static org.junit.Assert.*;

import org.junit.Test;


public class FractionTest {
	//PART A + B
	@Test
	public void testNegate() {
		 Fraction f = new Fraction(11,3);
		  assertEquals("-11/3", f.negate().toString());

		  f = new Fraction(1,2);
		  assertEquals("-1/2",  f.negate().toString());

		  f = new Fraction (5,2);
		  assertEquals("-5/2", f.negate().toString());

		  f = new Fraction(4,2);
		  assertEquals("-2/1", f.negate().toString());
	}
	@Test
	public void testMultiply() {
		 Fraction f = new Fraction(11,3);
		 Fraction y = new Fraction (2, 1);
		  assertEquals("22/3", f.multiply(y).toString());

		  f = new Fraction(1,2);
		  assertEquals("1/1",  f.multiply(y).toString());

		  f = new Fraction (5,2);
		  assertEquals("5/1", f.multiply(y).toString());

		  f = new Fraction(4,2);
		  assertEquals("4/1", f.multiply(y).toString());
	}
	
	@Test
	public void testSubtract() {
		 Fraction f = new Fraction(11,3);
		 Fraction y = new Fraction(1,2);
		  assertEquals("19/6", f.subtract(y).toString());// 22/6-3/6

		  f = new Fraction(1,2);
		  assertEquals("0",  f.subtract(y).toString()); 

		  f = new Fraction (5,2);
		  assertEquals("2/1", f.subtract(y).toString());// 5/2-1/2

		  f = new Fraction(4,2);
		  assertEquals("3/2", f.subtract(y).toString());// 4/2-1/2
	}

	@Test
	public void testDivide() {
		 Fraction f = new Fraction(11,3);
		 Fraction y = new Fraction(1,2);
		  assertEquals("22/3", f.divide(y).toString());

		  f = new Fraction(1,2);
		  assertEquals("1/1",  f.divide(y).toString());

		  f = new Fraction (5,2);
		  assertEquals("5/1", f.divide(y).toString());

		  f = new Fraction(4,2);
		  assertEquals("4/1", f.divide(y).toString());
	}
	
	@Test
	public void testPow() {
		 Fraction f = new Fraction(11,3);
		  assertEquals("121/9", f.pow(2).toString());

		  f = new Fraction(1,2);
		  assertEquals("1/4",  f.pow(2).toString());

		  f = new Fraction (5,2);
		  assertEquals("2/5", f.pow(-1).toString());

		  f = new Fraction(4,2);
		  assertEquals("1/1", f.pow(0).toString());
	}

}
