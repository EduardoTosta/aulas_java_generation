package aula_02;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Definição das Váriáveis
		System.out.print("Digite a tabuada que deseja criar: ");
		int numero = leia.nextInt();
		
		System.out.print("Digite até onde quer que a tabuada vá: ");
		int numero_2 = leia.nextInt();
		
		int  resultado;
		
		
		//Titulo com fins visuais
		System.out.println("==============");
		System.out.println("Tabuada do " + numero + " até o " + numero_2);
		System.out.println("==============");
		
		
		//loop para calcular e mostrar os valores da tabuada
		for(int i = 1; i<= numero_2; i++) {
			//Calculo da tabuada
			resultado = numero*i;
			
			//print dos resultados
			System.out.println(numero + " x " + i + " = " + resultado);
		}

	}

}
