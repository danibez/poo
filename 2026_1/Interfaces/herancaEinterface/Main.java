package herancaEinterface;

public class Main {
    public static void main(String[] args) {
        Corredor c = new Cachorro();
        c.correr();
        ((Cachorro) c).dormir();
    }
}
