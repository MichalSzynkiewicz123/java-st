import java.util.*;
import java.io.*;
import ou.*;
/**
 * Write a description of class MarathonAdmin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MarathonAdmin
{
   
   private List<Runner>runners;
   private Map <String , Integer> juniorResults;
   private Map <String , Integer> standardResults;
   private Map <String , Integer>  seniorResults;


   /**
    * Constructor for objects of class MarathonAdmin
    */
   public MarathonAdmin()
   {
      runners = new ArrayList<>();
      juniorResults = new TreeMap<>();
      standardResults = new TreeMap<>();
      seniorResults = new TreeMap<>();
   }
   
   /**
    * Method that reads names of runners from a specified file.
    * Next creating the object based on runner name and age group them to 
    * age groups.
    * Finally create runner is added to an ArrayList.
    */
   public void readInRunners()
   {
      String pathName = OUFileChooser.getFilename();
      File aFile = new File(pathName);
      Scanner bufferScanner = null;
      String name;
      Integer age;
      String ageGroup;
      try
      {
         bufferScanner = new Scanner(new BufferedReader(new FileReader (aFile)));
         String line;
         Scanner lineScanner; 
         while(bufferScanner.hasNextLine())
         {
            line = bufferScanner.nextLine();
            lineScanner = new Scanner(line);
            lineScanner.useDelimiter(",");
            name = lineScanner.next();
            age = lineScanner.nextInt();
            Runner aRunner = new Runner();
            aRunner.setName(name);
            if(age < 18)
            {
              aRunner.setAgeGroup("junior");
            }
            else if(age > 55)
            {
              aRunner.setAgeGroup("senior");
            }
            runners.add(aRunner);
         }
      }
      catch (Exception anException)
      {
         System.out.println("Error " + anException);
      }
      finally
      {
         try
         {
            bufferScanner.close();
         }
         catch(Exception anException)
         {
            System.out.println("Error " + anException);
         }
      }
   }
   
   /**
    * Method that iterates through the list of runners and assigns the random time to each runner.  
    */
   public void runMarathon()
   {
     Random generator = new Random();
     for(Runner aRunner : runners)
     {
        aRunner.setTime(generator.nextInt(91) + 90); 
     }
   }
   
   /**
    * Method that is using collection class to sort runners starting from fastest time.
    */
   public void sortRunnerList()
   {
      Collections.sort(runners);
   }
   
   /**
    * Method that categorises runners taking the age group and puts them to equivalent map.
    */
   public void categorise()
   {
      for(Runner aRunner : runners)
     {
        if(aRunner.getAgeGroup().equals("junior"))
        {
           juniorResults.put(aRunner.getName() , aRunner.getTime());
        }
        else if(aRunner.getAgeGroup().equals("standard"))
        {
           standardResults.put(aRunner.getName() , aRunner.getTime());
        }
        else if(aRunner.getAgeGroup().equals("senior"))
        {
           seniorResults.put(aRunner.getName() , aRunner.getTime());
        }
     }
   }
}
