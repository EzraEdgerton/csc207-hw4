import java.io.PrintWriter;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args)
		throws Exception
	{
	//	BigInteger num = new BigInteger("2");
	//	BigInteger denom = new BigInteger("4");
		Fraction test = new Fraction("17");
	//	Fraction test = new Fraction(num, denom);
		PrintWriter pen = new PrintWriter (System.out, true);
		pen.println(test.negate());
		pen.close();
	}
	}


