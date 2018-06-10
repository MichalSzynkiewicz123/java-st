import java.util.*;
/**
 * The class MotherBoardsMap is used to hold data about a collection of motherboards.
 * 
 * @author (Michal Szynkiewicz) 
 * @version (23/04/17)
 */
public class MotherBoardsMap
{
   private List <Motherboard> aList;
   private Map <String , List<Motherboard>> motherboards;

   /**
    * Constructor for objects of class MotherBoardsMap
    * motherboards is assigned to empty TreeMap.
    * aList is assigned to empty ArrayList.
    */
   public MotherBoardsMap()
   {
      this.aList = new ArrayList<>();
      this.motherboards = new TreeMap<>();
   }
   
   /**
    * Method that populates map and list with test data.  
    */
   public void addMotherboardList()
   {
      this.aList.add(new Motherboard("GAMING M7","ATX",1151));
      this.aList.add(new Motherboard("GAMING M6 AC","ATX",1150));
      this.aList.add(new Motherboard("GAMING M3","ATX",1155));
      
      this.motherboards.put("Z270" , aList);
      this.aList = new ArrayList<>();
      
      this.aList.add(new Motherboard("GAMING M3","ATX",1151));
      this.aList.add(new Motherboard("GAMING PRO CARBON","ATX",1150));
      
      this.motherboards.put("H270" , aList);
      this.aList = new ArrayList<>();

      this.aList.add(new Motherboard("E33","M-ATX",1155));
      this.aList.add(new Motherboard("E31","M-ATX",1151));
      
      this.motherboards.put("B75MA" , aList);
      this.aList = new ArrayList<>();
      
      this.aList.add(new Motherboard("GAMING 9 ACK","ATX",1150));
      this.aList.add(new Motherboard("GAMING 9 AC","ATX",1151));
      this.aList.add(new Motherboard("G55 SLI","ATX",1155));
      
      this.motherboards.put("Z97" , aList);
   }
   
   /**
    * Method iterates over map key and prints all of the motherboards 
    * with textual representation of theirs attributes.  
    */
   public void printMap()
   {
      for(String aKey : this.motherboards.keySet())
      {
         System.out.println("Chipset " + aKey + "\n" + this.motherboards.get(aKey));        
      }
   }
   
   /**
    * Prints value of the map associated with the given key.
    * @param aKey must be a name of the chipset 
    * if the chipset is not in the map the output will announce
    * that chipset does not exist.
    */
   public void printMapValue(String aKey)
   {
      if(this.motherboards.containsKey(aKey))
      {
         System.out.println("Motherboards with chipset " + aKey + ":\n" 
                             + this.motherboards.get(aKey));
      }
      else
      {
         System.out.println("Motherboards with chipset " + aKey + " not exist.");
      }
   }
   
      /**
    * Takes two arguments that are added to the map.
    * @param aKey needs to be name of the chipset added as a key to map.
    * @param aList needs to be a list of motherboard object that has the same chipset.
    */
   public void addMapEntry(String aKey , List <Motherboard> aList)
   {
      this.motherboards.put(aKey , aList);
   }
   
   /**
    * Takes single argument represented by key and deletes the value from map
    * that is associated with.
    * @param aKey needs to be the name of chipset that we would like to delete from map.
    * @return true or false to indicate success or failure of deleting process.
    */
   public boolean deleteEntry(String aKey)
   {
      if(this.motherboards.containsKey(aKey))
      {
         this.motherboards.remove(aKey);
         return true;
      }
      else return false;
   }
   
   /**
    * Adds a new motherboard object to the List of motherboards for a particular key.
    * @param aKey needs to be a name of the chipset in collection of map.
    * @param aName value of attribute name of the motherboard object.
    * @param aFormFactor value of attribute formFactor of the motherboard object.
    * @param aSocket value of attribute socket of the motherboard object.
    */
   public void addValue(String aKey , String aName , String aFormFactor , int aSocket)
   {
     this.aList = new ArrayList<>(this.motherboards.get(aKey));
     this.aList.add(new Motherboard(aName,aFormFactor,aSocket));
     this.motherboards.put(aKey , aList); 
   }
   
   /**
    * Deletes a particular motherboard object from the List of motheboards for a particular key.
    * @param aKey needs to be a name of the chipset in collection of map.
    * @param aName needs to be a name of the motherboard that we want to delete.
    */
   public void deleteValue(String aKey , String aName)
   {
     this.aList = new ArrayList<>(this.motherboards.get(aKey));
     for(int i = 0 ; i < aList.size() ; i++)
     {
        if(aName.equals(aList.get(i).getName()))
        {
           aList.remove(i);
        } 
     }
     this.motherboards.put(aKey , aList);
   }
   
   /**
    * Returns a List of all the motherboards in map that have the same socket attribute.
    * @param aSocket which is an attribute of the motherboad object.
    * @return List of motherboards that have specified socket.
    */
   public List <Motherboard> selectValues(int aSocket)
   {
     List <Motherboard> list = new ArrayList<>();
     for(String aKey : this.motherboards.keySet())
     {
      this.aList = new ArrayList<>(this.motherboards.get(aKey));
      for(int i = 0 ; i < aList.size() ; i++)
      {
         if(aSocket == aList.get(i).getSocket())
         {
            list.add(aList.get(i));
         } 
      }
     }
     return list;
   }
   
}
