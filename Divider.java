
/**
 * Write a description of class Divider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Divider
{
   // instance variables - replace the example below with your own
   private int divisor;
   /**
    * Constructor for objects of class Divider
    */
   public Divider()
   {
      // initialise instance variables
      divisor = 2;
   }
   /**
    * Puglic getter method for divisor instance variable
    */
   public int getDivisor()
   {
      return this.divisor;
   }
   /**
    * Public setter method for divisor 
    * instance variable but given variable must not be equal zero
    */
   public void setDivisor(int aDivisor)
   {
      if(aDivisor != 0)
      {
      this.divisor = aDivisor;
      }
   }
   /**
    * The divide methot that take argument of double
    * and divide by divisor and return the double argument
    */
   public double divide(double aDivide)
   {
      return aDivide/this.divisor;
   }
   /**
    * Method that is taking the number and dividing it will 
    * print is it negative positive or is equal zero
    */
   public void  printSign(double aNumber)
   {
      double quotient = this.divide(aNumber);
      if(quotient == 0)
      {
         System.out.print("The quotient is zero\n");
      }
      else
      {
         if(quotient > 0)
         {
            System.out.print("The quotient is positive\n");
         }
         else
         {
            System.out.print("The quotient is negative\n");
         }
      }
   }

}
