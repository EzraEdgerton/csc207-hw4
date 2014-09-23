import java.math.BigInteger;
import java.io.PrintWriter;

/**
 * An implementation of a simple calculator.
 *
 * @author Ajuna Kyaruzi and Hattie Zucker 
 *@Updated by Hattie Zucker, Tommy Pitcher, and Amanda Hinchman-Dominguez
 */
public class Calculator
	//implements CalculatorInt
{
  // +---------+------------------------------------------------------
  // | Methods |
  // +---------+


  public static Fraction evaluate(String expression)
  {
	  PrintWriter pen = new PrintWriter (System.out, true);
    //Split input into array
    String[] array = expression.split(" +");
    String[] memory = {"r0","r1", "r2","r3","r4","r5","r6","r7"};
    //if array is empty, then return 0/1
    if (array.length == 0)
      return (new Fraction(0, 1));

    Fraction result = new Fraction(array[0]);
    
    //ask user to make an input of expression
    //http://stackoverflow.com/questions/5287538/how-to-get-basic-user-input-for-java
    for (int i = 0; i < expression.length(); i++)
    {
    	if (expression.charAt(i) == 'r') //if there is an expression
    	{
    		char num = expression.charAt(i+1);
    		if (num == 0 || num == 1 || num == 2 || num == 3 ||
    				num == 4 || num == 5 || num == 6 || num == 7)
    		{
    			String rPart = expression.substring(i,i+2);
    			rPart = memory[num];
    			String expression2 = "";//make a new version of expression
    			 //move through array performing indicated operations
    		    String[] array2 = expression2.split(" +");
    		    //ERROR EXPRESSION2 NEEDS A LOCAL VARIABLE
        	    for (int j = 1; j < array.length; j++)
        	      {
        	        if ((array2[j].compareTo("+")) == 0)
        	          {
        	            Fraction next = new Fraction(array2[j + 1]);
        	            result = result.add(next);
        	            j++;
        	            // some procedure that will mutate the array
        	          }// if adding fractions
        	        if ((array2[j].compareTo("-")) == 0)
        	          {
        	            Fraction next = new Fraction(array2[j + 1]);
        	            result = result.subtract(next);
        	            j++;
        	          }// if subtracting fractions
        	        if ((array2[j].compareTo("*")) == 0)
        	          {
        	            Fraction next = new Fraction(array2[j + 1]);
        	            result = result.multiply(next);
        	            j++;
        	          }// if multiplying fractions
        	        if ((array2[j].compareTo("/")) == 0)
        	          {
        	            Fraction next = new Fraction(array2[j + 1]);
        	            result = result.divide(next);
        	            j++;
        	          }// if dividing fractions
        	        if ((array2[j].compareTo("^")) == 0)
        	          {
        	            int next2 = Integer.parseInt(array[j + 1]);
        	            result = result.pow(next2);
        	            j++;
        	          }// if using exponents on fractions
        	      }//for loop	
    		}
    	}
    	else //evaluate the expression
    	{
    	    //move through array performing indicated operations
    	    for (int j = 1; j < array.length; j++)
    	      {
    	        if ((array[j].compareTo("+")) == 0)
    	          {
    	            Fraction next = new Fraction(array[j + 1]);
    	            result = result.add(next);
    	            j++;
    	            // some procedure that will mutate the array
    	          }// if adding fractions
    	        if ((array[j].compareTo("-")) == 0)
    	          {
    	            Fraction next = new Fraction(array[j + 1]);
    	            result = result.subtract(next);
    	            j++;
    	          }// if subtracting fractions
    	        if ((array[j].compareTo("*")) == 0)
    	          {
    	            Fraction next = new Fraction(array[j + 1]);
    	            result = result.multiply(next);
    	            j++;
    	          }// if multiplying fractions
    	        if ((array[j].compareTo("/")) == 0)
    	          {
    	            Fraction next = new Fraction(array[j + 1]);
    	            result = result.divide(next);
    	            j++;
    	          }// if dividing fractions
    	        if ((array[j].compareTo("^")) == 0)
    	          {
    	            int next2 = Integer.parseInt(array[j + 1]);
    	            result = result.pow(next2);
    	            j++;
    	          }// if using exponents on fractions
    	      }//for loop
    	}//else
    }//for
    
    pen.println(memory);//ERROR UNREACHABLE CODE
    pen.println("Where do you want this information stored?");
    //input for any number between 0 and 7
    //scan
    //memory[num] = result;
    
    return result;
  }// eval1 (String)

  
	
}
