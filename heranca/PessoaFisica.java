public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, int idade, String cpf){
        super(nome, idade);
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return super.getNome();
    }

}
