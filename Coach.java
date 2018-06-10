import ou.*;
/**
 * Instances of the Coach class orchestrate repetitions of sprinting
 * for two FitnessFrog objects, sporty1 and sporty1.
 * 
 * @author M250 Module Team 
 * @version 1.4
 */

public class Coach
{
   // instance variables
   private FitnessFrog sporty1;
   private FitnessFrog sporty2;

   /**
    * Constructor for objects of class Coach.
    */
   public Coach(FitnessFrog fitnessFrog1, FitnessFrog fitnessFrog2)
   {
      super();
      this.sporty1 = fitnessFrog1;
      this.sporty2 = fitnessFrog2;
   }

   /**
    * Getter for sporty1.
    */
   public FitnessFrog getSporty1()
   {
      return this.sporty1;
   }  

   /**
    * Getter for sporty2.
    */
   public FitnessFrog getSporty2()
   {
      return this.sporty2;
   }   
      
   /**
    * Returns the number of repetitions (between 1 and 5 inclusive)
    * specified by the user via a dialogue box.
    * If the entered value is incorrect the Exception is handled by try catch handler.
    */
   private int getNumberRepetitions()
   {
      String repetitionString;
      int repetitions = 0;
      boolean again = true;

      while (again)
      {
         repetitionString =
          OUDialog.request("Enter the number of repetitions for the training session");
         try
         {
            repetitions = Integer.parseInt(repetitionString);
            if ((repetitions < 1) || (repetitions > 5))
            {
               OUDialog.alert("Entered value is outside range (between 1 and 5 inclusive)");
            }
            else
            {
               again = false;
            }
          }
          catch(NumberFormatException anExeption)
          {
             OUDialog.alert("Enterend value is incorrect or it cannot be converted to integer.");
          }
      }
      return repetitions;
   }    
   
   /**
    * To do for Part (a)
    * 
    * Changes the colour of the Fitness Frog that has run the farthest to
    * yellow and croaks once. Returns no value.
    */
   private void announceFittestFrog()
   {
      // Write your code here
      if(this.sporty1.getTotalDistanceSprinted() > this.sporty2.getTotalDistanceSprinted())
      {
         this.sporty1.setColour(OUColour.YELLOW);
         this.sporty1.croak();
      }
      else
      {
         this.sporty2.setColour(OUColour.YELLOW);
         this.sporty2.croak();
      }
   }
   
   /**
    * First checks if both Fitness Frogs are currently positioned on the running
    * track (black stones numbered 1 to 11). If so, readys the Fitness Frogs for
    * sprinting. Next requests the user for the number of repetitions via a dialogue
    * box. Then enters a loop whose length is equal to the number of repetitions.
    * On each iteration, gets each Fitness Frog to sprint in turn. Finally, announces
    * which of the Fitness Frogs has sprinted the furthest. Returns no value.
    */
    public void train()
    {
       if(this.isOnBlackStones(sporty1) && this.isOnBlackStones(sporty2))
       {
          int repetitions = 0;      

          this.getSporty1().resetTotalDistanceSprinted();
          this.getSporty2().resetTotalDistanceSprinted();
          repetitions = this.getNumberRepetitions();
          for (int count = 1; count <= repetitions; count++)
          {
             this.getSporty1().sprint();
             this.getSporty2().sprint();
          }
          this.announceFittestFrog();
      }
    }
   
   /**
    * Helper method that checks whether the frog is on black stone.
    * If the frog is on black stone method returns true if not return false.
    */
   private boolean isOnBlackStones(FitnessFrog aFitnessFrog)
   {
      int pos = aFitnessFrog.getPosition();
      if(pos >= 1 && pos <= 11)
      {
         return true;
      }
      else 
      {
         return false;
      }
   }
}