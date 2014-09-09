<<<<<<< HEAD
package com.homework.tao.hw2;
=======
package cs207.hw2;
>>>>>>> e83c340039355b60d86d0d43e365f71829df9067

public class PartB {
	/**
	 * Compute the average of two integers. Rounds toward zero if the average is
	 * not a whole number.
	 */
	public static int average(int left, int right) 
  {
	 int average = 0;
	 if(PartA.isOdd(left))
	 {
		average = ((((left-1)/2)+((right-1)/2))+1);
	 }
	 else
	 {
		 average = ((left/ 2) + (right/ 2));
	 }
    return average; 
  } // average(int,int)
} // class PartB