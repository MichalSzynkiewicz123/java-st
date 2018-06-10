
/**
 * Class Runner - Simulates a runner in a Marathon.
 * 
 * @author M250 Course Team 
 * @version Version 2.0
 */
public class Runner implements Comparable<Runner>
{
/* static variables */
  
// To be added by students in Question 4, part (i)(a) 
   private static int nextNumber = 1;
/* instance variables */
     
   private int number;       // runner's number
   private String name;      // runner's name
   private String ageGroup;  // standard, junior or senior
   private int time;         // runner's marathon time in minutes
 
   
   /**
    * Default constructor for objects of class Runner.
    */
   public Runner()
   {
      super();
      this.name = "";
      this.ageGroup = "standard";
      this.time = 0;
      
    // additional code to be added by students in Q4, part (i)(b)
      this.number = nextNumber;
      ++nextNumber;
    }

/* instance methods */

    //Only those accessor methods that you will need have been included
        
   /**
    * Returns the receiver's number.
    */
   public int getNumber()
   {
      return this.number;
   }
   
   
   /**
    * Sets the receiver's name.
    */
   public void setName(String aName)
   {
      this.name = aName;
   }
   
   
   /**
    * Returns the receiver's name.
    */
   public String getName()
   {
      return this.name;
   }
   
   
   /**
    * Sets the receiver's ageGroup.
    */
   public void setAgeGroup(String group)
   {
      this.ageGroup = group;
   }

   /**
    * Returns the receiver's ageGroup.
    */
   public String getAgeGroup()
   {
      return this.ageGroup;
   }
    
   
   /**
    * Sets the receiver's time.
    */
   public void setTime(int aTime)
   {
      this.time = aTime;
   }
   
   
   /**
    * Returns the receiver's time.
    */
   public int getTime()
   {
      return this.time;
   }
   
   /**
    * Method that compares instances of Runner by time.
    */
   public int compareTo(Runner aRunner)
   {
      return (this.getTime() - aRunner.getTime());
   }
}
