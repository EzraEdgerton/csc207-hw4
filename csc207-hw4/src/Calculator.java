import java.math.BigInteger;


public class Calculator {
    static public BigInteger eval0 (String expression)
    {
	BigInteger leftExpr;
	BigInteger rightExpr;
	int starter = 0;
	int numLocation = expression.indexOf(' ', starter);
	if(numLocation < 0){
	    numLocation = expression.length();
	}
	String strNum = expression.substring(starter, numLocation);
	leftExpr = BigInteger.valueOf(Integer.parseInt(strNum));
	rightExpr = BigInteger.valueOf(0);
	for (int i=0; i < (StringUtil.countOccurrences(expression,  ' ')/2); i++)
	{
	    starter = numLocation+3;
	    numLocation = expression.indexOf(' ', starter);
	    if(numLocation < 0){
		    numLocation = expression.length();
		}
	    strNum = expression.substring(starter, numLocation);
	    rightExpr = BigInteger.valueOf(Integer.parseInt(strNum));
	    if (expression.charAt(starter-2) == '+')
	    {
	    leftExpr = leftExpr.add(rightExpr);
	    }
	    else if (expression.charAt(starter-2) == '-')
	    {
		leftExpr = leftExpr.subtract(rightExpr);
	    }
	    else if (expression.charAt(starter-2) == '*')
	    {
		leftExpr = leftExpr.multiply(rightExpr);
	    }
	    else if (expression.charAt(starter-2) == '/')
	    {
		leftExpr = leftExpr.divide(rightExpr);
	    }
	    else
	    {
		leftExpr = leftExpr.pow(rightExpr.intValue());
	    }	
	}
	BigInteger result = leftExpr;
	return result;
    }
    
    static public Fraction eval1 (String expression)
    {
	Fraction leftExpr;
	Fraction rightExpr;
	int starter = 0;
	int numLocation = expression.indexOf(' ', starter);
	if(numLocation < 0){
	    numLocation = expression.length();
	}
	String strNum = expression.substring(starter, numLocation);
	leftExpr = new Fraction(strNum);
	rightExpr = new Fraction("0/1");
	for (int i=0; i < (StringUtil.countOccurrences(expression,  ' ')/2); i++)
	{
	    starter = numLocation+3;
	    numLocation = expression.indexOf(' ', starter);
	    if(numLocation < 0){
		    numLocation = expression.length();
		}
	    strNum = expression.substring(starter, numLocation);
	    rightExpr = new Fraction(strNum);
	    if (expression.charAt(starter-2) == '+')
	    {
	    leftExpr = leftExpr.add(rightExpr);
	    }
	    else if (expression.charAt(starter-2) == '-')
	    {
		leftExpr = leftExpr.subtract(rightExpr);
	    }
	    else if (expression.charAt(starter-2) == '*')
	    {
		leftExpr = leftExpr.multiply(rightExpr);
	    }
	    else if (expression.charAt(starter-2) == '/')
	    {
		leftExpr = leftExpr.divide(rightExpr);
	    }
	    else
	    {
		leftExpr = leftExpr.pow(Integer.parseInt(rightExpr.num.toString()));
	    }	
	}
	Fraction result = leftExpr;
	return result;
    }
    

}
