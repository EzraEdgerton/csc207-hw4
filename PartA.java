
public class PartA
{
   /**
    * Determine if a is a multiple of b.
    */
  
  public static boolean isMultiple(long a, long b)
  { //credit to http://www.math.grin.edu/~rebelsky/
    //Courses/CSC207/2014F/assignments/current.html
    // for the layout of the six methods
    if(a%b==0)
      {
        return true;
      }
    else
      return false;
  } // isMultiple(long, long)
  public static boolean isOdd(int i)
  {
    while(Math.abs(i) > 0)
      {
        i=i-2;
      }
    if(i==0)
      {
        return false;
      }
    else 
      return true;
    //return true if i is odd
  } //isOdd(int)
  public static int oddSumTo(int n)
  {
    int sum = 0;
    for (int i = 1; i < n; i++)
      {
        if (isOdd (i))
          {
            sum += i;
          }
      }
    return sum;
    //return the sum of all positive odd numbers < n
  } //oddSumTo(int)
  public static boolean isOddProd(int[] array)
  {
    for (int i = 0; i < array.length-1; i++)
      {
        for (int j = i+1; j < array.length; j++)
          {
            if (isOdd(array[i]*array[j]))
              {
                return true;
              }
          }
      }
    return false;
    //ASK SAM ABOUT THIS ONE AND THE NEXT
    //returns true if any pair of numbers in array has an odd
    //product, otherwise returns false
  } //isOddProd(int[])
  public static boolean allDistinct(int[] array)
  {
    for (int i = 0; i < array.length-1; i++)
      {
        for (int j = i+1; j < array.length; j++)
          {
            if (array[i] == array[j])
              {
                return false;
              }
          }
      }
    return true;
    //although not implemented, should 
    //return true if no 2 elements have equal values
  }//allDistinct(int[])
  public static int[] reverseInts(int[] array)
  {
    if (array.length == 0) return array;
    // {1, 2}
    // temp: 2
    else
      {
        for (int i = 0; i <= array.length/2; i++)
          {
            int tmp = array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=tmp;
          }
        return array;
      }
    
    //although not implemented, should reverse the order
    //of int array values in the same array
  }//reverseInts(int[])
} //class Part A
