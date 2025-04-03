package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		List <String> lista = new ArrayList<>();//delcaração de lista
		lista.add("chico");
		lista.add("ze");
		lista.add("manel");
		lista.add("rita");
		
		for(String list: lista) {
			System.out.println(list);
		}
		lista.remove(0);
		lista.removeIf(list -> list.charAt(0) == 'm');//predicado. remove list tal que o primeiro caractere seja igual a m
		System.out.println();
		for(String list: lista) {
			System.out.println(list);
		}
		System.out.println("posição de rita: "+ lista.indexOf("rita"));
		System.out.println();
		List<String> resultado = lista.stream().filter(x -> x.charAt(0) =='r').collect(Collectors.toList());//filtra apenas os nomes que comeam com r (lisst.stream converte para stream), (.colletct converte para lista de novo)
		System.out.println(resultado);
		System.out.println();
		String nome = lista.stream().filter(x -> x.charAt(0) == 'z').findFirst().orElse(null);//busca o primeiro item que começa com z
		System.out.println(nome);
		}

}
