# Int-Arrays
import java.util.ArrayList;

public class CustomerListerArrayList {

 public static void main(String[] args) {
  // Auto-generated method stub
 ArrayList<String> customerName= new ArrayList<String>(); //create array
 customerName.add("Chris");
 customerName.add("Lois");
 customerName.add("Meg");
 customerName.add("Peter");
 customerName.add("Stewie");
 
  for(String element: customerName) //new enhanced for loop to check arraylist
  {
   System.out.println(element); 
     }
  System.out.println("--------------------------");
  
  customerName.add(3,"Meg");
  customerName.add(4,"Brian");
  for(String element: customerName) //new enhanced for loop to check array list
  {
   System.out.println(element); 
     }
  
  for (int i = 0; i < customerName.size(); i++) //for loop to find Meg
  {
   if(customerName.contains("Meg")) //find Meg in list
   {
    customerName.remove("Meg"); //remove Meg from list
    
   }
  }
  System.out.println("----------------------------");
  for(String element: customerName) //new enhanced for loop to check arraylist
  {
   System.out.println(element); 
     }
 }

}


###################################################################################
## CustomerListerArray

###################################################################################
public class CustomerListerArray {
 public static void main(String [] args)
 {
  String[] customerName= new String [7]; //create array
  customerName[0] = "Chris"; //define variables in array
  customerName[1] = "Lois";
  customerName[2] = "Meg";
  customerName[3] = "Pete";
  customerName[4] = "Stewie";

  for(String element: customerName) //enhanced for loop to print array and check it
  {
   System.out.println(element);
     }
 System.out.println("_______________________________"); 
 customerName[5] = customerName[3]; //move elements in the array down
 customerName[6] = customerName[4]; //move elements in the array down
 
    customerName[3] = null; //set variable to null to make it available to move new variables into
    customerName[4] = null; //ditto

  for(String element: customerName) //new enhanced for loop to check array
  {
   System.out.println(element);
     }
 System.out.println("---------------------------------"); //print a separator for different parts of array
  customerName[3] = "Meg"; //insert new element in position 3
  customerName[4] = "Brian"; // insert new element in position 4
  for(String element: customerName) //new enhanced loop to check the array 
  {
   System.out.println(element); //print the array
   
     } 
   System.out.println("__________________________________________");
  modifyArray(customerName); // called modifyArray method
  
  for(String element: customerName) //new enhanced for loop to check array
  {
   System.out.println(element); //print array with meg as null after using new method in main
     }
  
   System.out.println("--------------------------------");

 }
  private static void modifyArray(String[] customer)
  { System.out.println("entered method");
  for (int i = customer.length -1; i > 0; i--)
   
  {  System.out.println(i);
    if (customer[i].equals("Meg")) 
    {
    int j = 0;
     for ( j = i; j < customer.length; j++) 
     {
      if (j+1 < customer.length)
      {
      customer[j] = customer[j + 1];  
      customer[j+1] = null; 
      }
     
     }
    
    
   for(String element: customer) //new enhanced for loop to check array
   {
    System.out.println(element); //print array with meg as null after using new method in main
      }
     
    
    }
  }
  }
}

