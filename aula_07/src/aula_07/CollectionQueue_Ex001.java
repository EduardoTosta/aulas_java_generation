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
							 + "	4 - Chamar o proximo cliente\n"
							 + "	0 - Sair "
							 );
			System.out.println();
			System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
			
			do {
				System.out.println("Oque deseja fazer?(Escolha uma das opções acima): ");
				escolha = leia.nextInt();
				
				if(escolha < 0 || escolha > 4) {
					System.out.println("Opção inválida!");
				}else {
					verificarEscolha = false;
				}
				
			}while(verificarEscolha);
			
			
			switch(escolha) {
			case 1: //Add pessoas na fila
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				System.out.println();
				System.out.println("                ADICIONAR CLIENTES");
				System.out.println();
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				leia.nextLine();
			
				//Controla o laço de execução do case
				boolean exeAddPessoa = true;	
				
				//Excecução do programa
				do {
					//Le o input do usuário e o converte para Uooer Case
					System.out.println("Digite o nome e sobrenome do cliente que deseja ADICIONAR: ");
					String nomePessoa = leia.nextLine().toUpperCase();
					
					//Verifica se a pessoa ja esta na lista
						if(filaBanco.contains(nomePessoa)) {
							System.out.println("Este cliente ja esta na fila!");
						}else {
							filaBanco.add(nomePessoa);
							System.out.println("Cliente adicionado com sucesso!");
						}
					
					
					//Controlador de excecução do case
					System.out.println("Deseja adicionar mais algum cliente? (Y/N)");
					String auxBoolean = leia.nextLine().toUpperCase();
					
					boolean verificarLoop = true;
					do {
					    if (auxBoolean.equals("N")) {
					        exeAddPessoa = false;
					        verificarLoop = false;
					    } else if (auxBoolean.equals("Y")) {
					        verificarLoop = false; // Continua o loop principal
					    } else {
					        System.out.println("Opção inválida. Digite apenas Y ou N.");
					        auxBoolean = leia.nextLine().toUpperCase();
					    }
					} while (verificarLoop);
					
				}while(exeAddPessoa);
			break; //Fim case 1
				
			case 2:
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				System.out.println();
				System.out.println("                Fila atual");
				System.out.println();
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				if(filaBanco.isEmpty()) {
						System.out.println("A fila esta vazia!");
					}else {
						System.out.println(filaBanco);
					}
				break;
				
			case 3://Remove pessoas na fila
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				System.out.println();
				System.out.println("                REMOVER CLIENTES");
				System.out.println();
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				leia.nextLine();
				
				//Controla o laço de execução do case
				boolean exeRmvPessoa = true;	
				
				//Excecução do programa
				do {
					//Le o input do usuário e o converte para Upper Case
					System.out.println("Digite o nome e sobrenome do cliente que deseja REMOVER: ");
					String nomePessoa = leia.nextLine().toUpperCase();
					
					//Verifica se a pessoa esta na lista
						if(filaBanco.contains(nomePessoa)) {
							filaBanco.remove(nomePessoa);
							System.out.println("Cliente removido com sucesso!");
						}else {
							System.out.println("Este cliente não está na fila!");
						}
					
					//Controlador de excecução do case
					System.out.println("Deseja remover mais algum cliente? (Y/N)");
					String auxBoolean = leia.nextLine().toUpperCase();
					
					boolean verificarLoop = true;
					do {
					    if (auxBoolean.equals("N")) {
					    	exeRmvPessoa = false;
					        verificarLoop = false;
					    } else if (auxBoolean.equals("Y")) {
					        verificarLoop = false; //
					    } else {
					        System.out.println("Opção inválida. Digite apenas Y ou N.");
					        auxBoolean = leia.nextLine().toUpperCase();
					    }
					} while (verificarLoop);	
					
				}while(exeRmvPessoa);
			break;
			
			case 4://Funcão para chamar o proximo elemento da fila
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				System.out.println();
				System.out.println("                Chamar Cliente");
				System.out.println();
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				boolean exeChamarCliente = true;
				
				do {
					if(filaBanco.isEmpty()) {
						System.out.println("A fila está Vazia!");
					}else {
						System.out.println("Proximo cliente: "+filaBanco.poll());
					}
					
					System.out.println("Deseja chamar o próximo cliente? (Y/N)");
					String auxBoolean = leia.nextLine().toUpperCase();
					
					boolean verificarLoop = true;
					do {
					    if (auxBoolean.equals("N")) {
					    	exeChamarCliente = false;
					        verificarLoop = false;
					    } else if (auxBoolean.equals("Y")) {
					        verificarLoop = false; // 
					    } else {
					        System.out.println("Opção inválida. Digite apenas Y ou N.");
					        auxBoolean = leia.nextLine().toUpperCase();
					    }
					} while (verificarLoop);
					
				}while(exeChamarCliente);
				break;
				
			case 0:
				exePrograma = false;
				break;
			}
			
		}while(exePrograma);
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println();
		System.out.println("                Obrigado pela preferência!");
		System.out.println();
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		leia.close();
		System.exit(0);
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

