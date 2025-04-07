package verificandopastas;

import java.io.File;
import java.util.Scanner;

public class VerificandoPastas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite o caminho da pasta: ");
		String caminho = entrada.nextLine();
		
		File pasta = new File(caminho);

		File[] pastas = pasta.listFiles(File::isDirectory);
		
		System.out.println("pastas");
		for(File pastass: pastas ) {
			System.out.println(pastas);
		}
		
		System.out.println("arquivos");
		File[] arquivo = pasta.listFiles(File::isFile);
		for(File arquivos: arquivo) {
			System.out.println(arquivo);
		}
		
		boolean sucesso = new File(caminho + "\\criado com java").mkdir();
		System.out.println("criado: " + sucesso);
		
		
		System.out.println("nome: " + pasta.getName());
		System.out.println("caminho: " + pasta.getParent());
		System.out.println("caminho completo: " + pasta.getPath());
		
		entrada.close();
		
	}

}
