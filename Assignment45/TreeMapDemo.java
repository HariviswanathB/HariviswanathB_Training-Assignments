package Assignment45;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<>();
		map.put(1, "Hari");
		map.put(2, "Bharath");
		map.put(3, "Charlie");
		
		System.out.println("Ascending Order ");
		for(Map.Entry<Integer,String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
		System.out.println("Descending Order ");
		for(Map.Entry<Integer,String> entry:map.descendingMap().entrySet()) {
			System.out.println(entry.getKey()+" = "+entry.getValue());
			
		}
		

	}

}
