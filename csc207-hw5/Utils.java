import java.math.BigDecimal;

public class Utils {

		// +---------+------------------------------------------------------
		// | Methods |
		// +---------+
	//PART A
	/*public static class BigDecimal sqrt(BigDecimal d, BigDecimal epsilon)
	{
		BigDecimal a; //approximation 
		
		while ((d.divide(a, 1, ROUND_HALF_UP).subtract(a)) > epsilon)
		{
			a = (a + d.divide(a, 1, ROUND_HALF_UP))/2;
		} //while
		
		return a;
	} //sqrt(d, epsilon)*/
		
	
	//credit to https://github.com/Grinnell-CSC207/lab-unit-testing/
	//blob/master/src/taojava/labs/testing/SampleMethods.java for the code
	 public static double expt(double x, int p)
	   { 
	     double tmp =x;
	     if (p == 0)
	       {
	         return 1;
	       } // if p is 0
	     // Base case: When p = 1, result is x
	     else if (p == 1)
	       {
	         return x;
	       } // if p is 1
	     // Recursive case: When p is 2k, x^(2k) = (x^k) * (x^k)
	     else if ( p % 2 == 0)
	     {
	    	 for (int counter = 0; counter <= p/2; counter++)
	    	 {
	    		 tmp*=x;
	    	 }
	    	 return tmp*tmp;
	     }
	     else
	     {
	    	 for (int counter = 0; counter <= (p-1)/2; counter++)
	    	 {
	    		 tmp*=x;
	    	 }
	    	 return tmp*tmp*x;
	     }
	   } // expt(double,int)
	 
} //class Utils
