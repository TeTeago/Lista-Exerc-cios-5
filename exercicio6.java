// Nome: Tiago Falco França.
// Matrícula: 1261942635.


import java.util.Scanner;

public class exercicio6 {
    
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
        
    System.out.println("Digite o número: ");
        int N = scanner.nextInt();

        int multiplicador = 1;

        while (multiplicador <= 10) {
            int resultado = N * multiplicador;
            System.out.println(N + " x " + multiplicador + " = " + resultado);
            multiplicador++;
        }

            scanner.close();
   
        }

    }