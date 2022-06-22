package capgemini_exercises;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Double num1;
		Double num2;
		
		System.out.print("Digite o primeiro número: ");
	    num1 = scan.nextDouble();
	    System.out.print("Digite o segundo número: ");
	    num2 = scan.nextDouble();
	    
	    if(num1 > num2) {
	    	System.out.println("\n" + num1 + "é maior que " + num2);
	    }
		if(num2 > num1) {
	    	System.out.println("\n" + num2 + " é maior que " + num1);
		}
		
		scan.close();
	}
}
