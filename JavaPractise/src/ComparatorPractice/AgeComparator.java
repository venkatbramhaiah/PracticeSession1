package ComparatorPractice;

import java.util.Comparator;


class AgeComparator implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		ComparatorTesting ct1=(ComparatorTesting) obj1;
		ComparatorTesting ct2=(ComparatorTesting) obj2;

		
		if(ct1.age == ct2.age)
		    return 0;
		else if(ct1.age > ct2.age)
			return 1;
		else
			return -1;
	}
	
}