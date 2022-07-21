package Files;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Example1 {
	public static void main(String[] args) {
		try {
			FileOutputStream arquivo = new FileOutputStream("arquivo.txt");
			PrintWriter pr = new PrintWriter(arquivo);
			
			pr.println("Linha1Coluna1; Linha 1 Coluna 2");
			
			pr.close();
			arquivo.close();
		} catch (Exception e) {
			System.out.println("Erro ao escrever o arquivo.....");
		}
	}
}
