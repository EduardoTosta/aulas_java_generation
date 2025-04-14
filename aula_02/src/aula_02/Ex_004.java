package aula_02;

import java.util.Scanner;

public class Ex_004 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a numero 1: ");
		float numero1 = leia.nextFloat();
		System.out.println("Digite a numero 2: ");
		float numero2 = leia.nextFloat();
		System.out.println("Digite a numero 3: ");
		float numero3 = leia.nextFloat();
		System.out.println("Digite a numero 4: ");
		float numero4 = leia.nextFloat();
		
		float calculo = (numero1*numero2)-(numero3*numero4);
		
		System.out.printf("Diferença: %.2f", calculo);
		
		
	}
}
