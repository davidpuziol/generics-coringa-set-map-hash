
package Set.Exercicio;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			
		//veja o que tem dentro desse arquivo que ele vai ler para entender
		String path = "./src/Set/Exercicio/Log.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			
			Set<LogEntry> set = new HashSet<>();
			
			String line = br.readLine();
			while (line != null) {
			
				String[] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				/*vai adicicionar, lembrando que ele vai comparar o hash so pelo 
				*nome entao a data nao importa, se ja tiver nome igual ele nao sobreescreve
				*/
				set.add(new LogEntry(username, moment));				
				line = br.readLine();
			}	
			
			for (LogEntry p : set) {
				System.out.println(p);
			}
			System.out.println("Total users: " + set.size());

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}
