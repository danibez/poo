

public class ClientePessoaFisica extends Cliente{
    private String cpf;

    public ClientePessoaFisica(String nome, String endereco, String cpf){
        super(nome, endereco);
        this.cpf = cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
    
}
