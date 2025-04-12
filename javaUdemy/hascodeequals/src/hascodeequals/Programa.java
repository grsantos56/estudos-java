package hascodeequals;

public class Programa {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("maria", "maria@gmail.com");
		Cliente c2 = new Cliente("maria", "maria@gmail.com");
		Cliente c3 = new Cliente("chico", "chico@gmail.com");
		
		String s1 = "arroz";
		String s2 = "arroz";
		String s3 = new String("arroz");
		String s4 = new String("arroz");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1 == c2); //verifica o endereço de memoria
		System.out.println(c1 == c3);
		System.out.println(s1==s2);
		System.out.println(s3 == s4);
		System.out.println(s1 == s3);
		
		
	}

}
