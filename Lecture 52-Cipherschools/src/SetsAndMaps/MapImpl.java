package SetsAndMaps;
import java.util.*;

public class MapImpl {
	public static void main(String[]args) {
		Map<String,Integer> map=new HashMap();
		map.put("Mango", 5);
		map.put("Orange", 6);
		map.put("Banana", 7);
		map.put("Apple", 8);
		System.out.println("Mangoes:" + map.get("Mango"));
		System.out.println("Orange:" + map.get("Orange"));
		map.put("Mango",10);
		System.out.println("Mangoes:" + map.get("Mango"));
		System.out.println(map.containsKey("Mango"));
		System.out.println(map.containsKey("Kiwi"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		
		
	}

}
