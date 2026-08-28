public class ClientePJ extends ClienteHeranca {
    private String cnpj;

    public ClientePJ(String nome, String endereco, String cnpj){
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return  "Cliente: " + this.getNome() +
                "\nEndereco: " + this.getEndereco() +
                "\nCNPJ: " + this.cnpj;
    }
}
