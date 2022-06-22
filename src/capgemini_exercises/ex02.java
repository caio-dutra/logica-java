package capgemini_exercises;

import java.util.Scanner;

public class ex02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Double num1;
		Double num2;
		Double soma;
		Double sub;
		Double mult;
		Double div;	
		
		System.out.print("\nDigite o primeiro valor: ");
		num1 = scan.nextDouble();
		System.out.print("Digite o segundo valor: ");
		num2 = scan.nextDouble();
		
		soma = num1 + num2;
		sub = num1 - num2;
		mult = num1 * num2;
		div = num1 / num2;
		
		System.out.println("\nA soma dos valores é: " + soma);
		System.out.println("A subtração dos valores é: " + sub);
		System.out.println("A multiplicação dos valores é: " + mult);
		System.out.println("A divisão dos valores é: " + div);
		
		scan.close();
	}
}
