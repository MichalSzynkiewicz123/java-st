
/**
 * Objects of the PersonalComputer class model real-world PC
 * that have attributes representing serial number,
 * processor, launched value and whether or not 
 * the computer is turned of or on.
 * 
 * PersonalComputer is an example of a composite class.
 * 
 * An object of the PersonalComputer class
 * has-an object of the Processor class,
 * which represents the processor component of the PC.
 *
 * The value of itWillWork is computed and true is returned 
 * if processors method components return true. This is an
 * example of state-dependent behaviour.
 * itWillWork is not represented by an instance variable.
 * 
 * @author (Michal Szynkiewicz) 
 * @version (08.10.2017)
 */
public class PersonalComputer
{
   //instance variables
   private String serialNumber;  // a personal computer has a serial number (Ex. T1234OP). 
   private boolean launched;  // every computer has to have a state that is on or off.
   private Processor processor;  // every computer has a proceessor.
   /**
    * Constructor for objects of class PersonalComputer
    * allowing specification of all the required attributes.
    */
   public PersonalComputer(String aSerialNumber, 
                           Processor aProcessor)
   {
      this.serialNumber = aSerialNumber; 
      this.processor = aProcessor; 
      this.launched = false; 
      
   }
   /**
    * Constructor for objects of class PersonalComputer,
    * where we do not know the serial number 
    * or does it have any processor,
    * but we know that the object exists.
    */
   public PersonalComputer()
   {
      this.serialNumber = null;//null indicates an unknown serial number
      this.processor = new Processor();// creates new processor without values.
      this.launched = false;//false indicates that computer is off
   }
   /**
    * Getter for a computer serial number.
    * This method returns "Unknown" if the serial number
    * is not known (i.e. it has not been set).
    */
   public String getSerialNumber()
   {
       if (this.serialNumber == null)
      {
         return "Unknown";
      }
      return this.serialNumber;
   }
   /**
    * Setter for a computer serial number.
    */
   public void setSerialNumber(String aSerialNumber)
   {
      this.serialNumber = aSerialNumber;
   }
   /**
    * Getter for a launched variable, returns state.
    * Is computer turned on? (false or true)
    */
   public boolean getLaunch()
   {
      return this.launched;
   }
   /**
    * Setter for a computer launch.
    * Can be set for true or false.
    */
   public void setLaunch(boolean aLaunched)
   {
     this.launched = aLaunched;
   }
   /**
    * Setter that sets computer launch to true.
    */
   public void launch()
   {
      this.launched = true;
   }
   /**
    * Setter that sets computer launch to false.
    */
   public void shutdawn()
   {
      this.launched = false;
   }
   /**
    * Getter for a personal computer components requirements
    * to work.
    * This method displays state-dependent behaviour:
    * The value returned depends on part of the state
    * of the instance variable which reference to instance 
    * of processor class that returns state.
    * If the returned state of the processor class
    * have all of the components to run the PC
    * it returns true. Otherwise false is returned.
    */
   public boolean itWillWork()
   {
      return this.processor.components();
   }
   
   /**
    * Returns a string describing this object.
    */
   public String toString()
   {
      return "Serial number: " + this.getSerialNumber() + "\nIs it launched: " + this.getLaunch()
               + "\nProcessor details: " + this.processor.toString();                
   }  
}
