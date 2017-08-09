package ComparablePractice;

import java.util.ArrayList;
import java.util.Collections;


public class ComparableExample  {
	public static void main(String[] args) {
	ArrayList<Tester> al=new ArrayList<Tester>();
	al.add(new Tester(101,"Venkat",25));
	al.add(new Tester(102,"Naveen",27));
	al.add(new Tester(101,"Susmitha",22));
	
	Collections.sort(al);
	
	for(Tester st:al){
		System.out.println(st.id+" "+st.name+" "+st.age);
	}
	}
}