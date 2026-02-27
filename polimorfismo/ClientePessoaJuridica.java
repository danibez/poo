public class ClientePessoaJuridica extends Client{
    private String cnpj;

    public ClientePessoaJuridica(String nome, String endereco, String cnpj){
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }    
}

