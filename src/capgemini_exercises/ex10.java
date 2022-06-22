package capgemini_exercises;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Double valor;
		
		System.out.print("Digite o preço do produto: R$");
		valor = scan.nextDouble();
	
		Double prestacao = valor / 5;
		
		System.out.printf("\nO valor das 5 prestações é: R$%.2f %n", prestacao);
		
		scan.close();
	}
}
