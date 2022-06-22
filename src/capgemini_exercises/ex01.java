package capgemini_exercises;

import java.util.Scanner;

public class ex01 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Double num1;
		Double num2;
		Double soma;
		
		System.out.print("Digite o primeiro valor: ");
		num1 = scan.nextDouble();
		System.out.print("Digite o segundo valor: ");
		num2 = scan.nextDouble();
		
		soma = num1 + num2;
		
		System.out.println("A soma dos dois valores é: " + soma);
		
		scan.close();
	}
}
