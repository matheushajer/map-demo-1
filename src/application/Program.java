package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {

		Map<String, String> cookies = new TreeMap<>();

		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("fone", "99711122");

		System.out.println("Cookies: ");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		
		System.out.println("Contains 'phone': " +cookies.containsKey("phone"));
		
		
		
		//
	}
}
//.put, incrementa valores ao map.
// .remove retira valores do map ao informar uma key como parametro.
// treeMap ordena os valores pela chave informada.
//.containsKey verifica se a chave informada existe no map.
//.get tras o conteudo da key informada.