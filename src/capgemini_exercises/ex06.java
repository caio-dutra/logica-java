package capgemini_exercises;

import java.util.Scanner;

public class ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A;
		int B;
		
		System.out.print("Digite o valor A: ");
		A = scan.nextInt();
		System.out.print("Digite o valor B: ");
		B = scan.nextInt();
		
		System.out.println("Valor de A: " + B);
		System.out.println("Valor de B: " + A);
		
		scan.close();
	}
}
