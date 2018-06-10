
/**
 * CurrentAccountFrog class is a sub class of parent class Frog.
 * It inherits all of the methods from parent class.
 * 
 * @author (Michal Szynkiewicz) 
 * @version (15/01/17)
 */
import ou.*;

public class CurrentAccountFrog extends Frog implements Taxable
{   
   private CurrentAccount account;
   /**
    * zero-argument constructor for objects of class CurrentAccountFrog
    */
   public CurrentAccountFrog()
   {
     super();
     this.account = new CurrentAccount();
   }
   /**
    * Constructor for objects of class CurrentAccountFrog with five arguments 
    * that will assign all of the attributes for account class.
    */
   public CurrentAccountFrog(String aHolder, String aNumber, 
   double aBalance, double aLimit, String aPin)
   {
      super();
      this.account = new CurrentAccount(aHolder, aNumber, aBalance, aLimit, aPin);
   } 
   
   /**
    * Getter method for account instance variable
    */
   public void getAccount()
   {
      this.account.displayDetails();
   }
   /** 
    * Override method from parent Frog class that  
    * causes the receiver to jump, then croak,
    * then move to right and then to
    * increment flyCount, then credit the 100,
    * change the colour to yellow, jump once again and change
    * the colour to green.
    */
   @Override
   public void catchFly()
   {
      super.jump();
      super.croak();
      super.right();
      super.setFlyCount(super.getFlyCount() + 1);
      this.account.credit(100);
      super.yellow();
      super.jump();
      super.green();
   }
  
   /**
    * Method returns the position of an object.
    */
   public double value()
   {
      return this.getPosition();
   }
   /**
    * Method decrements the position by the value of an argument
    * and returns the argument.
    */
   public double payTax (int taxRate)
   {
      this.setPosition(this.getPosition() - taxRate);
      return taxRate; 
   }
}
