package atividadeSala;

public class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O gato faz: Miau!");
    }

    public void arranharMoveis() {
        System.out.println("O gato está arranhando os móveis.");
    }
}
