// Nome: Tiago Falco França.
// Matrícula: 1261942635.

import java.util.Scanner;

public class exercicio5 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

         int numero;
         int soma = 0;

        System.out.println("Digite um número (0 para encerrar): ");
        numero = scanner.nextInt(); 

        while (numero != 0) {
            soma += numero; 
            System.out.println("Digite um número (0 para encerrar): ");
            numero = scanner.nextInt(); 
        }

        System.out.println("Soma total: " + soma);

        scanner.close();

    }

}