package aula_04;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Definição das Váriáveis
		int numero, numero_2,  resultado;
		
		//Entrada de Dados
		System.out.print("Digite a tabuada que deseja criar: ");
		numero = leia.nextInt();
		System.out.print("Digite até onde quer que a tabuada vá: ");
		numero_2 = leia.nextInt();
		
		//Titulo com fins visuais
		System.out.println("==============");
		System.out.println("Tabuada do " + numero + " até o " + numero_2);
		System.out.println("==============");
		
		
		//loop para calcular e mostrar os valores da tabuada
		for(int i = 1; i<= numero_2; i++) {
			//Calculo da tabuada
			resultado = numero*i;
			
			//print dos resultados
			System.out.printf("\n%d x %d = %d", numero,  i,  resultado);
		}

		leia.close();	}

}
