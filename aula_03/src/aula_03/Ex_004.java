package aula_03;

import java.util.Scanner;

public class Ex_004 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String classe, tipo, dieta;
		char verificadorChar;
		boolean verificadorBoolean = true;
		
		//Condição para executar novamente
		do {
			//Menu
			System.out.println("===========================");
			System.out.println("Descobrindo os Animais!");
			System.out.println("===========================");
			System.out.println("\n");
			
			
			//Entrada de Dados
			System.out.println("Digite a classe do animal (Vertebrado ou Invertebrado): ");
			classe = leia.nextLine();
			
			
			//Esquemas de comparação
			
			//Vertebrados------------------------------------------------------
			if(classe.equalsIgnoreCase("vertebrado")){
				//Verificação do tipo------------------------------------------------------
				System.out.println("Digite o tipo do animal (Ave, Mamífero): ");
				tipo = leia.nextLine();
				if(tipo.equalsIgnoreCase("ave")) {
					//Verificação da dieta------------------------------------------------------
					System.out.println("Digite a dieta do animal (Carnívoro, Onívoro)");
					dieta = leia.nextLine();
					if(dieta.equalsIgnoreCase("carnivoro")) {
						System.out.println("Você descobriu a Águia! Vai CURIIIINTIA!");
						//Verifica se o jogador que jogar novamente------------------------------------------------------
						System.out.println("Deseja jogar novamente? y or n");
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
						
					}//Carnívoro------------------------------------------------------
					else {
						System.out.println("Você descobriu o POMBO! Pruuuuu!");
						
						//Verifica se o jogador que jogar novamente
						System.out.println("Deseja jogar novamente? y or n");
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
					}//Onívoro------------------------------------------------------
				}//Ave------------------------------------------------------
				else {
					System.out.println("Digite a dieta do animal (Onívoro, Herbívoro)");
					dieta = leia.nextLine();
					if(dieta.equalsIgnoreCase("onivoro")) {
						System.out.println("Você descobriu o HOMEM! Cubra-o novamente, está frio aqui!");
						
						//Verifica se o jogador que jogar novamente------------------------------------------------------
						System.out.println("Deseja jogar novamente? y or n");
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
					}//Onívoro------------------------------------------------------
					else {
						System.out.println("Você descobriu a VACA! Muuuuuuuu!");
						
						//Verifica se o jogador que jogar novamente
						System.out.println("Deseja jogar novamente? y or n");
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
					}//Herbívoro------------------------------------------------------
		
				}//Mamífero------------------------------------------------------
				
			}//Vertebrado------------------------------------------------------
			
			//Invertebrados------------------------------------------------------
			else {
				//Verificação do tipo ------------------------------------------------------
				System.out.println("Digite o tipo do animal (Inseto, Anelídeo): ");
				tipo = leia.nextLine();
				if(tipo.equalsIgnoreCase("inseto")) {
					//Verificação da Dieta ------------------------------------------------------
					System.out.println("Digite a dieta do animal (Hematófago, Herbívoro)");
					dieta = leia.nextLine();
					if(dieta.equalsIgnoreCase("hematofago")) {
						System.out.println("Você descobriu a PULGA! E agora está se coçando");
						
						//Verifica se o jogador que jogar novamente------------------------------------------------------
						System.out.println("Deseja jogar novamente? y or n");
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
					}//Hematófago------------------------------------------------------
					else {
						System.out.println("Você descobriu a LAGARTA! *Algo engraçado aqui*");
						
						//Verifica se o jogador que jogar novamente
						System.out.println("Deseja jogar novamente? y or n");
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
					}//herbívoro------------------------------------------------------
				}//Inseto------------------------------------------------------
				else {
					System.out.println("Digite a dieta do animal (Hematófago, Onívoro)");
					dieta = leia.nextLine();
					if(dieta.equalsIgnoreCase("hematofago")) {
						System.out.println("Você descobriu a SANGUESUGA! B? Eu so tomo sangue tipo A!");
						
						//Verifica se o jogador que jogar novamente
						System.out.println("Deseja jogar novamente? y or n");
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
					}//Hematófago------------------------------------------------------
					else {
						System.out.println("Você descobriu a MINHOCA! .....Lá ele");
						
						//Verifica se o jogador que jogar novamente
						System.out.println("Deseja jogar novamente? y or n");
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
					}//Onívoro------------------------------------------------------
				}//Anelídeo------------------------------------------------------
			}//Invertebrado------------------------------------------------------
		}while(verificadorBoolean);
		
		System.out.println("Obrigado por jogar!");
		leia.close();
		

	}

}
