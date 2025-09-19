// Interface 1
interface Animal {
    void comer();
}

// Interface 2
interface SerVivo {
    void respirar();
}

// Interface que herda as duas interfaces acima
interface Mamifero extends Animal, SerVivo {
    void amamentar();
}

// Classe que implementa a interface Mamifero (e indiretamente Animal e SerVivo)
class Cachorro implements Mamifero {

    public void comer() {
        System.out.println("Cachorro comendo...");
    }

    public void respirar() {
        System.out.println("Cachorro respirando...");
    }

    public void amamentar() {
        System.out.println("Cachorro amamentando filhotes...");
    }
}

// Classe principal para teste
public class Main {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.comer();
        c.respirar();
        c.amamentar();
    }
}
