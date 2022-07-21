package EstuturaDeDadosAlura.Filas;

import java.util.LinkedList;
import java.util.Queue;

public class TestaFila {
	public static void main(String[] args) {
		Fila fila = new Fila();
		
		fila.adiciona("Mauricio");
		fila.adiciona("Guilherme");
		
		System.out.println(fila);
		
		fila.remove();
		System.out.println(fila);
		
		System.out.println(fila.vazia());
		
		fila.remove();
		System.out.println(fila.vazia());
		
		Queue<String> queue = new LinkedList<String>();
		queue.add("Mauricio");
		String x2 = queue.poll();
		System.out.println(x2);
	}
}
