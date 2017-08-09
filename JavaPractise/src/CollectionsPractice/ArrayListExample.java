package CollectionsPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String args[]){
		
// Creating ArrayList 
		ArrayList<String> al=new ArrayList<String>();
		
//Adding elements to the ArrayList
		al.add("Venkat");
		al.add("Naveen");
		al.add("Srikant");
		al.add("Anuradha");
		al.add("VenkateswraRao");
		 System.out.println("First ArrayList=============\n"); 
		 
//	Traversing list through the Iterator
    Iterator itr=al.iterator();	
    while(itr.hasNext()){
    	System.out.println(itr.next());
    }
    
 //Creating second ArrayList
 ArrayList<String> al1=new ArrayList<String>();
 al1.add("Dhini");
 al1.add("Sunny");
 al1.add("Triven");
 al1.add("Mangu");
 al1.add("sujith");
 al1.add("Varshith");
 System.out.println("Secong ArrayList=============\n"); 
						//Iterator itr1=al1.iterator();	
						//while(itr1.hasNext()){
						//System.out.println(itr1.next());
						//}
 //Another way of Traversing List through foreach loop.
  for(String obj:al1)  {  System.out.println(obj); }
  
 // Adding second list to first list..
  System.out.println("After adding sedind list to the first list==========\n ");
  al.addAll(al1);
 for(String obj1:al){ System.out.println(obj1);  }
 
 // Usage of RemoveAll method
 System.out.println("After using the removeAll method===========\n");
 al.removeAll(al1);
 for(String obj2:al){ System.out.println(obj2);  }
 
 // Usage of retainAll method
 System.out.println("After using the reatinAll method============\n");
 al.addAll(al1);
 al.retainAll(al1);
 for(String obj3:al){ System.out.println(obj3);  }
 }
}
