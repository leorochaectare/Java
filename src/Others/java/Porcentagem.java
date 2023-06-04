package Others.java;

public class Porcentagem {
	
	public static double calculaValorFrete(double valorBasico) {
		if(valorBasico < 100.00) {
			return 20.00;
		} else if (valorBasico >= 100 && valorBasico <= 200.00) {
			return 12.00;
		} else {
			return 0.0;
		}
	}
	
	public static void main(String[] args) {
		double valorBasico = 150.00;
		double desconto = 20.00;
		
		double sum = (valorBasico - ((valorBasico * desconto) / 100)) + calculaValorFrete(valorBasico);
		
		System.out.println(sum);
		
	}
}
