package aula_07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionQueue_Ex001 {
	public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);
		
		Queue<String> filaBanco = new LinkedList<String>();
		
		int escolha = 0;
		boolean exePrograma = true;
		
		do {
			boolean verificarEscolha = true;
			System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
			System.out.println();
			System.out.println("	1 - Adicionar clientes na fila\n"
							 + "	2 - Listar todos os Clientes\n"
							 + "	3 - Retirar clientes da Fila\n"
							 + "	0 - Sair "
							 );
			System.out.println();
			System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
			
			do {
				System.out.println("Oque deseja fazer?(Escolha uma das opções acima): ");
				escolha = leia.nextInt();
				
				if(escolha < 0 || escolha > 3) {
					System.out.println("Opção inválida!");
				}else {
					verificarEscolha = false;
				}
				
			}while(verificarEscolha);
			
			
			switch(escolha) {
			case 1: //Add pessoas na fila
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				System.out.println();
				System.out.println("                ADICIONAR PESSOAS");
				System.out.println();
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				leia.nextLine();
			
				//Controla o laço de execução do case
				boolean exeAddPessoa = true;	
				
				//Excecução do programa
				do {
					//Le o input do usuário e o converte para Uooer Case
					System.out.println("Digite o nome e sobrenome da pessoa que deseja ADICIONAR: ");
					String nomePessoa = leia.nextLine().toUpperCase();
					
					//Verifica se a pessoa ja esta na lista
						if(filaBanco.contains(nomePessoa)) {
							System.out.println("Esta pessoa ja esta na fila!");
						}else {
							filaBanco.add(nomePessoa);
							System.out.println("Pessoa adicionada com sucesso!");
						}
					
					
					//Controlador de excecução do case
					System.out.println("Deseja adicionar mais alguem? (Y/N)");
					String auxBoolean = leia.nextLine().toUpperCase();
					
					if(auxBoolean.equals("N")) 
						exeAddPessoa = false;
					
				}while(exeAddPessoa);
			break; //Fim case 1
				
			case 2:
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				System.out.println();
				System.out.println("                Fila atual");
				System.out.println();
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				System.out.println(filaBanco);
				break;
				
			case 3://Remove pessoas na fila
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				System.out.println();
				System.out.println("                REMOVER PESSOAS");
				System.out.println();
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				leia.nextLine();
				
				//Controla o laço de execução do case
				boolean exeRmvPessoa = true;	
				
				//Excecução do programa
				do {
					//Le o input do usuário e o converte para Upper Case
					System.out.println("Digite o nome e sobrenome da pessoa que deseja REMOVER: ");
					String nomePessoa = leia.nextLine().toUpperCase();
					
					//Verifica se a pessoa esta na lista
						if(filaBanco.contains(nomePessoa)) {
							filaBanco.remove(nomePessoa);
							System.out.println("Pessoa removida com sucesso!");
						}else {
							System.out.println("Esta pessoa não está na fila!");
						}
					
					//Controlador de excecução do case
					System.out.println("Deseja remover mais alguem? (Y/N)");
					String auxBoolean = leia.nextLine().toUpperCase();
					
					if(auxBoolean.equals("N")) 
						exeRmvPessoa = false;
					
				}while(exeRmvPessoa);
			break;
				
				
			case 0:
				exePrograma = false;
				break;
			}
			
		}while(exePrograma);
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println();
		System.out.println("                Obrigado!");
		System.out.println();
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		leia.close();
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

