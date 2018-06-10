
/**
 * Intarface class Taxable which have two methods.
 * 
 * @author (Michal Szynkiewicz) 
 * @version (15/01/17)
 */
public interface Taxable
{
   /** 
    * Performs an arbitrary action in response to 'value'.
    */
   public double value();
   /** 
    * Performs an arbitrary action in response to 'payTax'.
    */
   public double payTax(int taxRate);
}
