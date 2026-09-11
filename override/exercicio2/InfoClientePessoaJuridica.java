package exercicio2;

public class InfoClientePessoaJuridica extends InfoCliente{
    private String cnpj;

    public InfoClientePessoaJuridica(String cnpj){
        super();
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
