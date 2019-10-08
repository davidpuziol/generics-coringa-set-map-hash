package HasCode.Exemplo;

public class MainExemplo {

	public static void main(String[] args) {
		String a = "Maria";
		String b = "Alex";
		
		System.out.println(a.equals(b));
		
		/*
		 * Se um hashcode de um objeto for diferente de outro eh 100% de certeza que ele eh diferente.
		 * Se for igual pode existir uma colisao dai testa com o equals.
		 * Se usa o hashcode para calcular grandes massas de dados pq a operacao eh muito mais veloz
		 */
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
	}
}
