public class ContaPoupanca extends ContaBancaria{

    private int diaDeRendimento;

    public ContaPoupanca(int diaDeRendimento, String cliente, int num_conta, double saldo){
        super(cliente, num_conta, saldo);
        this.diaDeRendimento = diaDeRendimento;
    }

    public int getDiaDeRendimento() {
        return diaDeRendimento;
    }

    @Override
    public String getCliente() {
        // TODO Auto-generated method stub
        return super.getCliente();
    }

    @Override
    public int getNum_conta() {
        // TODO Auto-generated method stub
        return super.getNum_conta();
    }
    
    @Override
    public double getSaldo() {
        // TODO Auto-generated method stub
        return super.getSaldo();
    }

    @Override
    public void setCliente(String cliente) {
        // TODO Auto-generated method stub
        super.setCliente(cliente);
    }

    @Override
    public void setNum_conta(int num_conta) {
        // TODO Auto-generated method stub
        super.setNum_conta(num_conta);
    }

    @Override
    public void setSaldo(double saldo) {
        // TODO Auto-generated method stub
        super.setSaldo(saldo);
    }

    public void setDiaDeRendimento(int diaDeRendimento) {
        this.diaDeRendimento = diaDeRendimento;
    }

    void calcularNovoSaldo(double taxa){
        double saldo = getSaldo();
        setSaldo(saldo + saldo*taxa);
    }

}
