package capgemini_exercises;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Double dolar;
		Double real;
		Double cotacao;
		
		System.out.print("Digite um valor em dolar: US$");
		dolar = scan.nextDouble();
		System.out.print("Digite a cotação do dolar: R$");
		cotacao = scan.nextDouble();
		
		real = cotacao * dolar;
		
		System.out.printf("\nValor convertido em reais: R$%.2f", real);
		
		scan.close();
	}
}
