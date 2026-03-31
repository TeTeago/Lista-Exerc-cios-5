    // Nome: Tiago Falco França.
    // Matrícula: 1261942635.

    import java.util.Scanner;

    public class exercio10 {
        
        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);
            
            double saldo = 1000.0;
            int opcao = 0;

             while (opcao != 0) {
            System.out.println("1 - Depositar | 2 - Sacar | 3 - Consultar saldo | 0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
                
                switch (opcao) {
                    case 1:
                        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                        break;
                    case 2:
                        System.out.printf("Digite o valor a depositar: R$ %.2f%n", saldo);
                        double deposito = scanner.nextDouble();
                        saldo += deposito;
                        System.out.printf("Depósito realizado. Novo saldo: R$ %.2f%n", saldo);
                        break;
                    case 3:
                        System.out.printf("Digite o valor a sacar: R$ %.2f%n", saldo);
                        double saque = scanner.nextDouble();
                        if (saque <= saldo) {
                            saldo -= saque;
                            System.out.printf("Saque realizado. Novo saldo: R$ %.2f%n", saldo);
                        } else {
                            System.out.printf("Saldo insuficiente. Saldo disponível: R$ %.2f%n", saldo);
                        }
                        break;
                    case 0:
                        System.out.println("Obrigado. Até logo!");
                        break;
                }
            }
        
            scanner.close();
        
        }

    }
