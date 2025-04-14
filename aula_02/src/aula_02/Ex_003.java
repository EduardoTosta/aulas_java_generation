package aula_02;

import java.util.Scanner;

public class Ex_003 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Salário bruto: ");
		float salarioBruto = leia.nextFloat();
		System.out.println("adcional Noturno: ");
		float adcionalNoturno = leia.nextFloat();
		System.out.println("horasExtras : ");
		float horasExtras = leia.nextFloat();
		System.out.println("descontos: ");
		float descontos = leia.nextFloat();
		
		float salarioLiquido = salarioBruto+adcionalNoturno+(horasExtras*5)-descontos;
		
		System.out.printf("Salário líquido: %.2f", salarioLiquido);
		
		
		
		
	}

}
