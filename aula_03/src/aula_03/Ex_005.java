package aula_03;

import java.util.Scanner;

public class Ex_005 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Variáveis
		String nome;
		String produtos[] = {"Cachorro Quente", "X-Salada", "X-Bacon","Bauru", "Refrigerante",  "Suco de laranja"};
		int codProduto, qntProduto;
		float valor[] = {10.00f,15.00f,18.00f,12.00f, 8.00f,13.00f};
		float valorTotal;
		char verificadorChar;
		boolean verificadorBoolean = true;
		
		
		do {
			//Menu
			System.out.println("======================");
			System.out.println("Hambugueria do Dudu");
			System.out.println("======================");
			//Mostra os cargos
			for(int i = 0; i < 6 ; i++) {
				System.out.printf("%s ----------- %d\n",produtos[i], i+1);
			}
			System.out.println("======================");
			System.out.println();
			//Verifica se o codigo é válido
			do {
				System.out.println("Digite o codigo do produto: ");
				codProduto = leia.nextInt();
				
				if(codProduto < 1 || codProduto > 6) {
					System.out.println("Insira um número válido!");
				}
				
			}while(codProduto < 1 || codProduto > 6 );
			
			
			//Verifica o codigo para realizar o calculo e printar os resultados
			System.out.println("Digite a quantidade: ");
			qntProduto = leia.nextInt();
			
			switch (codProduto) {
		    case 1:
		    case 2:
		    case 3:
		    case 4:
		    case 5:
		    case 6:
		        valorTotal = qntProduto * valor[codProduto];
		        System.out.printf("\n\nProduto: %s\nValor total: %.2f\n", 
		                           produtos[codProduto - 1], valorTotal);
		        break;
			}

			//Executar o programa novamente
			System.out.printf("Deseja fazer um novo pedido? (y or n): ");
			verificadorChar = leia.next().charAt(0);
			leia.nextLine();
			
			if(verificadorChar == 'y') {
				//"Limpa" o console
				for (int i = 0; i < 25; ++i) {
				    System.out.println();
				}
				verificadorBoolean = true;
			}else {
				verificadorBoolean = false;
			}
			
		}while(verificadorBoolean);
		
		System.out.println();
		System.out.println("======================");
		System.out.println("Obrigado pela preferência!");
		System.out.println("======================");
		leia.close();
		
		
		
	}

}
