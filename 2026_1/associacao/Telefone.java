public class Telefone {
    String ddd;
    String numero;

    Telefone(String ddd, String numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    public String toString() {
        return "(" + ddd +") " + numero;
    }
}
