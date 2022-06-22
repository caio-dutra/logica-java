package capgemini_exercises;

import java.util.Scanner;

public class ex03 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Double distancia;
		Double totalGasto;
		
		System.out.print("Digite a distância percorrida pelo automóvel: ");
		distancia = scan.nextDouble();
		System.out.print("Digite o total de combustível gasto: ");
		totalGasto = scan.nextDouble();
		
		Double consumoMedio = distancia / totalGasto;
		
		System.out.println("\nO consumo médio do automóvel é: " + consumoMedio);
		
		scan.close();
	}
}
