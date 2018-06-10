
/**
 * Class Rocket - 
 * This class causes a representation of a rocket to be created in the Shapes
 * Window, and for it to move up the screen
 * 
 * @author (M250 Course Team) 
 * @version (2.0)
 */
import ou.*;
public class Rocket
{   
   private Triangle capsule;      // represents the rocket's capsule
   private Square stage3;         // represents the top section of the rocket's fuselage 
   private Square stage2;         // represents the middle section of the rocket's fuselage 
   private Square stage1;         // represents the bottom section of the rocket's fuselage 
   private Triangle fin1;         // represents the rocket's left fin
   private Triangle fin2;         // represents the rocket's right fin
   private Circle jet1;           // represents the blast from the rocket's left engine
   private Circle jet2;           // represents the blast from the rocket's right engine

   
   
   /**
    * Constructor for objects of class Rocket
    */
   public Rocket(Triangle c, Square s1, Square s2, Square s3, Triangle f1, Triangle f2, Circle j1, Circle j2)
   {
      super();
      this.capsule = c;
      this.stage1 = s1;
      this.stage2 = s2;
      this.stage3 = s3;
      this.fin1 = f1;
      this.fin2 = f2; 
      this.jet1 = j1; 
      this.jet2 = j2; 
      this.makeRocket(50,260);
   }
   
   /**
    * Moves the capsule of the receiver to  
    * its initial position.
    */
   public void setInitialPosCapsule(int anXPos, int aYPos)
   {
      this.getCapsule().setXPos(anXPos);
      this.getCapsule().setYPos(aYPos);  
   }
   
   /**
    * Moves the stage3 of the receiver Rocket object to 
    * its position underneath the capsule.
    */
   public void setPosStage3()
   {
      this.getStage3().setYPos(this.getCapsule().getYPos() + 20);
      this.getStage3().setXPos(this.getCapsule().getXPos()); 
   }
    
   
   
   /**
    * Moves the stage2 of the receiver Rocket object to 
    * its position underneath the stage3.
    */
   public void setPosStage2()
   {
      this.getStage2().setYPos(this.getStage3().getYPos() + 20);
      this.getStage2().setXPos(this.getCapsule().getXPos()); 
   }
   
   
   /**
    * Moves the stage1 of the receiver Rocket object to
    * its position underneath the stage2.
    */   
   public void setPosStage1()
   {
      this.getStage1().setYPos(this.getStage2().getYPos() + 20);
      this.getStage1().setXPos(this.getCapsule().getXPos());   
   }
   

   
   /**
    * Moves the left fin of the receiver Rocket object to 
    * its position alongside the stage1.
    */   
   public void setPosFin1()
   {
      this.getFin1().setYPos(this.getStage1().getYPos());
      this.getFin1().setXPos(this.getCapsule().getXPos() - 10);
   }
   
   
   /**
    * Moves the right fin of the receiver Rocket object to 
    * its position alongside the stage1.
    */  
   public void setPosFin2()
   {
      this.getFin2().setYPos(this.getStage1().getYPos());
      this.getFin2().setXPos(this.getCapsule().getXPos() + 10);
   }
   
   
   /**
    * Moves the left jet of the receiver Rocket object to
    * its position underneath the stage1 and sets its diameter
    * to 4 and its colour to black.
    */
   public void setPosJet1()
   {
      //to be written in Q2(b)(i)
      this.jet1.setColour(OUColour.BLACK);
      this.jet1.setDiameter(4);
      this.getJet1().setYPos(this.getStage1().getYPos() + 20);
      this.getJet1().setXPos(this.getStage1().getXPos() - 2);
   }
   

   /**
    * Moves the right jet of the receiver Rocket object to
    * its position underneath the stage1 and sets its diameter
    * to 4 and its colour to black.
    */  
   public void setPosJet2()
   {
      //to be written in Q2(b)(ii)
      this.jet2.setColour(OUColour.BLACK);
      this.jet2.setDiameter(4);
      this.getJet2().setYPos(this.getStage1().getYPos() + 20);
      this.getJet2().setXPos(this.getStage1().getXPos() + 17);
   }

   /**
    * Returns the Triangle object representing the capsule of the receiver Rocket object
    */  
   public Triangle getCapsule()
   {
      return this.capsule;
   }
   
   
   /**
    * Returns the Square object representing the stage1 of the receiver Rocket object
    */  
   public Square getStage1()
   {
      return this.stage1;
   }
   
   
   /**
    * Returns the Square object representing the stage2 of the receiver Rocket object
    */  
   public Square getStage2()
   {
      return this.stage2;
   }
   
     
   
   /**
    * Returns the Square object representing the stage3 of the receiver Rocket object
    */  
   public Square getStage3()
   {
      return this.stage3;
   }
   
   
   /**
    * Returns the Triangle object representing the left fin of the receiver Rocket object
    */ 
   public Triangle getFin1()
   {
      return this.fin1;
   }
   
   
   /**
    * Returns the Triangle object representing the right fin of the receiver Rocket object
    */ 
   public Triangle getFin2()
   {
      return this.fin2;
   }
   
   
   
   /**
    * Returns the Circle object representing the left jet of the receiver Rocket object
    */ 
   public Circle getJet1()
   {
      return this.jet1;
   }
    
   
   /**
    * Returns the Circle object representing the right jet of the receiver Rocket object
    */ 
   public Circle getJet2()
   {
      return this.jet2;
   }
 
   

   /**
    * Moves all the component parts of the rocket into their initial positions 
    */
   public void makeRocket(int anXPos, int aYPos)
   {
      //to be written in Q2(a) & Q2 (b)(iii)
      this.setInitialPosCapsule(50 , 260);
      this.setPosStage3();
      this.setPosStage2();
      this.setPosStage1();
      this.setPosFin1();
      this.setPosFin2();
      this.setPosJet1();
      this.setPosJet2();
   }
   
   
   /**
    * Moves the capsule of the receiver and the jets
    * by anInt units.
    * Moves other rocket components relative to the 
    * position of the capsule.
    */
   public void moveRocketBy(int anInt)
   {
      //to be written in Q2(c)
     this.capsule.setYPos(this.capsule.getYPos() - anInt);
     this.setPosStage3();
     this.setPosStage2();
     this.setPosStage1();
     this.setPosFin1();
     this.setPosFin2();
     this.jet1.setYPos(this.jet1.getYPos() - anInt);
     this.jet2.setYPos(this.jet2.getYPos() - anInt);
   }
   
   
   /**
    * Sets the diameters of the receiver's jets to 
    * 6 and sets their colour to red.
    */
   public void pulse1()
   {
      //to be written in Q2(d)(i)
     this.jet1.setDiameter(6);
     this.jet2.setDiameter(6);
     this.jet1.setColour(OUColour.RED);
     this.jet2.setColour(OUColour.RED);
   }
   
   
   /**
    * Sets the diameters of the receiver's jets to 
    * 12, decrements their xPos by 3 and sets 
    * their colour to orange.
    */      
   public void pulse2()
   {
     //to be written in Q2(d)(ii)
     this.jet1.setDiameter(12);
     this.jet2.setDiameter(12);
     this.jet1.setXPos(this.jet1.getXPos() - 3);
     this.jet2.setXPos(this.jet2.getXPos() - 3);
     this.jet1.setColour(OUColour.ORANGE);
     this.jet2.setColour(OUColour.ORANGE);
   }
   

   /**
    * Sets the diameters of the receiver's jets to 
    * 24, decrements their xPos by 6 and sets 
    * their colour to red.
    */    
   public void pulse3()
   {
     //to be written in Q2(d)(iii)
     this.jet1.setDiameter(24);
     this.jet2.setDiameter(24);
     this.jet1.setXPos(this.jet1.getXPos() - 6);
     this.jet2.setXPos(this.jet2.getXPos() - 6);
     this.jet1.setColour(OUColour.RED);
     this.jet2.setColour(OUColour.RED);
   }
      
   
   /**
    * Simulates the ignition of the rocket's jets
    */
   public void ignition()
   {
     //to be written in Q2(e)
     for(int i = 1; i < 6; i++)
     {
        this.pulse1();
        this.delay(200);
        this.pulse2();
        this.delay(200);
        this.pulse3();
        this.delay(200);
        this.setPosJet1();
        this.setPosJet2();
     }
        
   }



   /**
    * Moves the entire rocket numberOfUnits, one unit at a time 
    */
   public void animateRocket(int numberOfUnits)
   {
     //to be written in Q2(f)
     for(int i = 1 ; i <= numberOfUnits ; i++)
     {
        this.moveRocketBy(1);
        if((i % 4) == 1)
        {
           this.pulse1();
           this.delay(200);
        }
        else if((i % 4) == 2)
              {
                 this.pulse2();
                 this.delay(200);
              }
           else if((i % 4) == 3)
                {
                   this.pulse3();
                   this.delay(200);
                }  
                else if((i % 4) == 0)
                     {
                        this.setPosJet1();
                        this.setPosJet2();
                     }
     }
   }
   
   
   
   /**
    * Prompts the user to enter the number of units they want the  
    * rocket to move upwards.
    * 
    * If the number the units provided would cause the tip of the  
    * capsule to go past the top of the Graphical Display, the user 
    * is informed via a dialogue box that the rocket will not launch.  
    * 
    * Otherwise the rocket launches as required. 
    */
   public void launch()
   {
     //to be written in Q2(g)
     int anUnit = Integer.parseInt(OUDialog.request("Enter the positive number that rocket will go upwards")) ;
     if(anUnit > 260)
      {
         OUDialog.alert("Rocket will not start because the number you enter was too large");
      }
     else
      {
        this.ignition();
        this.animateRocket(anUnit);
      }
   }

     
   
   
   
   
   
   /**
    * Causes execution to pause by time number of milliseconds
    */
   public void delay(int time)
   {
      try
      {
         Thread.sleep(time); 
      }
      catch (Exception e)
      {
         System.out.println(e);
      } 
   }
   
}   
   
 


