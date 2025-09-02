
public class Conta {
    public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca(10, "Fulano", 100, 5000);
        cp.sacar(100);
        cp.depositar(50);
        double saldo = cp.getSaldo();
        cp.calcularNovoSaldo(0.05);
        System.out.println("Saldo Atual: "+ saldo + "\nNovo saldo com Taxa: " + cp.getSaldo());

        ContaEspecial ce = new ContaEspecial(-200, "Cicrano", 987, 10000);

        ce.sacar(10100);
        ce.depositar(50);
        double saldo2 = ce.getSaldo();
        System.out.println("Saldo Atual: "+ saldo2);

    }
}
