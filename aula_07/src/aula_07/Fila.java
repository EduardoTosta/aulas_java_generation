package aula_07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {
	public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Eduardo");
		fila.add("Bruno");
		fila.add("Maria");
		
		System.out.println(fila);
		
		//Remove um elemento da fila
		fila.remove("Bruno");
		
		System.out.println(fila);
		
		//ADD um elemento ao final da fila
		fila.add("Thiago");
		
		System.out.println(fila);
		
		//Exibe o primeiro elemento da fila
		System.out.println(fila.peek());
		
		System.out.println(fila);
		
		//Exibe e renove o ultimo elemento da fila
		System.out.println(fila.poll());
		
		System.out.println(fila);
		
		//Contains
		System.out.println("A Maria esta na fila? " + fila.contains("Maria"));
		System.out.println("O Bruno esta na fila? " + fila.contains("Bruno"));
		System.out.println("Qual o tamanho da fila? " + fila.size()); 
		
		
		//Buscar pessoas
		int contador = 0;
		
		System.out.println("Quem deseja procurar? ");
		String nomePessoa = leia.next();
		
		for(var pessoa : fila) {
			contador++;
			
			if(pessoa.equalsIgnoreCase(nomePessoa)){
				System.out.printf("\n%s esta na posição %d: ",nomePessoa, contador);
			}
		}
		
		
		
		
		
		
		
		
		leia.close();
	}
}
