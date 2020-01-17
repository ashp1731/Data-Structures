package DataStructures;

import java.util.HashMap;

public class MyHashMap extends HashMap<Dog, String>{

	public static void main(String[]args) {
		
		MyHashMap myHashMap = new MyHashMap();
		
		Dog d1 = new Dog(10, "Kaleb");
		Dog d2 = new Dog(12, "Leo");
		Dog d3 = new Dog(12, "Tom");
		
		myHashMap.put(d1, "Dan");
		myHashMap.put(d2, "Aarushi");

		System.out.println(myHashMap.get(d1));
		System.out.println(myHashMap.get(d2));
		
		if(myHashMap.containsKey(d2)) {
			System.out.println("Found dog!!");
		}
		else {
			System.out.println("Oops!");
		}
	}

}
