package HasCode.ExemploPratico;

public class Program {

	public static void main(String[] args) {
		// criterios que vamos utilizar. Um cliente eh igual ao outro quandos os nomes
		// forem iguals.
	
		Cliente c1 = new Cliente("Maria", "maria@gmail.com");
		Cliente c2 = new Cliente("Alex", "alex@gmail.com");

		System.out.println("Utilizando hashcode so no nome");
		System.out.println("Hashcode do cliente "+c1.getNome()+" "+c1.hashCode());
		System.out.println("Hashcode do cliente "+c2.getNome()+" "+c2.hashCode());
		System.out.println(c1.equals(c2)); //deu diferente pq o nome eh diferente que foi a implemetacao de Cliente
		System.out.println();

		// observar que vai dar igual pq foi usado soh o nome para gerar o hash
		c1 = new Cliente("Maria", "maria@gmail.com");
		c2 = new Cliente("Maria", "alex@gmail.com");

		System.out.println("Hashcode do cliente "+c1.getNome()+" "+c1.hashCode());
		System.out.println("Hashcode do cliente "+c2.getNome()+" "+c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println();

		// vamos usar um cliente2 com o hash usando nome e email sendo o criterio para ser igual o nome e o email
		// observar que usando um algoritmo diferente vai dar hashcode diferente do hashcode da classe anterior ateh para items iguals

		Cliente2 c3 = new Cliente2("Maria", "maria@gmail.com");
		Cliente2 c4 = new Cliente2("Alex", "alex@gmail.com");

		System.out.println("Hashcode do cliente "+c3.getNome()+" "+c3.hashCode());
		System.out.println("Hashcode do cliente "+c4.getNome()+" "+c4.hashCode());
		System.out.println(c3.equals(c4));
		System.out.println();
		
		//vai dar diferente agora
		c3 = new Cliente2("Maria", "maria@gmail.com");
		c4 = new Cliente2("Maria", "alex@gmail.com");

		System.out.println("Hashcode do cliente "+c3.getNome()+" "+c3.hashCode());
		System.out.println("Hashcode do cliente "+c4.getNome()+" "+c4.hashCode() + " Deu diferente pq o hashcode agora nao foi so baseado nome, mas tb no email");
		System.out.println(c3.equals(c4));
		System.out.println();
		
		
		//vai dar igual 
		c3 = new Cliente2("Maria", "maria@gmail.com");
		c4 = new Cliente2("Maria", "maria@gmail.com");

		System.out.println("Hashcode do cliente "+c3.getNome()+" "+c3.hashCode());
		System.out.println("Hashcode do cliente "+c4.getNome()+" "+c4.hashCode() + " Deu igual pq o nome e email foram iguais e o hash estava baseado nisso");
		System.out.println(c3.equals(c4));
		System.out.println();
		
		System.out.println("Mesmo os objetos sendo iguais pelos hash sao objetos diferentes em memoria");
		
		System.out.println(c3 == c4);//vai dar diferente pq a posicao de memoria eh diferente e o objeto nao eh o mesmo na memoria
		
		String a = "teste";
		String b = "teste";
		System.out.println();
		System.out.println("Testando strings declaradas literal sendo a = teste e b = teste vamos comprar a == b "+ (a == b));
		//Curiosidade...... O fato de nao implementar um objeto vai dar igual, o compilador trata de um jeito especial
		System.out.println();
		
		
		//Curiosidade...... O fato de implementar um objeto vai dar diferente
		String c = new String("teste");
		String d = new String("teste");
		System.out.println("Testando strings instanciadas sendo c = new String(teste) e d = new String(teste) vamos comprar c == d "+ (c == d));
	}
}
