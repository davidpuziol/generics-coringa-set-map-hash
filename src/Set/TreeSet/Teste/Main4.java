package Set.TreeSet.Teste;

import java.util.Set;
import java.util.TreeSet;

public class Main4 {

	public static void main(String[] args) {
		
		//vai dar excessao pq nao foi implementado o comparaTo na classe Produto
		//Se for la na classe e descomentar as linhas vai dar certo
		Set<Produto> set = new TreeSet<>();
		set.add(new Produto("TV", 900.0));
		set.add(new Produto("Notebook", 1200.0));
		set.add(new Produto("Tablet", 400.0));
		
		//Se descomentar o overrided to string vai printar corretamente faca isso depois de que tudo der certo pra vc entender
		for (Produto p : set) {
		System.out.println(p.toString());
		}
	}
}