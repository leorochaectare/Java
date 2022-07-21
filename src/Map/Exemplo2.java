package Map;

import java.util.HashMap;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class Exemplo2 {
	
	/*
	 * Na contagem de votos de uma eleição, são gerados vários registros de votação contendo o nome
	 * do candidato e a quantidade de votos (formato .csv) que ele obteve em uma urna de votação. 
	 * Você deve fazer um programa para ler os registros de votação a partir de um arquivo, e daí 
	 * gerar um relatório consolidado com os totais de cada candidato.
	 * */
	
	// Para poder testar o exemplo vai ser necessário criar um arquivo
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> map = new HashMap<>();

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				
				// Recortar o string baseado no campo informado que foi a vírgula
				String[] fields = line.split(",");
				
				String name = fields[0];
				Integer votes = Integer.parseInt(fields[1]);
				
				if(map.get(name) == null) {
					map.put(name, votes);					
				} else {
					map.put(name, votes + map.get(name));
				}
								
				line = br.readLine();
			}
			
			for(String key : map.keySet()) {
				System.out.println(key + ": " + map.get(key));
			}
			
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}
