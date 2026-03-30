// Nome: Tiago Falco França.
// Matrícula: 1261942635.

import java.util.Scanner;

public class exercicio7 {
    
    public static void main(String[] args) throws Exception {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota: (0 a 100)"); 
        double nota = scanner.nextDouble();

        while (nota < 0 || nota > 100) {
            System.out.println("Nota inválida. Tente novamente." );
            nota = scanner.nextDouble();
        }


        if (nota >= 90 && nota <= 100) {
            System.out.println("A");
        } else if (nota >= 75 && nota < 90) {
            System.out.println("B");
        } else if (nota >= 60 && nota < 75) {
            System.out.println("C");
        } else if (nota <= 60 ){
            System.out.println("D (Reprovado)");
        } 
        

        scanner.close();
    
    }

}
