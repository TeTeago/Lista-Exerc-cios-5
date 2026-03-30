// Nome: Tiago Falco França.
// Matrícula: 1261942635.

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Digite um número inteiro: ");
           
            if (scanner.hasNextInt()) {
                int numero = scanner.nextInt();
                if (numero % 2 == 0) {
                    System.out.println (numero + " é par.");
                } else {
                    System.out.println(numero + " é ímpar.");
                }
                
                scanner.close();
            
            }

        }

    }

}
