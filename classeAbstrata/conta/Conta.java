abstract class Conta {
    protected int numero;
    protected double saldo;

    public Conta(int numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " na conta " + numero);
    }

    public double getSaldo() {
        return saldo;
    }

    // Método abstrato - comportamento depende do tipo de conta
    public abstract void sacar(double valor);
}