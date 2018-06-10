
/**
 * Processor represents an artist such as Intel Pentium I5.
 * It hs a version, number of cores , number of base frequency
 * and a graphic card.
 * To run a PC, the components: cores, base frequency 
 * and graphics should be filled.   
 *
 * @author (Michal Szynkiewicz) 
 * @version (08/01/17)
 */
public class Processor
{
   private int cores;//Number of independent central processing units in a single computing component (Ex. 4).
   private int baseFrequency;//Rate at which the processor's transistors open and close (Ex. 3).
   private String version;//Version of processor (Ex. i7).
   private String graphics;//Name of graphics (Ex. intel 500).
   
   /**
    * A constructor for objects of class Processor
    * if we know all of the attributes.
    */
   public Processor(int aCores,int aBaseFrequency,
                    String aVersion,  String aGraphics)
   {
      this.cores = aCores;
      this.baseFrequency = aBaseFrequency; 
      this.version = aVersion;
      this.graphics = aGraphics;
   }
   
   /**
    * zero-argument constructor:
    * if we don’t know the processor's attributes.    
    */
   public Processor()
   {
      this.cores = 0;
      this.baseFrequency = 0; 
      this.version = null;
      this.graphics = null;
   }

   /**
    * Setter for a processor's number of cores.
    */
    public void setCores(int aCores)
   {
      this.cores = aCores;
   }
   
   /**
    * Getter for a processor's number of cores.
    */
    public int getCores()
   {
      return this.cores;
   }
   
   /**
    * Setter for a processor's number of base frequency.
    */
   public void setBaseFrequency(int aBaseFrequency)
   {
      this.baseFrequency = aBaseFrequency;
   }
   
   /**
    * Getter for a processor's number of base frequency.
    */
   public int getBaseFrequency()
   {
     return this.baseFrequency;
   }
   
   /**
    * Setter for a processor's version.
    */
   public void setVersion(String aVersion)
   {
      this.version = aVersion;
   }
   
   /**
    * Getter for a processor's version.
    */
    public String getVersion()
   {
     return this.version;
   }
   
   /**
    * Setter for a processor's name of graphic card.
    */
   public void setGraphics(String aGraphics)
   {
      this.graphics = aGraphics;
   }
   
   /**
    * Getter for a processor's name of graphic card.
    */
   public String getGraphics()
   {
      return this.graphics;
   }
   
   /**
    * Getter for a processor's components state.
    * This method displays state-dependent behaviour:
    * The value returned depends on part of the state
    * of the receiver. If the receiver's cores are bigger than 0
    * and base frequency is bigger than 0 
    * and graphic is not equal null then true is returned.
    * Otherwise false is returned
    */
   public boolean components()
   {
      return (this.getCores() > 0)&&(this.getBaseFrequency() > 0) && (this.getGraphics() != null);
   }
   
   /**
    * Returns a description of this object as a string.
    */
   public String toString()
   {
      return "\nVersion: " + this.getVersion() + "\nGraphics: " + this.getGraphics()
               + "\nCores: " + this.getCores() + "\nBase frequency: " + this.getBaseFrequency();                
   }  
}
