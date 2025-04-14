package aula_02;

import java.util.Scanner;

public class Ex_001 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.printf("Digite o salário: ");
		float salario = leia.nextFloat();
		System.out.printf("Digite o abono: ");
		float abono = leia.nextFloat();
		
		float novoSalario = salario+abono;
		
		System.out.printf("Novo salário: %.2f", novoSalario);
		
	}
}
