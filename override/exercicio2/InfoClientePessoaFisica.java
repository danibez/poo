package exercicio2;

public class InfoClientePessoaFisica extends InfoCliente{
    
    private String cpf;

    public InfoClientePessoaFisica(String cpf){
        super();
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
