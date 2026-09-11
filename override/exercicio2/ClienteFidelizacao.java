package exercicio2;

public class ClienteFidelizacao extends Cliente {
    private double bonus;
    private String validade;

    public ClienteFidelizacao(  String nome,
                                String endereco,
                                InfoCliente infoCli,
                                double bonus,
                                String validade){
        super(nome, endereco, infoCli);
        this.bonus = bonus;
        this.validade = validade;
    }

    public double getBonus() {
        return bonus;
    }

    public String getValidade() {
        return validade;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    void adicionaBonus(double valorCompra){
        this.bonus += valorCompra*0.05;
    }
}
