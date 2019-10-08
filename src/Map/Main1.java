package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main1 {

	public static void main(String[] args) {
		Map<Product, Double> stock = new HashMap<>();
		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		//eh igual aos dados do p1
		Product ps = new Product("Tv", 900.0);
		//vai dar diferente pq ele esta com um ponteiro diferente.. para comparar ele usar o equal e hashcode que nao foi implementado
		//Vai na classe Product e manda implementar o hashcode e equals
		//se fizer isso vai dar true
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));	}
}
