package LogicalPractice;
class cc{
	static int st=20;
private int display(){
	return 2;
}
}
public class tetstt extends cc {
	int a=10;
	private int display() //  overriding the private method
	{
         return 3;
         }
	
	public static void main(String[] args) {
      //static int st=30;
		tetstt obj=new tetstt();
		@SuppressWarnings("unused")
		cc obj1=new cc();
		System.out.println(0.1*5==0.5);
		
		System.out.println(obj.a);
		
		
		
	}

}
