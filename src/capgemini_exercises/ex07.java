package capgemini_exercises;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Double celsius;
		
		System.out.print("Digite uma temperatura em graus celsius: °C ");
		celsius = scan.nextDouble();
		
		Double fahrenheit = (9 * celsius + 160) / 5;
		
		System.out.printf("\nTemperatura convertida em graus fahrenheit: °F %.2f %n", fahrenheit);
		
		scan.close();
	}
}
