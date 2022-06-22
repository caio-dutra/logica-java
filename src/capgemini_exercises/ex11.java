package capgemini_exercises;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Double custo;
		Double percentual;
		
		System.out.print("Digite o custo do produto: R$");
		custo = scan.nextDouble();
		System.out.print("Digite o percentual a ser acrescentado(%): ");
		percentual = scan.nextDouble();
		
		Double percentualDecimal = percentual / 100;
		Double aumento = custo + percentualDecimal * custo;
		
		System.out.printf("Valor do produto: R$%.2f %n", aumento);
		
		scan.close();
	}
}
