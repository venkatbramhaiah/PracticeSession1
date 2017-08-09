package CollectionsPractice;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
	
	static void chatCount(String str){
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
	char ch[]=str.toCharArray();
	for(char c: ch){
		if(charCountMap.containsKey(c)){
			
		}
	}
	}

public static void main(String[] args) {
    Map<String, String> map3 = new HashMap<String, String>();

    Map<String, String> map1 = new HashMap<String, String>();
    map1.put("key1", "value1");
    map1.put("key2", "value2");
    map1.put("key3", "value3");
    //map1.put(null, null);

    Map<String, String> map2 = new HashMap<String, String>();
    map2.put("key4", "value4");
    map2.put("key5", "value5");
    map2.put("key6", "value6");
    map2.put("key3", "replaced-value-of-key3-in-map2");
    // used only if map1 can be changes/updates with the same keys present in map2.
   // map1.putAll(map2);

    // use below if you are not supposed to modify the map1.
    for (Map.Entry e : map2.entrySet())
        //if (!map1.containsKey(e.getKey())){
            //map1.put(e.getKey().toString(), e.getValue().toString());
    map3.put( e.getValue().toString(), e.getKey().toString());
        //}
    
    for (Map.Entry e : map1.entrySet())
        map3.put( e.getValue().toString(), e.getKey().toString());

    System.out.println(map3);
}}