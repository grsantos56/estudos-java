package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Programa {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(3, 5, 7, 9, 11);
		Stream<Integer> str1 = 	lista.stream().map(x -> x*10);
		System.out.println(Arrays.toString(str1.toArray()));
		
		Stream<String> str2 = Stream.of("chico", "bento", "zé");
		System.out.println(Arrays.toString(str2.toArray()));
		
		Stream<Integer> str3 = Stream.iterate(0, x->x+2);
		System.out.println(Arrays.toString(str3.limit(10).toArray()));
		
		}

}
