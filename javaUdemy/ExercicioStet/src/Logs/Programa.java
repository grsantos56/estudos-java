package Logs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Scanner;
import java.util.Set;
import java.util.Date;
import java.util.HashSet;

public class Programa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("entre com o caminho do arquivo: ");
		String caminho = entrada.nextLine();		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
			Set<EntradaLog> set = new HashSet<>();
			String linha = br.readLine();
			while(linha != null) {
				String[] fields = linha.split(linha);
				String nomeUsuario = fields[0];
				Date momento = Date.from(Instant.parse(fields[1]));
				set.add(new EntradaLog(nomeUsuario, momento));
				linha = br.readLine();
			}
			System.out.println("total de usuarios: " + set.size());
		}catch(IOException e){
			System.out.println("erro: " + e.getMessage());
		}
		entrada.close();

	}

}
