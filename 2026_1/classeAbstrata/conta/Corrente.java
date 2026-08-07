package conta;
class Corrente extends Conta {
    private double limiteChequeEspecial = 500.0;

    public Corrente(int numero, double saldoInicial) {
        super(numero, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (saldo + limiteChequeEspecial >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " da Conta Corrente " + numero);
        } else {
            System.out.println("Saldo insuficiente na Conta Corrente " + numero);
        }
    }
}
