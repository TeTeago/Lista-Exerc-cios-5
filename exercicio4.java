import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Digite N: ");
            int N = scanner.nextInt();

                if (N < 0) {
                    System.out.println("Valor inválido. N deve ser maior que zero. ");
                }
    
                int contador = 1;

                while (contador <= N) {
                    System.out.println(contador);
                    contador++;
                }

                scanner.close();
            
            }
    
        }
    }
