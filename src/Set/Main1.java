package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		//Se imprimir na ondem eh um mero acaso, mas nao tem essa garantia
		System.out.println(set.contains("Notebook"));
		for (String p : set) {
			System.out.println(p);
		}
		
		System.out.println();
		
		Set<String> set1 = new TreeSet<>();
		set1.add("Tv");
		set1.add("Tablet");
		set1.add("Notebook");
		//Nesse caso tem que ordenar as strings.... 
		System.out.println(set1.contains("Notebook"));
		for (String p : set1) {
			System.out.println(p);
		}
		
		System.out.println();
		
		Set<String> set2 = new LinkedHashSet<>();
		set2.add("Tv");
		set2.add("Tablet");
		set2.add("Notebook");
		//Mantem a ordem de insercao 
		System.out.println(set2.contains("Notebook"));
		for (String p : set2) {
			System.out.println(p);
		}
		System.out.println();
		
		//Lembrando que eh sensivel a maiusculos e minusculos
		set2.remove("Tablet");
		System.out.println(set2.contains("Notebook"));
		for (String p : set2) {
			System.out.println(p);
		}
		set2.add("Tablet");
		
		System.out.println();
		
		//Lembrando que eh sensivel a maiusculos e minusculos
		set2.removeIf(x -> x.length() >=3 ); //Expressao que vai remover aqueles que a string eh maior ou igual a 3, ou seja soh vai sobrar a tv
		System.out.println(set2.contains("Notebook"));
		for (String p : set2) {
			System.out.println(p);
		}
		
		//observe que estamos mudando tb a ordem de insercao para o linkedhashset, agora tv eh o primeiro
		set2.add("Tablet");
		set2.add("Notebook");
		
		System.out.println();
		
		//Lembrando que eh sensivel a maiusculos e minusculos
		set2.removeIf(x -> x.charAt(0) == 'T'); //Expressao que vai remover os que tem caractere T no primeiro elembro da string
		System.out.println(set2.contains("Notebook"));
		for (String p : set2) {
			System.out.println(p);
		}
	}
	
}
