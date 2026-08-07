/**
 * Pessoa
 */
public class Pessoa {
    int idade;
    String nome;
    String cpf;
    int dist;

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