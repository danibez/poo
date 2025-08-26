public class Pessoa {
    private String nome;
    private int idade;
    public static int contador = 0;
    public Pessoa(String nome, int idade) {
        this.setNome(nome);
        this.setIdade(idade);
        contador++;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}