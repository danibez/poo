package atividadeSala;

public class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O cachorro faz: Au Au!");
    }

    public void abanarRabo() {
        System.out.println("O cachorro está abanando o rabo.");
    }
}