import java.util.*;
/**
 * The class Garage is used to hold data about a collection of customers. 
 * 
 * @author M250 module team
 * @version 1.0
 */
public class Garage
{
   private Map<String, Customer> customer;
   
   /**
    * Constructor for objects of class Garage
    * Costumer is assigned to empty HashMap.
    */
   public Garage()
   {
       this.customer = new HashMap<>();
   }
   
   /**
    * Method that creates instance of Customer class and adds this object to 
    * Map interface.
    */
   public void addCustomer(String regNo, String name, String address, int area)
   {
      Customer custom = new Customer(name , address , area);
      this.customer.put(regNo , custom);
   }
   
   /**
    * Method that prints all of the customers that are added to the Map
    */
   public void printCustomers()
   {
    for(String aKey : this.customer.keySet())
    {
      System.out.println(this.customer.get(aKey));
    }
   }
   
   /**
    * Method that searches through the Map for customer with corresponding registration number.
    * If the registration number exists it returns the customer details.
    * If registration number is not in the map then it returns a message and null.
    */
   public Customer findCustomerWithReg(String regNum)
   {
      if(this.customer.containsKey(regNum))
      {
         return this.customer.get(regNum);
      }
      else
      {
         System.out.println("Costumer with registration number " + regNum + " not exist.");
         return null;
      }
   }
   /**
    * Method will find the customer in map with area specified earlier 
    * and add him to created set which will be returned.
    */
   public Set findCustomersInArea(int area)
   {
      Set<Customer> areaSetCust = new HashSet<>();
      for(String i : this.customer.keySet())
      {
        Customer a = this.customer.get(i);
        if(a.getArea() == area)
        {
           areaSetCust.add(this.customer.get(i));
        }
      }  
      return areaSetCust;
   }
}
