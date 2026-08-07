public class ContaBancaria {

    String titular;
    int numeroConta;
    double saldo;

    ContaBancaria(String titular, int numeroConta, double saldo){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    void depositar(double valor){
        if (valor >= 0){
            saldo += valor;
            System.out.println("Operação realizada com sucesso!");
        } else {
            System.out.println("ERRO!!!!!!");
        }
    }

    void sacar(double valor){
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Operação realizada com sucesso!");
        } else {
            System.out.println("Operação negada!");
        }
    }

    void exibir(){
        System.out.println(titular + " " +saldo);
    }

}