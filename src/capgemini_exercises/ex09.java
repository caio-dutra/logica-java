package capgemini_exercises;

import java.util.Scanner;

public class ex09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Double valor1;
		
		System.out.print("Digite o valor depositado: R$");
		valor1 = scan.nextDouble();
		
		Double valor2 = valor1 + 0.0007 * valor1;
		
		System.out.printf("\nValor com rendimento após um mês: %.2f", valor2);
		
		scan.close();
	}
}
