// Nome: Tiago Falco França.
// Matrícula: 1261942635.

import java.util.Scanner;

public class exercicio8 {
   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tente adivinhar o número secreto de 1 a 100: ");
        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int tentativa = 0;
        boolean acertou = false;

        while (!acertou) {
            tentativa++;
            int palpite = scanner.nextInt();

            if (palpite == numeroSecreto) {
                acertou = true;
                System.out.println("Parabéns! Você acertou na tentativa " + tentativa + "!");
                break;
            } else if (palpite < numeroSecreto) {
                System.out.println("Muito baixo. Tente um número maior.");
            } else {
                System.out.println("Muito alto. Tente um número menor.");
            }
        }

        scanner.close();

    }
}
