public class Cliente {
    String nome;
    String rg;
    String cpf;
    Telefone telefone;
    Data dataNascimento;
    Endereco endereco;

    public Cliente(String nome, String rg, String cpf,
                   Telefone telefone, Data dataNascimento,
                   Endereco endereco) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }
}