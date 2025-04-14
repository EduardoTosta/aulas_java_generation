package aula_02;

import java.util.Scanner;

public class Ex_004 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float[] numero = new float[4];
		float aux = 0;
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Digite a nota " + (i+1) + ": ");
			numero[i] = leia.nextFloat();
		}
		
		float calculo = (numero[0]*numero[1])-(numero[2]*numero[3]);
		
		System.out.printf("Diferença: %.2f", calculo);
		
		
	}
}
