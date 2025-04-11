package comparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programa {
	public static void main(String[] args) {
		List<Funcionario> list = new ArrayList<>();
		String path = "C:\\Users\\Gabriel\\Desktop\\java.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String fincionarioCsv = br.readLine();
			while (fincionarioCsv != null) {
				String[] fields = fincionarioCsv.split(","); 
				list.add(new Funcionario(fields[0], Double.parseDouble(fields[1])));
				fincionarioCsv = br.readLine();
			}
			Collections.sort(list);
			for (Funcionario f : list) {
				System.out.println(f.getNome() + "," + f.getSalario());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
