package com.homework.tao.hw2;

public class PartD {

	
	public static String nameGame()
	{ //ask Sam how to generalize input
		String name = new String("Shirley");
		String end = new String();
		String secondLetter = name.substring(1,2);
	    java.io.PrintWriter pen;
	    java.lang.String nameGame;
	    pen = new java.io.PrintWriter(System.out, true);
		if (!secondLetter.equals("a") && !secondLetter.equals("e") && !secondLetter.equals("i") && !secondLetter.equals("o") && !secondLetter.equals("u"))
		{
			end = name.substring(2);
		}
		else 
		{
			end = name.substring(1);
		}
		
	    // Create objects and associate the names with those objects.
		pen.println(secondLetter);
		pen.println(end);
	    nameGame = (name + "!\n" + name + ", " + name + " bo B" + end + 
				" Banana fanna fo F" + end +  "\nFee fy mo M" + end + ", " + name);
	    // Tell one object to do something.
	    pen.println(nameGame);
		
		
		return (name + "!\n" + name + ", " + name + " bo B" + end + 
				" Banana fanna fo F" + end + "Fee fy mo M" + end + ", " + name);

	}
	
	
	public static void main(String [ ] args)
	{
		nameGame();
	}
	
	/*
	 * Evan Bruns (magnificent fellow) helped us by showing us the significance of the main method. 
	 */
}

/*
 * Shirley! 
Shirley, Shirley bo Birley Bonana fanna fo Firley 
Fee fy mo Mirley, Shirley!

Lincoln! 
Lincoln, Lincoln bo Bincoln Bonana fanna fo Fincoln 
Fee fy mo Mincoln, Lincoln!
 * 
 */


