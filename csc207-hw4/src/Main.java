import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		// BigInteger num = new BigInteger("2");
		// BigInteger denom = new BigInteger("4");
		// Fraction test = new Fraction("2/5");
		// Fraction test = new Fraction(num, denom);
		// StringUtil.splitAt("Wow",'d');
		// StringUtil.splitAt("a:b:c", ' ');
		String thing = "1/2 + 1/4 - 2/3 ^ -4";
		PrintWriter pen = new PrintWriter(System.out, true);
		// pen.println(Arrays.toString(StringUtil.splitAt("a,\"b,b\"\"\",c",
		// ',')));
		pen.println(Calculator.eval1(thing));
		// pen.println(test.pow(5));
		pen.close();
	}//main(String)
}//class Main
