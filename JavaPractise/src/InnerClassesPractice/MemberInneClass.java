package InnerClassesPractice;

public class MemberInneClass {
	private int x=24;
	
	class InnerOne{
	 void display(){
		 System.out.println("The age of the person is: "+x);
	 }
	}
	
	public static void main(String args[]){
		MemberInneClass out=new MemberInneClass();
		MemberInneClass.InnerOne in= out.new InnerOne();
		in.display();
	}

}
