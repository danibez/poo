
public class Client {
    String nome;
    String rg;
    String cpf;
    Data dataNascimento;
    Telefone telefone;
    Endereco endereco;

    Client(String nome, String rg, String cpf, Data dataNascimento, Telefone telefone, Endereco endereco) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String toString() {
        return "Nome: " + nome +
               "\nRG: " + rg +
               "\nCPF: " + cpf +
               "\nData de Nascimento: " + dataNascimento +
               "\nTelefones: " + telefone +
               "\nEndereços: " + endereco;
    }
    
}
