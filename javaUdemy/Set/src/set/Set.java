package set;
import java.util.HashSet;
import java.util.Set;

public class Set {

	public static void main(String[] args) {
		Set<String> set = new Hashset<>();
		
		set.add("tv");
		set.add("notebook");
		set.add("tablet");
		
		System.out.println(set.contains("notebook"));
		
		for(String p: set) {
			System.out.println(p);
		}

	}

}
