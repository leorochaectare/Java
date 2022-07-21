package Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DollarConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Valor em dólar: ");
        double dolar = scan.nextDouble();

        System.out.print("Valor em real: ");
        double real = scan.nextDouble();

        double conversao = dolar * real;

        System.out.print("Valor em real: R$" + df.format(conversao));

        scan.close();
    }
}
