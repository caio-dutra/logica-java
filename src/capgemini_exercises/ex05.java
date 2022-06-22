package capgemini_exercises;

import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nome;
		Double nota1;
		Double nota2;
		Double nota3;
		
		System.out.print("Digite o nome do aluno: ");
		nome = scan.next();
		System.out.print("Digite a nota da prova1: ");
		nota1 = scan.nextDouble();
		System.out.print("Digite a nota da prova2: ");
		nota2 = scan.nextDouble();
		System.out.print("Digite a nota da prova3: ");
		nota3 = scan.nextDouble();
		
		Double media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("\nNome do aluno: " + nome);
		System.out.printf("Média do aluno: %.2f", media);
		
		scan.close();
	}
}
