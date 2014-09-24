import java.io.PrintWriter;
import java.util.Scanner;

//credit to Sam for validating our ideas and helping us to organize the interface

public class CalculatorInt
{
  public static void main(String[] args) throws Exception
  {
    PrintWriter pen = new PrintWriter(System.out, true);
   // pen.print(Calculator.memory);
    Scanner user_input = new Scanner( System.in );
    String input; 
    
    pen.println("Please enter a mathematical expression or type \"quit\" "
        + "to exit the program: ");
    //input = user_input.next();
    input="2 / 3";
		while (input != "quit")
		{
		  // Send the input to the calculator's evaluate method
		  Fraction result = Calculator.evaluate(input);
		    pen.println(Calculator.memory);
		    pen.println("Output: " + Calculator.evaluate(input));
		    pen.println("Please enter a mathematical expression or type \"quit\" "
        + "to exit the program: ");
		    input = user_input.next();
		} // while
	} // main(String[])
} // class CalculatorInt


/*Questions for Sam
1.why isn't our calculator working w/input 2 / 3:


>Please enter a mathematical expression or type "quit" to exit the program: 
>[Ljava.lang.String;@6bc7c054
>Output: 2/243
>Please enter a mathematical expression or type "quit" to exit the program: 

>w/input 2 + 3 we got 17/1

2. How to read whole line in interface

*/


