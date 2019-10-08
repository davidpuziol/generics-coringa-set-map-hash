package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import Set.TreeSet.Teste.Produto;

public class Main3 {

	public static void main(String[] args) {
		Set<Produto> set = new HashSet<>();
		
		set.add(new Produto("Tv", 900.0));
		set.add(new Produto("Notebook", 1200.0));
		set.add(new Produto("Tablet", 400.0));

		Produto prod = new Produto("Notebook", 1200.0);
		
		//set todos os atributos forem iguais o hash que eh baseado em todos os atributos vai dar verdadeiro
		System.out.println(set.contains(prod));
		
		Produto prod2 = new Produto("Notebook", 1100.0);
		
		//set somente um atributo for igual nao dar dar o hash igual
		System.out.println(set.contains(prod2));
	}
}