package arquivospt2;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Arquivos {
	public static void main(String[] args) {
		String caminho = "C:\\Users\\Gabriel\\Desktop\\projetos.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(caminho);
			br = new BufferedReader(fr);
			
			String linha = br.readLine();
			while(linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
		}catch(IOException excecao) {
			System.out.println("erro!: " + excecao.getMessage());
		}finally {
			try {
				if(fr != null) {
					fr.close();
				}if(br != null) {
					br.close();
				}
			}catch(IOException excecao){
				excecao.printStackTrace();
			}
		}
	}
}
