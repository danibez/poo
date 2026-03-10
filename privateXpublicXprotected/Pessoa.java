public class Pessoa {
    private String nome;
    private int idade;
    public static int contador = 0;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        contador++;
    }

    public static void setContador(int contador) {
        Pessoa.contador = contador;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

}