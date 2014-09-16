import java.math.BigInteger;

public class Calculator {
	static public BigInteger eval0(String expression) {
		BigInteger leftExpr;
		BigInteger rightExpr;
		int starter = 0;
		int numLocation = expression.indexOf(' ', starter);
		if (numLocation < 0) {
			numLocation = expression.length();
		}//if
		String strNum = expression.substring(starter, numLocation);
		leftExpr = BigInteger.valueOf(Integer.parseInt(strNum));
		rightExpr = BigInteger.valueOf(0);
		for (int i = 0; i < (StringUtil.countOccurrences(expression, ' ') / 2); i++) {
			starter = numLocation + 3;
			numLocation = expression.indexOf(' ', starter);
			if (numLocation < 0) {
				numLocation = expression.length();
			}//if
			strNum = expression.substring(starter, numLocation);
			rightExpr = BigInteger.valueOf(Integer.parseInt(strNum));
			if (expression.charAt(starter - 2) == '+') {
				leftExpr = leftExpr.add(rightExpr);
			}// if the loop recognizes a +, add
			else if (expression.charAt(starter - 2) == '-') {
				leftExpr = leftExpr.subtract(rightExpr);
			}//else if the loop recognizes a -, subtract
			else if (expression.charAt(starter - 2) == '*') {
				leftExpr = leftExpr.multiply(rightExpr);
			}//else if the loop recognizes a *, multiply
			else if (expression.charAt(starter - 2) == '/') {
				leftExpr = leftExpr.divide(rightExpr);
			}//else if the loop recognizes a /, divide
			else {
				leftExpr = leftExpr.pow(rightExpr.intValue());
			}//else apply a power function
		}//for
		BigInteger result = leftExpr;
		return result;
	}//eval0(String)

	static public Fraction eval1(String expression) {
		Fraction leftExpr;
		Fraction rightExpr;
		int starter = 0;
		int numLocation = expression.indexOf(' ', starter);
		if (numLocation < 0) {
			numLocation = expression.length();
		}//if
		String strNum = expression.substring(starter, numLocation);
		leftExpr = new Fraction(strNum);
		rightExpr = new Fraction("0/1");
		for (int i = 0; i < (StringUtil.countOccurrences(expression, ' ') / 2); i++) {
			starter = numLocation + 3;
			numLocation = expression.indexOf(' ', starter);
			if (numLocation < 0) {
				numLocation = expression.length();
			}//if
			strNum = expression.substring(starter, numLocation);
			rightExpr = new Fraction(strNum);
			if (expression.charAt(starter - 2) == '+') {
				leftExpr = leftExpr.add(rightExpr);
			} // if the loop recognizes a +, add
			else if (expression.charAt(starter - 2) == '-') {
				leftExpr = leftExpr.subtract(rightExpr);
			} //else if the loop recognizes a -, subtract
			else if (expression.charAt(starter - 2) == '*') {
				leftExpr = leftExpr.multiply(rightExpr);
			} //else if the loop recognizes a *, multiply
			else if (expression.charAt(starter - 2) == '/') {
				leftExpr = leftExpr.divide(rightExpr);
			} //else if the loop recognizes a /, divide
			else {
				leftExpr = leftExpr.pow(Integer.parseInt(rightExpr.num
						.toString()));
			}//else apply a power function
		}//for
		Fraction result = leftExpr;
		return result;
	}//eval1(String)

}//class Calculator
