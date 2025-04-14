package aula_02;

import java.util.Scanner;

public class Ex_002 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float[] nota = new float[4];
		float aux = 0;
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Digite a nota " + (i+1) + ": ");
			nota[i] = leia.nextFloat();
			
			aux += nota[i];
		}
		
		float media = aux/4;
		System.out.printf("Média: %.2f", media);
		
		if(media<5) {
			System.out.println("\nReprovado!");
		}else if(media >= 5 && media <=6) {
			System.out.println("\nRecuperação!");
		}else {
			System.out.println("\nAprovado!");
		}
		
		
		leia.close();
		
	}

}
