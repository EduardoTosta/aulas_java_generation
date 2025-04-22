package aula_06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ColecaoArrayList {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Criamos a coleção ArrayList
		ArrayList<Double> numeros = new ArrayList<Double>();
		
		//Adcionando valores na coleção ArrayList
		numeros.add(2.0);
		numeros.add(8.0);
		numeros.add(15.0);
		numeros.add(2.0);
		numeros.add(9.0);
		
		//System.out.println("Digite um numero: ");
		//double input = leia.nextDouble();
		
		//numeros.add(input);
		
		//Listando os valores da coleção ArrayList
		for(var numero : numeros) {
			System.out.println(numero);
		}
		
		System.out.println("Indice do numero 9.0: " + numeros.indexOf(9.0));
		System.out.println("Numero 9.0 existe na coleção?: " + numeros.contains(9.0));
		System.out.println("Qual valor esta armazenado no indice 2?: " + numeros.get(2));
		
		//Alterar um elemento
		numeros.set(2, 10.0);
		
		//Exibe os dados atualizados após a aualização, através do método forEach
		System.out.println("Dados exibidos após a atualização: ");
		numeros.forEach(System.out::println);
		
		//Excluir um elemento da lista
		numeros.remove(10.0);
		
		//Exibe os dados atualizados após a remoção, através do método forEach
		System.out.println("Dados exibidos após a remoção: ");
		numeros.forEach(System.out::println);
		
		System.out.println("Qual o tamanho da coleção? " + numeros.size());
		
		//Limpar coleção
		//numeros.clear();
		
		System.out.println("A coleção esta vazia? " + numeros.isEmpty());
		
		//Ordenar a coleção em ordem crescente
		numeros.sort(null);
		
		//Exibe os dados atualizados após a aualização, através do método forEach
		System.out.println("Dados exibidos após a ordenação em ordem Crescente: ");
		numeros.forEach(System.out::println);
		
		
		//Ordenar a coleção em ordem descrescente
		numeros.sort(Comparator.reverseOrder());
		
		//Exibe os dados atualizados após a aualização, através do método forEach
		System.out.println("Dados exibidos após a ordenação em ordem Decrescente: ");
		numeros.forEach(System.out::println);
		
		
		
		leia.close();

	}

}
