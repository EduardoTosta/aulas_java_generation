package aula_06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ColecaoSet_Ex003 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Set<Integer> valores = new HashSet<>();

        System.out.println("================================");
        System.out.println("     Organizando os Números!    ");
        System.out.println("================================");

        System.out.print("Quantos números deseja digitar? ");
        int qntNumeros = leia.nextInt();

        int contador = 1;
        while (valores.size() < qntNumeros) {
            System.out.printf("Digite o %dº valor: ", contador);
            int input = leia.nextInt();

            // Se não conseguir adicionar (porque é repetido), avisa o usuário
            if (!valores.add(input)) {
                System.out.println("Número já digitado! Tente outro.");
            } else {
                contador++;
            }
        }

        // Exibindo com Iterator
        System.out.println("\n===============================");
        System.out.println("       Números Digitados         ");
        System.out.println("=================================");

        Iterator<Integer> iValores = valores.iterator();
        while (iValores.hasNext()) {
            System.out.println(iValores.next());
        }

        leia.close();
    }
}
