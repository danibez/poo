/**
 * Pessoa
 */
public class Pessoa {
    int idade;
    String nome;
    String cpf;
    int dist;

    Pessoa(int idade, String nome, String cpf, int dist){
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
        this.dist = dist;
    }
    
    Pessoa(int i, String n, String c){
        idade = i;
        nome = n;
        cpf = c;
        dist = 0;
    }

    void andar(int d){
        dist = dist + d;
        System.out.println("Andou " + dist + "Km");
    }

    void dormir(){
        System.out.println("Dormiu");
    }

    void aniversario(){
        idade = idade + 1;
    }
}