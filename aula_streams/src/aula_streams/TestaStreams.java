package aula_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class TestaStreams {

	public static void main(String[] args) {
	//Declaração de Listas
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		 
		List<Integer> numerosDesordenados = Arrays.asList(6,7,8,1,4,5,9,10,2,3);
		 
		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais","Espirito Santo", 
		"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");
		
		
	//Streams
		
		//Numeros
		List<Integer> numerosAoCubo = numeros.stream()
			.map(n -> n*n*n)
			.collect(Collectors.toList());
		
		List<Integer> numerosPares = numeros.stream()
				.filter(n -> n%2 == 0)
				.collect(Collectors.toList());
		
		//Estados
		List<String> excluiDuplicadas = estados.stream()
				.distinct()
				.collect(Collectors.toList());
		
		List<String> estadosIniciandoR = estados.stream()
				.filter(e -> e.toString().toUpperCase().startsWith("R"))
				.distinct()
				.collect(Collectors.toList());
		
		Long contagemEstadosIniciandoR = estados.stream()
				.filter(e -> e.toString().toUpperCase().startsWith("R"))
				.count();
		
		//Numeros Desorganizadps
		List<Integer> organizarLista = numerosDesordenados.stream()
				.sorted()
				.collect(Collectors.toList());
		
		
		System.out.println("Coleção números: " + numeros);
		System.out.println("Numeros elevados ao cubo: " + numerosAoCubo);
		System.out.println("Numeros pares: " + numerosPares);
		System.out.println();
		
		System.out.println("Coleção estados: " + estados);
		System.out.println("Coleção estados sem duplicadas: " + excluiDuplicadas);
		//System.out.println("Coleção estados que iniciam em R: " + estadosIniciandoR);
		estadosIniciandoR.forEach(System.out::println);
		System.out.println("Coleção quantos estados que iniciam em R: " + contagemEstadosIniciandoR);
		System.out.println();
		
		System.out.println("Numeros Desordenados" + numerosDesordenados);
		System.out.println("Numeros Ordenados" + organizarLista);
		System.out.println();
		
	}

}
