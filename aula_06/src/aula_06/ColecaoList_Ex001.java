package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class ColecaoList_Ex001 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String opcoes[] = {"Adicionar cores", "Remover cores", "Ordenar lista","Verificar cor", "Mostrar a lista",  "Sair"}; 
		int codOpcoes = 0;
		boolean verificarBoolean = true;
		
		
		//Criamos a coleção ArrayList
		ArrayList<String> cores = new ArrayList<String>();
		
		System.out.println("=======================");
		System.out.println("    Vamos Colorir!"     );
		System.out.println("=======================");
			
		do {
			//Variáveis de verificação
			boolean adicionarCores = true;
			boolean removerCores = true;
			boolean verificarCores = true;
			
			//Menu
			System.out.println("======================");
			for(int i = 0; i < 6 ; i++) {
				System.out.printf("%s ----------------- %d\n",opcoes[i], i+1);
			}
			System.out.println("======================");
			System.out.println();
			
			
			//Verifica se o codigo é válido
			do {
				System.out.println("Digite o codigo da opção: ");
				codOpcoes = leia.nextInt();
				
				if(codOpcoes < 1 || codOpcoes > 6) {
					System.out.println("Insira um número válido!");
				}		
			}while(codOpcoes < 1 || codOpcoes > 6 );
			
			
			
			switch(codOpcoes){
				case 1://Preenche a lista com as cores enviadas pelo usuário
						do {
							System.out.println("Quantas cores deseja adicionar?");
							int qntCores = leia.nextInt();
							
							for(int i = 0; i < qntCores ; i++) {
								System.out.printf("Digite a %d° cor: ", i+1);
								String input = leia.next();
								cores.add(input);
							}
							
							
							System.out.println("Deseja adicionar novas cores?(Y/N): ");
							char auxBoolean = leia.next().charAt(0);
							leia.nextLine();
			
							if(auxBoolean == 'n' || auxBoolean == 'N')
								adicionarCores = false;		
							
						}while(adicionarCores);
					break;
					
				case 2: //Remove cores
					do {
						System.out.println("=======================================");
						System.out.println("    Digite a cor que deseja remover:"   );
						String input = leia.next();
						cores.remove(input);
						
						System.out.println("Deseja remover outras cores?(Y/N): ");
						char auxBoolean = leia.next().charAt(0);
						leia.nextLine();
		
						if(auxBoolean == 'n' || auxBoolean == 'N')
							removerCores = false;
						
					}while(removerCores);
					break;
					
				case 3://Ordena as cores em ordem alfabética crescente
					System.out.println("=======================");
					System.out.println("   Cores organizadas:"  );
					System.out.println("=======================");
					//Verifica se a lista possui itens
					if(cores.isEmpty()) {
						System.out.println("A lista está vazia!\n");
					}else {
						cores.sort(null);
						System.out.println("A lista foi organizada!");
					}		
					break;
					
				case 4://Verificar cores
					do {
						System.out.println("=======================================");
						System.out.println("   Digite a cor que deseja verificar:"  );
						System.out.println("=======================================");
						String input = leia.next();
						System.out.println("");
						boolean existe = cores.contains(input);
						
						if(!existe) {
							System.out.println("Cor não encontrada!");
						}else {
							System.out.printf("A cor %s está inserida na lista!\n", input);
						}
						
						System.out.println("Deseja verificar outra cor?(Y/N): ");
						char auxBoolean = leia.next().charAt(0);
						leia.nextLine();
		
						if(auxBoolean == 'n' || auxBoolean == 'N')
							verificarCores = false;
						
					}while(verificarCores);				
					break;
					
				case 5://Printa as cores adcionadas
					System.out.println("=======================");
					System.out.println("    Lista de Cores:"    );
					System.out.println("=======================");
					
					if(cores.isEmpty()) {
						System.out.println("A lista está vazia!\n");
					}else {
						for (String cor : cores) {
						    System.out.println("- " + cor);
						}	
					}			
					break;
					
				case 6:
					verificarBoolean = false;
					break;
				};
			
		}while(verificarBoolean);
		
		leia.close();		
		System.out.println("=======================");
		System.out.println("  Obrigado por Jogar!  ");
		System.out.println("=======================");
		

	}

}

