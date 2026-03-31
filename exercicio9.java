// Nome: Tiago Falco França.
// Matrícula: 1261942635.

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("=== CONVERSOR DE UNIDADES ===");
            System.out.println("1 - Quilômetros para milhas");
            System.out.println("2 - Celsius para Fahrenheit");
            System.out.println("3 - Quilogramas para Libras");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a distância em quilômetros: ");
                    double km = scanner.nextDouble();
                    double milhas = km * 0.621371;
                    System.out.printf("%.2f km = %.2f milhas%n", km, milhas);
                    break;
                case 2:
                    System.out.print("Digite a temperatura em Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = (celsius * 9/5) + 32;
                    System.out.printf("%.2f °C = %.2f °F%n", celsius, fahrenheit);
                    break;
                case 3:
                    System.out.print("Digite o peso em quilogramas: ");
                    double kg = scanner.nextDouble();
                    double libras = kg * 2.20462;
                    System.out.printf("%.2f kg = %.2f libras%n", kg, libras);
                    break;
                case 0:
                    System.out.println("Encerrando, até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
        } while (opcao != 0);
        
        scanner.close();

    }
}
