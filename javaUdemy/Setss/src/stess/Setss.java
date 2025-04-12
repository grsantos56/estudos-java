package stess;

import java.util.HashSet;
import java.util.Set;

public class Setss {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("tv");
		set.add("notebook");
		set.add("tablet");
		
		set.removeIf(x -> x.length()>=3); //remove o x tal que x tenha mais de 3 letras
		set.removeIf(x -> x.charAt(0)=='n'); //remove todos que começam com n
		
		for(String p: set) {
			System.out.println(p);
		}
	}

}
