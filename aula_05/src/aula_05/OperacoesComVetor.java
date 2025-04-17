//Ex_002
package aula_05;

import java.util.Scanner;

public class OperacoesComVetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Definição do tamanho do vetor
		System.out.printf("Digite o tamanho do vetor: ");
		int tamanhoVetor = leia.nextInt();
		
		float media = 0;
		int auxPar = 0,indexPar = 0, soma = 0, i;
		int vetor[] = new int[tamanhoVetor];
		
		System.out.println("############################");
		System.out.println("--- Operações com VETOR ---");
		System.out.println("############################");
		
		
		//Entrada de dados
		for(i = 0; i < vetor.length;  i++) {
			System.out.printf("Digite o %d° valor: " , i+1);
			vetor[i] = leia.nextInt();
			
			//Soma dos valores 
			soma += vetor[i];
			
			//Definição do tamanho dos vetores de Par e Impar
			if(vetor[i]%2==0) 
				auxPar++;	
		}
		//calculo da media
		media = soma/vetor.length;
        
		//Declaração dos vetores par e impar
		int vetPar[] = new int[auxPar];
		
		//Recebimento de valores dos vetores pares e impares 
		for(i = 0; i < vetor.length; i++) {
			if(vetor[i]%2==0) {
				vetPar[indexPar] = vetor[i];
				indexPar++;
			}
		}
		
		//Print dos resultados
		
		// Exibe elementos nos índices ímpares
		System.out.print("\nElementos nas posições ímpares:\n");
		for (i = 0; i < vetor.length; i += 2) {
		    System.out.print(vetor[i] + " ");
		}


		// Exibe elementos pares 
		System.out.print("\n\nElementos pares:\n");
		for (i = 0; i < vetPar.length; i++) {
		    System.out.print(vetPar[i] + " ");
		}

		// Exibe soma e média
		System.out.printf("\n\nSoma: %d\n", soma);
		System.out.printf("Média: %.2f\n", media);	
		
		leia.close();
		
	}

}
