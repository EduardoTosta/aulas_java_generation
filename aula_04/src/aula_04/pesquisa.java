//Ex_004
package aula_04;

import java.util.Scanner;

public class pesquisa {

	public static void main(String[] args) {
		//Declaração de Variáveis
		Scanner leia = new Scanner(System.in);
		String[] genero = {"Mulher Cis", "Homem Cis","Não Binário","Mulher Trans","Homem Trans","Outro"};
		String[] atuacao = {"Backend", "Frontend", "Mobile", "FullStack"};
		int idade = 0, auxGen = 0, auxAt = 0, somaIdade = 0, somaPesquisa = 0;
		int mulherFront = 0, homemMobile = 0, naoBinarioFullstack = 0, contBackend = 0;
		char verificarChar;
		boolean verificarBoolean = true, idadeValida = true, generoValido = true, atuacaoValida = true;

		
		//Título
		System.out.println("======================================================");
		System.out.println("-------- Conhecendo os Nossos DESENVOLVEDORES --------");
		System.out.println("======================================================");
		
		//Loop principal
		do {
			//Verificador de idade
			do {
				System.out.printf("Quantos anos você tem?: ");
				idade = leia.nextInt();
				if(idade > 0 && idade < 100) {
					somaIdade += idade;
					idadeValida = false;
					leia.nextLine();
				}else {
					System.out.println("Insira uma idade válida!");
					idadeValida = true;
				}		
			}while(idadeValida);
			
				
			//Verificador de codigo de gênero
			do {
				for(int i = 0; i <= 5; i++) 
					System.out.printf("%d - %-15s\n",i+1, genero[i]);
				
				System.out.printf("Qual seu gênero? (escolha entre 1 e 6): ");
				auxGen = leia.nextInt();
				if(auxGen > 0 && auxGen < 7) {
					generoValido = false;
					leia.nextLine();
				}else {
					System.out.println("Insira um código válido!");
					generoValido = true;
				}
			}while(generoValido);
				
				
			//Verificador de código de atuação
			do {
				for(int i = 0; i <= 3; i++) 
					System.out.printf("%d - %-15s\n",i+1, atuacao[i]);
					
				System.out.printf("Qual sua área de atuação? (escolha entre 1 e 4): ");
				auxAt = leia.nextInt();
				if(auxAt > 0 && auxAt < 5) {
					atuacaoValida = false;
					leia.nextLine();
				}else {
					System.out.println("Insira um código válido!");
					atuacaoValida = true;
				}
			}while(atuacaoValida);			
			
			
			//Processamento
			somaPesquisa++;
			if(auxAt == 1) {
				contBackend++;
			}
			
			if((auxGen == 1 || auxGen == 4) && auxAt == 2) {
				mulherFront++;
			}else if ((auxGen == 2 || auxGen == 5) && auxAt == 3){
				if(idade>40) 
					homemMobile++;	
			}else if ((auxGen == 3 && auxAt == 4) && idade < 30) {
				naoBinarioFullstack++;
			}

			
			
			//Verificação de continuação de cadastros
			System.out.print("Deseja cadastrar outro desenvolvedor? (S/N): ");
			verificarChar = leia.next().toUpperCase().charAt(0);

			if (verificarChar == 'S') {
			    verificarBoolean = true;
			} else {
			    verificarBoolean = false;
			}
		}while(verificarBoolean);
		
		//calculo média
		float media = (float) somaIdade / somaPesquisa;
		
		
		//Resultados 
		System.out.println("\n===== RESULTADO DA PESQUISA =====");
		System.out.println("Número de pessoas desenvolvedoras Backend: " + contBackend);
		System.out.println("Número de Mulheres (Cis e Trans) desenvolvedoras Frontend: " + mulherFront);
		System.out.println("Número de Homens (Cis e Trans) desenvolvedores Mobile maiores de 40 anos: " + homemMobile);
		System.out.println("Número de Não Binários desenvolvedores FullStack menores de 30 anos: " + naoBinarioFullstack);
		System.out.println("Número total de pessoas que responderam à pesquisa: " + somaPesquisa);
		System.out.printf("Média de idade das pessoas que responderam à pesquisa: %.2f\n", media);



		leia.close();
	}

}
