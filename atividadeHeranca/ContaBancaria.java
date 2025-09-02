public class ContaBancaria {
    private String cliente;
    private int num_conta;
    private double saldo;

    public ContaBancaria(String cliente, int num_conta, double saldo){
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    boolean sacar(double valor){
        if (saldo - valor >= 0) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    void depositar(double valor){
        saldo += valor;
    }

}
