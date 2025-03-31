package String;

public class Strings {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG ";
		String s01 = original.toLowerCase(); //tudo minusculo
		String s02 = original.toUpperCase();//tudo maiusculo
		String s03 = original.trim(); //retira espaços do fim e inicio
		String s04 = original.substring(2); //começa apartir do indice 2
		String s05 = original.substring(2, 9); //começa do 2 e vai ate o 9
		String s06 = original.replace('a', 'x'); //troca o a pelo x
		String s07 = original.replace("abc", "xy"); //torca abc por xy
		int i = original.indexOf("bc"); //mostra a primeira ocorrencia
		int j = original.lastIndexOf("bc"); //mostra a ultima ocorrencia
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
		
		String s = "potato apple lemon";
		String[] vect = s.split(" "); //separa a string onde tem espaços
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];

	}

}
