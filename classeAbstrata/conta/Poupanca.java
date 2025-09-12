package conta;
class Poupanca extends Conta {
    public Poupanca(int numero, double saldoInicial) {
        super(numero, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " da Conta Poupança " + numero);
        } else {
            System.out.println("Saldo insuficiente na Conta Poupança " + numero);
        }
    }
}
