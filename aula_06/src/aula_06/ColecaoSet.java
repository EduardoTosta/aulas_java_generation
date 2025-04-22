package aula_06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		Set<String> frutas = new HashSet<String>();
		
		frutas.add("Maçã");
		frutas.add("Morango");
		frutas.add("Abacaxi");
		frutas.add("Banana");
		frutas.add("Maçã");

		System.out.println(frutas);
		
		/*for(var fruta : frutas) {
			System.out.println(fruta.hashCode());
		}*/
		
		System.out.println("Morango existe na coleção?: " + frutas.contains("Morango"));
		
		//Excluir um elemento da coleção
		frutas.remove("Banana");
		
		//Criar um Iterator
		Iterator<String> iFrutas = frutas.iterator();
		
		//Listei os dados após a exclusão de um elemento
		while(iFrutas.hasNext()) {
			System.out.println(iFrutas.next());
		}
		
		//Coleção de ArrayList
		ArrayList<String> frutasList = new ArrayList<String>();
		
		//Adciona os elementos dfa coleção Set na coleção ArrayList
		frutasList.addAll(frutas);
		
		//Ordenamos frutasList em ordem  crescente
		frutasList.sort(null);
		
		System.out.println("Exibir os dados do Array List");
		frutasList.forEach(System.out::println);
		
	}

}
