package capgemini_exercises;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Double num;
		
		System.out.print("Digite um número: ");
		num = scan.nextDouble();
		
		if(num >= 100 && num <= 200) {
			System.out.println("\nO número inserido ESTÁ no intervalo entre 100 e 200.");
		}else {
			System.out.println("\nO número inserido NÃO ESTÁ no intervalo entre 100 e 200.");
		}
		
		scan.close();
	}
}
