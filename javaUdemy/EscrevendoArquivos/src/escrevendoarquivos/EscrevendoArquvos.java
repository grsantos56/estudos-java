package escrevendoarquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscrevendoArquvos {
	public static void main(String[] args) {
		String caminho = "C:\\\\Users\\\\Gabriel\\\\Desktop\\\\projetos.txt";
		String[] linha = new String[] {"palavra 1", "palavra 2", "palavra 3"};
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))){ //o segundo parametro "true" serve para adicionar as palavras. Se não tivesse ele apagaria o que tinha antes e reescreveria
			for(String linhas: linha) {
				bw.write(linhas);
				bw.newLine();
			}
		}catch(IOException excecao) {
			excecao.printStackTrace();
		}
	}
}
