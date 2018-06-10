
/**
 * The class Motherboard represents motherboards - with name, formFactor and socket that describe the motherboard.
 * 
 * @author (Michal Szynkiewicz) 
 * @version (26/04/17)
 */
public class Motherboard
{
   
   private String name;
   private String formFactor;
   private int socket;

   /**
    * Constructor for objects of class Motherboard
    */
   public Motherboard(String aName ,String aformFactor , int aSocket )
   {
      this.name = aName;
      this.formFactor = aformFactor;
      this.socket = aSocket;
   }
   
   public String getName()
   {
      return this.name;
   }
   public String getFormFactor()
   {
       return this.formFactor;
   }
   public int getSocket()
   {
       return this.socket;
   }
   public String toString()
   {
      return ("\nName: " + this.getName() + " Form Factor: " +  this.getFormFactor() 
                         + " Socket: " + this.getSocket());
   }
}
