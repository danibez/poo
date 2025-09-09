package atividadeSala;

public class Main {
    public static void interagirComAnimais(Animal[] animais) {
        for (int i = 0; i < animais.length; i++) {
            animais[i].fazerSom();

            if (animais[i] instanceof Cachorro) {
                Cachorro cachorro = (Cachorro) animais[i];
                cachorro.abanarRabo();
            } else if (animais[i] instanceof Gato) {
                Gato gato = (Gato) animais[i];
                gato.arranharMoveis();
            }
        }
    }

    public static void main(String[] args) {
        Animal[] animais = new Animal[3];
        animais[0] = new Cachorro();
        animais[1] = new Gato();
        animais[2] = new Cachorro();

        interagirComAnimais(animais);
    }
}
