package exercicio2;

public class ClienteFidelizacaoEspecial extends  ClienteFidelizacao {
    
    public ClienteFidelizacaoEspecial(  String nome,
                                        String endereco,
                                        InfoCliente infoCli,
                                        double bonus,
                                        String validade){
        super(nome, endereco, infoCli, bonus, validade);
    }

    @Override 
    void adicionaBonus(double valorCompra){
        setBonus(getBonus() + valorCompra*0.1);
    }

}
