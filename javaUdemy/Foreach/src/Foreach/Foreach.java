package Foreach;

public class Foreach {

	public static void main(String[] args) {
		String vet[] = new String[] {"chico", "ze", "manel"};
		/*mesma forma
		String vet[] = new String[3];
		vet[0] = "chico";
		vet[1] = "ze";
		vet[2] = "manel";
		*/
		for(String vetor: vet) {
			System.out.println(vetor);
		}

	}

}
