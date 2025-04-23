package aula_07;

import java.util.Scanner;
import java.util.Stack;

public class CollectionStack_Ex002 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Stack<String> pilha = new Stack<String>();
		
		int escolha = 0;
		boolean exePrograma = true;
		
		do {
			boolean verificarEscolha = true;
			System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
			System.out.println();
			System.out.println("	1 - Adicionar livros na pilha\n"
							 + "	2 - Listar todos os livros\n"
							 + "	3 - Retirar livros da pilha\n"
							 + "	4 - Pegar o proximo livro\n"
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
			case 1: //Add livros na pilha
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				System.out.println();
				System.out.println("                ADICIONAR LIVROS");
				System.out.println();
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				leia.nextLine();
			
				//Controla o laço de execução do case
				boolean exeAddLivro = true;	
				
				//Excecução do programa
				do {
					//Le o input do usuário e o converte para Uooer Case
					System.out.println("Digite o título do livro que deseja ADICIONAR: ");
					String tituloLivro = leia.nextLine().toUpperCase();
					
					//Verifica se a pessoa ja esta na lista
						if(pilha.contains(tituloLivro)) {
							System.out.println("Este livro ja esta na pilha!");
						}else {
							pilha.add(tituloLivro);
							System.out.println("Livro adicionado com sucesso!");
						}
					
					
					//Controlador de excecução do case
					System.out.println("Deseja adicionar mais algum livro? (Y/N)");
					String auxBoolean = leia.nextLine().toUpperCase();
					
					boolean verificarLoop = true;
					do {
					    if (auxBoolean.equals("N")) {
					    	exeAddLivro = false;
					        verificarLoop = false;
					    } else if (auxBoolean.equals("Y")) {
					        verificarLoop = false; // Continua o loop principal
					    } else {
					        System.out.println("Opção inválida. Digite apenas Y ou N.");
					        auxBoolean = leia.nextLine().toUpperCase();
					    }
					} while (verificarLoop);
					
				}while(exeAddLivro);
			break; //Fim case 1
				
			case 2:
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				System.out.println();
				System.out.println("                Pilha atual");
				System.out.println();
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				if(pilha.isEmpty()) {
						System.out.println("---------------------------------------------");
						System.out.println("A pilha esta vazia!");
						System.out.println("---------------------------------------------");
					}else {
						System.out.println("---------------------------------------------");
						System.out.println(pilha);
						System.out.println("---------------------------------------------");
					}
				break;
				
			case 3://Remove livros na pilha
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				System.out.println();
				System.out.println("                REMOVER LIVRO");
				System.out.println();
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				leia.nextLine();
				
				//Controla o laço de execução do case
				boolean exeRmvLivro = true;	
				
				//Excecução do programa
				do {
					//Le o input do usuário e o converte para Upper Case
					System.out.println("Digite o título do livro que deseja REMOVER: ");
					String tituloLivro = leia.nextLine().toUpperCase();
					
					//Verifica se a pessoa esta na lista
						if(pilha.contains(tituloLivro)) {
							pilha.remove(tituloLivro);
							System.out.println("---------------------------------------------");
							System.out.println("Livro removido com sucesso!");
							System.out.println("---------------------------------------------");
						}else {
							System.out.println("---------------------------------------------");
							System.out.println("Este livro não está na pilha!");
							System.out.println("---------------------------------------------");
						}
					
					//Controlador de excecução do case
					System.out.println("Deseja remover mais algum livro? (Y/N)");
					String auxBoolean = leia.nextLine().toUpperCase();
					
					boolean verificarLoop = true;
					do {
					    if (auxBoolean.equals("N")) {
					    	exeRmvLivro = false;
					        verificarLoop = false;
					    } else if (auxBoolean.equals("Y")) {
					        verificarLoop = false; //
					    } else {
					        System.out.println("Opção inválida. Digite apenas Y ou N.");
					        auxBoolean = leia.nextLine().toUpperCase();
					    }
					} while (verificarLoop);	
					
				}while(exeRmvLivro);
			break;
			
			case 4://Funcão para chamar o proximo elemento da fila
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				System.out.println();
				System.out.println("                RETIRAR LIVRO DO TOPO");
				System.out.println();
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				boolean exePegarLivro = true;
				
				do {
					if(pilha.isEmpty()) {
						System.out.println("A Pilha está Vazia!");
					}else {
						System.out.println("---------------------------------------------");
						System.out.println("Livro retirado: " + pilha.pop());
						System.out.println("---------------------------------------------");
					}
					leia.nextLine();
					
					System.out.println("Deseja pegar o próximo livro? (Y/N)");
					String auxBoolean = leia.nextLine().toUpperCase();
					
					boolean verificarLoop = true;
					do {
					    if (auxBoolean.equals("N")) {
					    	exePegarLivro = false;
					        verificarLoop = false;
					    } else if (auxBoolean.equals("Y")) {
					        verificarLoop = false; // 
					    } else {
					        System.out.println("Opção inválida. Digite apenas Y ou N.");
					        auxBoolean = leia.nextLine().toUpperCase();
					    }
					} while (verificarLoop);
					
				}while(exePegarLivro);
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
	}

}
