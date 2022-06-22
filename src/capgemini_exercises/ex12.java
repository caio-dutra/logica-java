package capgemini_exercises;

import java.util.Scanner;

public class ex12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Double custoFabrica; 
		
		System.out.print("Digite o custo de fábrica do veículo: R$");
		custoFabrica = scan.nextDouble();
		
		Double aumento1 = custoFabrica + 0.28 * custoFabrica;
		Double aumento2 = aumento1 + 0.45 * aumento1;
		
		System.out.printf("Valor do veículo: R$%.2f %n", aumento2);
		
		scan.close();
	}
}
