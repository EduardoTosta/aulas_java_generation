package aula_03;

import java.util.Scanner;

public class Ex_006 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Variáveis
		String nome;
		String cargos[] = {"Gerente", "Vendedor", "Supervisor","Motorista", "Estoquista",  "Tecnico de TI"};
		int codCargo;
		float ajuste[] = {0.10f,0.07f,0.09f,0.06f,0.05f,0.08f};
		float salario, novoSalario;
		char verificadorChar;
		boolean verificadorBoolean = true;
		
		
		do {
			//Menu
			System.out.println("======================");
			System.out.println("Reajuste de salário");
			System.out.println("======================");
			
			
			System.out.println("Digite o nome do colaborador: ");
			nome = leia.nextLine();
			//Mostra os cargos
			for(int i = 0; i < 6 ; i++) {
				System.out.printf("%s ----------- %d\n",cargos[i], i+1);
			}
			
			//Verifica se o codigo é válido
			do {
				System.out.println("Digite o codigo do cargo: ");
				codCargo = leia.nextInt();
				
				if(codCargo < 1 || codCargo > 6) {
					System.out.println("Insira um número válido!");
				}
				
			}while(codCargo < 1 || codCargo > 6 );
			
			
			//Verifica o codigo para realizar o calculo e printar os resultados
			System.out.println("Digite o salário: ");
			salario = leia.nextFloat();
			
			switch (codCargo) {
		    case 1:
		    case 2:
		    case 3:
		    case 4:
		    case 5:
		    case 6:
		        novoSalario = salario + (salario * ajuste[codCargo]);
		        System.out.printf("\nNome: %s\nCargo: %s\nNovo salário: %.2f\n", 
		                          nome, cargos[codCargo - 1], novoSalario);
		        break;
			}

			//Executar o programa novamente
			System.out.printf("Deseja fazer uma nova consulta? (y or n): ");
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
		
		System.out.println("Obrigado!");
		leia.close();
		
		
		
	}

}
