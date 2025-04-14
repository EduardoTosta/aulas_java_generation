package aula_02;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double resultado;
		
		System.out.printf("Digite o primeiro valor: ");
		double numero_1 = leia.nextDouble();
		System.out.printf("Digite o segundo valor: ");
		double numero_2 = leia.nextDouble();
		System.out.printf("Digite a operação: ");
		char operacao = leia.next().charAt(0);
		
		
		switch(operacao) {
		case 'x':
			resultado = numero_1*numero_2;
			System.out.println("Resultado: " + resultado);
			break;
		
		case '-':
			resultado = numero_1-numero_2;
			System.out.println("Resultado: " + resultado);
			break;
			
		case '+':
			resultado = numero_1+numero_2;
			System.out.println("Resultado: " + resultado);
			break;
			
		case '/':
			resultado = numero_1/numero_2;
			System.out.println("Resultado: " + resultado);
			break;
		
		}
		
		
		
		
		
		
	}

}
