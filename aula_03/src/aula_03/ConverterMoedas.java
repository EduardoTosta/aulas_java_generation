package aula_03;

import java.util.Scanner;

public class ConverterMoedas {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String moeda[] = {"Euro", "Dólar Americano", "Peso Argentino"};
		float valorMoeda[] = {6.64f,6,07f,0,0049f};
		float valorReais, valorConvertido;
		int codMoeda;
		
		
		//Menu
		System.out.println("=====================");
		System.out.println("Conversor de moedas");
		System.out.println("=====================");
		
		System.out.println("Moedas disponíveis:");
		for(int i = 0; i<3;i++) {
			System.out.printf("\n%s",moeda[i]);
		}
		
		//Entrada de Dados
		System.out.println("Digite o código da moeda que deseja converter: ");
		codMoeda = leia.nextInt();
		
		System.out.printf("Digite o valor em Reais que deseja converter: ");
		valorReais = leia.nextFloat();
		
		switch(codMoeda) {
		case 1:
			valorConvertido = valorReais/valorMoeda[codMoeda];
			//System.out.printf("\n\nValor em Reais: %s\nValor em: %.2f\n", 
                    //produtos[codProduto - 1], valorTotal);
			
		}
		
		
		
		

		
		
		
		
	}
}
