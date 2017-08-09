package ComparatorPractice;

import java.util.Comparator;


class NameComparator implements Comparator{
	public int compare(Object obj1, Object obj2) {

	ComparatorTesting nc1=(ComparatorTesting) obj1;
	ComparatorTesting nc2=(ComparatorTesting) obj2;
	return nc1.name.compareToIgnoreCase(nc2.name);
	
	}
}

