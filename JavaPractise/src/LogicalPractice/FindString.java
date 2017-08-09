package LogicalPractice;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;

public class FindString {
	public static void main(String[] args) {
		
		String str="Entertainment";
		char[] ch=str.toCharArray();
		char[] ch1={'a', 'e','i','o','u','A','E','I','O','U'};
		ArrayList<Character> myArray = new ArrayList<Character>();
		ArrayList<Character> myArray1 = new ArrayList<Character>();

		String strev;
         for(int i=0; i<=(ch.length-1);i++){
        	 for(int j=0; j<=(ch1.length-1);j++){
        	if(ch[i]==(ch1[j])){
        		myArray.add(ch[i]);
        	}
        }
    }
    	 System.out.print("Founded vowels are : ");
         for(Character st:myArray)
         {
        	 System.out.print(st);
          }
         System.out.println();
         System.out.print("vowels in reverese directions : ");
         for(int i=(myArray.size()-1); i>=0 ; i--)
          {
        	  System.out.print(myArray.get(i));
          }
         System.out.println();
         
         for(int i=0; i<=(ch.length-1);i++){
        	  for(int j=i; j<(ch.length-1);j++){
        	if(ch[i] == (ch[j]) ){
        		myArray1.add(ch[i]);
        	}
    } 
         
         
	  }
         System.out.println(myArray1);
	}
 }

	
