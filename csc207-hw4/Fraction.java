import java.math.BigInteger;


public class Fraction {

	  // +--------+-------------------------------------------------------
	  // | Fields |
	  // +--------+

	  /** The numerator of the fraction. Can be positive, zero or negative. */
	  BigInteger num;

	  /** The denominator of the fraction. Must be non-negative. */
	  BigInteger denom;
	  // +--------------+-------------------------------------------------
	  // | Constructors |
	  // +--------------+

	  /**
	   * Build a new fraction with numerator num and denominator denom.
	   * 
	   * Warning! Not yet stable.
	   */
	  public Fraction (BigInteger num, BigInteger denom) 
	  {
	    this.num = num;
	    this.denom = denom;
	  } // Fraction(int, int) 
	  
	  /** 
	   * Build a new fraction with numerator num and denominator denom.
	   * 
	   * Warning! Not yet stable.
	   */
	  public Fraction (int num, int denom) 
	  {
	    this.num = BigInteger.valueOf (num);
	    this.denom = BigInteger.valueOf (denom);
	  } // Fraction(int, int)
	  
	  
	  /**
	   * Parse the string given to a fraction
	   */
	  public Fraction (String number)
	  {
		  int fraction = number.indexOf("/");
		  if (fraction != -1){
		  this.num = BigInteger.valueOf(Integer.parseInt(number.substring(0, fraction)));
		  this.denom = BigInteger.valueOf(Integer.parseInt(number.substring(fraction+1)));
		  }
		  else{
			  this.num = BigInteger.valueOf(Integer.parseInt(number));
			  this.denom = BigInteger.ONE;
		  }
		  //ASK ABOU T THIS
	  } //Fraction(String)
	  
	  // +---------+------------------------------------------------------
	  // | Methods |
	  // +---------+
	  public Fraction negate()
	  {
		BigInteger resultNum;
		BigInteger resultDenom;
		  resultNum = this.num.negate();
		  resultDenom = this.denom;
		  return new Fraction (resultNum, resultDenom);
	  }
	  /**
	   * 
	   *Multiply two fractions
	   */
	  public Fraction multiply(Fraction multiplicand)
	  {
		  BigInteger resultNumerator;
		  BigInteger resultDenominator;
		  
		  resultDenominator = this.denom.multiply(multiplicand.denom);
		  resultNumerator = this.num.multiply(multiplicand.num);
		  
		 return new Fraction (resultNumerator, resultDenominator); 
	  }
	  /**
	  * Find the modulo of the fraction
	   */
	  public Fraction fractional()
	  {
		  BigInteger resultNumerator;
		  BigInteger resultDenominator;
		  
		  resultDenominator = this.denom;
		  resultNumerator = this.num.mod(this.denom);
		  
		  
		 return new Fraction (resultNumerator, resultDenominator); 
	  }
	  
	  /**
	   * Express this fraction as a double.
	   */
	  public double
	    doubleValue ()
	  {
	    return this.num.doubleValue () / this.denom.doubleValue ();
	  } // doubleValue()

	  /**
	   * Add the fraction other to this fraction.
	   */
	  public Fraction add(Fraction addMe)
	  {
	    BigInteger resultNumerator;
	    BigInteger resultDenominator;

	    // The denominator of the result is the
	    // product of this object's denominator
	    // and addMe's denominator
	    resultDenominator = this.denom.multiply(addMe.denom);
	    // The numerator is more complicated
	    resultNumerator = (this.num.multiply(addMe.denom)).add(addMe.num.multiply(this.denom));

	    // Return the computed value
	    return new Fraction(resultNumerator, resultDenominator);
	  }// add(Fraction)
/**
 * Subtract the fraction other from this fraction
 */
	 
	  /**
	   * Convert this fraction to a string for ease of printing.
	   */
	  public String toString ()
	  {
	    // Special case: It's zero
	    if (this.num.equals(BigInteger.ZERO)) {
	      return "0";
	    } // if it's zero

	    // Lump together the string represention of the numerator,
	    // a slash, and the string representation of the denominator
	    // return this.num.toString().concat("/").concat(this.denom.toString());
	    return this.num + "/" + this.denom;
	  } // toString()
	} // class Fraction


