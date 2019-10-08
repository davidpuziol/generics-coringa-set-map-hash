package Set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main2 {

	public static void main(String[] args) {
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		//criando o conjunto c que vai ser uma copia do conjunto a
		Set<Integer> c = new TreeSet<>(a);
		//adicionar todos os da b no a.. .nesse caso como nao existe repeticao eh a uniao
		c.addAll(b);
		System.out.println(c);
		//c novamente eh copia de a e depois adiciona passa uma colecao b fazendo a interseccao, ou seja, vai ter os elementos que tem nos dois conjuntos
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		//Agora vai ficar so os elementos que tem no A que nao tem no B
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
	}

}
