package Thread;

public class Soma implements Runnable {
	private int value_1;
	private int value_2;

	public Soma(int value_1, int value_2) {
		this.value_1 = value_1;
		this.value_2 = value_2;
	}

	@Override
	public void run() {
		
		int sum = 0;
		
		for(int i = 0; i < value_1; i++) {
			for(int j = 0; j < value_2; j++) {
				sum += i+j;
			}
		}

		System.out.println(sum);

	}
}
