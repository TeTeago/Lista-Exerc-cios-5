// Nome: Tiago Falco França.
// Matrícula: 1261942635.

import java.util.Scanner; 

public class exercicio3 {
    
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            
            System.out.println("Digite o segundo número: ");
            double num2 = scanner.nextDouble();
            
            System.out.print("Operações: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            
            System.out.println("Escolha: ");
            int escolha = scanner.nextInt();
            
            switch (escolha) {
                case 1 -> System.out.println("Resultado: " + (num1 + num2));
                case 2 -> System.out.println("Resultado: " + (num1 - num2));
                case 3 -> System.out.println("Resultado: " + (num1 * num2));
                case 4 -> {
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Erro: divisão por zero não é permitida.");
                    }
                }
                default -> System.out.println("Opção inválida.");
            }
        }

        

    }




}



