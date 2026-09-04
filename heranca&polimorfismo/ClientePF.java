public class ClientePF extends ClienteHeranca {
    private String cpf;

    public ClientePF(String nome, String endereco, String cpf){
        super(nome, endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return  "Cliente: " + this.getNome() +
                "\nEndereco: " + this.getEndereco() +
                "\nCPF: " + this.cpf;
    }
}
