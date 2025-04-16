//Ex002 - Módulo 8.2
package aula_04;

import java.util.Scanner;

public class parOuImpar {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int contador = 0, contPar = 0, contImpar=0;
		//int[] numeros = new int[contador];
		int numeros;
		boolean verificarBoolean = true;
		char verificarChar;

		
		do {
			//Menu
			System.out.println("##############################");
			System.out.println("------- Par ou impar ---------");
			System.out.println("##############################");
			
			//Quantidade de numeros
			System.out.println();
			System.out.printf("Quantos numeros quer verificar?: ");
			contador = leia.nextInt();
			System.out.println();
			
			 //Laço contador
			for(int i = 1; i <= contador; i++) {
				System.out.printf("\nDigite o %d° valor: ", i);
				numeros = leia.nextInt(); 
				
				//Separação de par e ímpar
				if(numeros%2 == 0 ) {
					contPar++;
				}else 
					contImpar++;	
			}
			
			//Resultado Par
			System.out.println();
			System.out.println("-------------------------------------");
			System.out.printf("    Total de números pares: %d\n", contPar);
			System.out.println("-------------------------------------");
			
			//Resultado Impar
			System.out.println("-------------------------------------");
			System.out.printf("    Total de números ímpares: %d\n", contImpar);
			System.out.println("-------------------------------------");
			
			//Menu de verificação de execução
			System.out.println("#################################################");
			System.out.println("------- Deseja contar novamente? (Y/N) ---------");
			System.out.println("#################################################");
			verificarChar = leia.next().charAt(0);
			leia.nextLine();
			
			//Teste comparativo
			if(verificarChar == 'n') {
				verificarBoolean = false;
			}
			
			System.out.println("Obrigado!");
			leia.close();
			
		}while(verificarBoolean);
		
		
		
		
		
		
	}

}
