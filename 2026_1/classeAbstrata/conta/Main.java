package conta;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Corrente(1001, 100.0);
        Conta conta2 = new Poupanca(2001, 100.0);
        // Conta c = new Conta(2002, 213.0); =====> Não é permitido

        conta1.depositar(200.0);
        conta1.sacar(350.0); // Deve usar o limite

        conta2.depositar(150.0);
        conta2.sacar(300.0); // Deve falhar por falta de saldo

        System.out.println("Saldo final Conta Corrente: R$" + conta1.getSaldo());
        System.out.println("Saldo final Conta Poupança: R$" + conta2.getSaldo());
    }
}