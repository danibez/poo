public class ContaEspecial extends ContaBancaria {
    private float limite;

    public ContaEspecial(float limite, String cliente, int num_conta, double saldo){
        super(cliente, num_conta, saldo);
        this.limite = limite;
    }

    @Override
    boolean sacar(double valor) {
        if(getSaldo() - valor >= limite){
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }
}
