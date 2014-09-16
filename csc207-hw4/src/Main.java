import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;


public class Main {
	
	public static void main(String[] args)
		throws Exception
	{
	//	BigInteger num = new BigInteger("2");
	//	BigInteger denom = new BigInteger("4");
	//	Fraction test = new Fraction("3/9");
	//	Fraction test = new Fraction(num, denom);
	//	StringUtil.splitAt("Wow",'d');
	//	StringUtil.splitAt("a:b:c", ' ');
		String thing = "1 + 3 * 3";
		PrintWriter pen = new PrintWriter (System.out, true);
	//	pen.println(Arrays.toString(StringUtil.splitAt("a,\"b,b\"\"\",c", ',')));
		pen.println(Calculator.eval0(thing));
		pen.close();
	}
	}


