import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lado A: ");
        int ladoA = scanner.nextInt();

        System.out.println("Lado B: ");
        int LadoB = scanner.nextInt();

        System.out.println("Lado C: ");
        int LadoC = scanner.nextInt();

        if (ladoA == LadoB && LadoB == LadoC) {
            System.out.println("O triângulo é equilátero.");
        } else if (ladoA == LadoB || ladoA == LadoC || LadoB == LadoC) {
            System.out.println("O triângulo é isósceles.");
        } else {
            System.out.println("O triângulo é escaleno.");
        }

        scanner.close();


    }
}

