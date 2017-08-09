package ComparatorPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class ComparatorTesting {

	int roolno;
	String name;
	int age;
	
	ComparatorTesting(int rollno, String name, int age){
		this.name=name;
		this.roolno=rollno;
		this.age=age;
	}
}

public class ComparatorExample {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<ComparatorTesting> al=new ArrayList<ComparatorTesting>();
		
		al.add(new ComparatorTesting(123,"Venkat",25));
		al.add(new ComparatorTesting(124,"Naveen",24));
		al.add(new ComparatorTesting(123,"Susmitha",22));
		al.add(new ComparatorTesting(123,"Srikanth",29));
		
		Collections.sort(al, new AgeComparator());
		System.out.println("Sorting by age");
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			ComparatorTesting ct1=(ComparatorTesting) itr.next();
			System.out.println(ct1.roolno+" "+ct1.name+" "+ct1.age);
		}
		
		Collections.sort(al, new NameComparator());
		System.out.println("Sorting by Name");
		Iterator itr1=al.iterator();
		while(itr1.hasNext()){
			ComparatorTesting ct2=(ComparatorTesting) itr1.next();
			System.out.println(ct2.roolno+" "+ct2.name+" "+ct2.age);
		}
	}

}