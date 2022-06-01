package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		//Set<String> set = new HashSet<>(); (Rápido mas sem ordem)
		//Set<String> set = new TreeSet<>(); (Lento com ordem pelo compareTo do objeto)
		Set<String> set = new LinkedHashSet<>(); //(Intermediario e com a ordem que os elementos foram inseridos)
		
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		set.add("Smartphone");
		set.add("Book");
		set.add("Table");
		
		
		System.out.println(set.contains("Notebook"));
		
		set.remove("Tablet");
		
		// Remove se...
		//set.removeIf(x -> x.length() >= 3);
		//set.removeIf(x -> x.charAt(0) == 'T');
		
		
		for (String p : set) {
			System.out.println(p);
		}

	}

}
