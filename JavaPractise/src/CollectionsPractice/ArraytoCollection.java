package CollectionsPractice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArraytoCollection {
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8};
	    List<Integer> intlist=new ArrayList<Integer>();
	    for(int i=0; i< arr.length; i++){
	    	intlist.add(arr[i]);
	    }
	    for(int n: intlist){
	    	System.out.print(n+" ");
	    }
	    System.out.println();
		String arr1[]={"Venkat", "Naveen", "Yarramneeedi"};
		List<String> list=Arrays.asList(arr1);
		for(String name: list){
			System.out.print(name+" ");
		}
		System.out.println();
		System.out.println("Printing list in reverece order=================");
		for(int j= list.size()-1; j>=0;j--){
			System.out.print(list.get(j)+" ");
		}
	}

}
