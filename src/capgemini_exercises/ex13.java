package capgemini_exercises;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Double num;
		
		System.out.print("Digite um número: ");
		num = scan.nextDouble();
		
		if(num > 10) {
			System.out.println("\nO número digitado é maior que dez.");
		}else {
			System.out.println("\nO número digitado não é maior que dez.");
		}
		
		scan.close();
	}
}
