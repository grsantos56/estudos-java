package arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Arquivos {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Gabriel\\Desktop\\projetos.txt");
		Scanner entrada = null;
		
		try {
			entrada = new Scanner(file);
			while(entrada.hasNextLine()) {
				System.out.println(entrada.nextLine());
			}
		}catch(IOException excecao) {
			System.out.println("erro!: " + excecao.getMessage());
		}finally {
			if(entrada != null) {
				entrada.close();
			}
		}
	}
}
