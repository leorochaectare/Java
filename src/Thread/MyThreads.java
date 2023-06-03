package Thread;

public class MyThreads {

	
	public static void main(String[] args) {
		
		int value_1 = 100000000;
		int value_2 = 200000000;
		
		Runnable tarefa = new Soma(value_1, value_2);
		Thread threadCalculo = new Thread(tarefa, "Tarefa Soma");
		threadCalculo.start();
	}
	
}
