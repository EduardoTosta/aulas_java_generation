package aula_03;

import java.util.Scanner;

public class Ex_001 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a,b,c,soma;
		
		System.out.println("Digite o primeiro numero: ");
			a = leia.nextInt();
		System.out.println("Digite o segundo numero: ");
			b = leia.nextInt();
		System.out.println("Digite o terceiro numero: ");
			c = leia.nextInt();
		
		soma = a+b;
		
		System.out.printf("A soma de A + B é: %d", soma);
		
		if(soma > c) {
			System.out.println("\nA Soma de A + B é Maior do que C");
		}else if(soma < c) {
			System.out.println("\nA Soma de A + B é Menor do que C");
		}else
			System.out.println("\nA Soma de A + B é Igual a C");
		
		
		leia.close();
		
	}

}
