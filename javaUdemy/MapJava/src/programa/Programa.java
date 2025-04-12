package programa;

import java.util.Map;
import java.util.TreeMap;

public class Programa {

	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap();
		
		cookies.put("nome", "maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("telefone", "99988454652");
		
		System.out.println("todos os cookies: ");
		
		for(String chave: cookies.keySet()) {
			System.out.println(chave + ": " + cookies.get(chave));
		}
	}

}
