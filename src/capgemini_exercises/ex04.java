package capgemini_exercises;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nome;
		Double salario;
		int totalVendas;
		
		System.out.print("\nDigite o nome do vendedor: ");
		nome = scan.next();
		System.out.print("Digite o salario fixo do vendedor: R$");
		salario = scan.nextDouble();
		System.out.print("Digite o total de vendas realizadas pelo vendedor: ");
		totalVendas = scan.nextInt();
		
		Double comissao = totalVendas * 0.15;
		Double totalSalario = salario + comissao; 
		
		System.out.println("\nNome do vendedor: " + nome);
		System.out.printf("Sálario fixo: R$%.2f %n", salario);
		System.out.printf("Salário final do mês: R$%.2f %n", totalSalario);
		
		scan.close();
	}
}
