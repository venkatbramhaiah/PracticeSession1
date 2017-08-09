package CollectionsPractice;

import java.util.ArrayList;
import java.util.List;

public class CollectiontoArray {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Venkat");
		list.add("Naveen");
		list.add("Yarramneedi");
		
		
		String[] arr=list.toArray(new String[0]);
		for(String name:arr){
			System.out.print(name+" ");
		}
	}

}
