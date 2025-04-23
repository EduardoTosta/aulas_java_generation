package aula_07;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		
		//Cria a estrutura de dados Pilha
		Stack<String> pilha = new Stack<String>();
		
		
		//ADD Elementos na pilha
		pilha.add("Comunicação não violenta ");
		pilha.add("IT: A Coisa");
		pilha.add("A Coragem de ser imperfeito");
		pilha.add("Quem pensa enrriquece");
		pilha.add("Diário de um Banana");
		pilha.add("Senhor dos Aneis");
		pilha.add("O Códido daVinci");
		pilha.add("Harry Potter");
		
		System.out.println(pilha);
		
		//Usuário insere um elemento
		System.out.println("Digite o titulo de um livro: ");
		pilha.push(leia.nextLine());
		
		System.out.println(pilha);
		
		//Retira o último a ser cplocado
		pilha.pop();
		System.out.println(pilha);
		
		//Add um elemento na pilha
		pilha.push("O Hobbit");
		System.out.println(pilha);
		
		//Exibe (sem remover) o ultimo elemento da pilha
		System.out.println(pilha.peek());
		
		//Verifica se o elemento existe na pilha
		System.out.println("O lIvro Senhor dos Aneis, existe na pilha? " + pilha.contains("Senhor dos Aneis"));
		
		leia.close();
	}
}
