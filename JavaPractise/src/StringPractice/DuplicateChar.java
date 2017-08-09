package StringPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name ");
		String str = sc.next();
		// char d=0;
		// int count=0;
		// for(int i=0; i<str.length();i++){
		// for(int j=i+1;j<str.length();j++){
		// if(str.charAt(i) == str.charAt(j)){
		// if(d !=str.charAt(i)){
		// count++;
		// d=str.charAt(i);
		// System.out.println("Duplicate Charaacter is "+d);
		//
		// }
		// }
		//
		// }}
		//
		// System.out.println("Number of duplicates "+count);

		char ch[] = str.toCharArray();
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		for (Character ctr : ch) {
			if (mp.containsKey(ctr)) {
				mp.put(ctr, mp.get(ctr) + 1);
			} else {
				mp.put(ctr, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> entrySet = mp.entrySet();
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
	}
}
