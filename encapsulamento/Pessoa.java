public class Pessoa {
    private String nome;
    private int idade;
    private String senha;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, String senha){
        this.senha = senha;
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if(senha.length() >= 6  )
            this.senha = senha;
        else
            System.out.println("Senha invalida!!");
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}