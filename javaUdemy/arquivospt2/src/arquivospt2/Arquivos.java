package arquivospt2;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Arquivos {
	public static void main(String[] args) {
		String caminho = "C:\\Users\\Gabriel\\Desktop\\projetos.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))){
			
			String linha = br.readLine();
			while(linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
		}catch(IOException excecao) {
			System.out.println("erro!: " + excecao.getMessage());
		}
	}
}
