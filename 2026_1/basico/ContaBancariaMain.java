import java.util.Scanner;

public class ContaBancariaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int op = -1;
        while (op != 0) {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Exibir saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            op = s.nextInt();

            switch (op) {
                case 1:
                    s.nextLine(); // limpar buffer
                    System.out.print("Digite o nome do titular: ");
                    String nome = s.nextLine();

                    System.out.print("Digite o número da conta: ");
                    int numero = s.nextInt();

                    System.out.print("Digite o saldo inicial: ");
                    double saldoInicial = s.nextDouble();

                    ContaBancaria cb = new ContaBancaria(nome, numero, saldoInicial);                                        
                    break;
            
                default:
                    break;
            }

        }

    }
}
