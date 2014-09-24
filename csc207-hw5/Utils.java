import java.math.BigDecimal;

//credit to http://www.tutorialspoint.com/java/math/bigdecimal_compareto.htm
//credit to http://www.tutorialspoint.com/java/math/bigdecimal_abs.htm

public class Utils
{

  // +---------+------------------------------------------------------
  // | Methods |
  // +---------+

  //credit to https://github.com/Grinnell-CSC207/lab-unit-testing/
  //blob/master/src/taojava/labs/testing/SampleMethods.java for the code
  //PART A
  public static BigDecimal sqrt(BigDecimal d, BigDecimal epsilon)
  {
    BigDecimal a = d; //approximation
    while (epsilon.compareTo(((d.divide(a, 1, BigDecimal.ROUND_HALF_DOWN).subtract(a))).abs()) == -1)
      {
        a = (a.add(d.divide(a, 1, BigDecimal.ROUND_HALF_DOWN)));
        a = (a.divide(BigDecimal.valueOf(2)));
      } //while
    return a;
  } //sqrt(d, epsilon)*/

  //PART B
  public static double expt(double x, int p)
  {
    double tmp = x;

    if (p == 0)
      {
        return 1;
      } // if p is 0
    else if (p == 1)
      {
        return x;
      } // if p is 1
    else
      {
        while (p > 1)
          {
            tmp *= x;
            p -= 1;
          }
        return tmp;
      } // else if p is > 1
  } // expt(double,int)
} //class Utils