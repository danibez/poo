public class PessoaJuridica extends Pessoa{

    private String cnpj;

    public PessoaJuridica(String nome, int idade, String cnpj){
        super(nome, idade);
        this.cnpj = cnpj;
    }
    public String getCnpj() {
        return cnpj;
    }

    public String getNome() {
        return super.getNome();
    }

    @Override
    public int getIdade() {
        // TODO Auto-generated method stub
        return super.getIdade();
    }
}