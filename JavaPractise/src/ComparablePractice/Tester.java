package ComparablePractice;


class Tester implements Comparable<Tester> {

	int age;
	int id;
	String name;
	
	Tester(int id, String name, int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	public int compareTo(Tester st) {
		if(age == st.age )
		     return 0;
		else if(age > st.age)
		    return -1;
		else
			return 1;
	}

}
