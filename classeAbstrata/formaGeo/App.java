package formaGeo;

public class App {
    public static void main(String[] args) {
        FormaGeometrica quad = new Quadrado(3);
        FormaGeometrica circ = new Circulo(3);

        System.out.println(quad.CalculaArea());
        System.out.println(quad.CalculaComprimento());
        System.out.println(circ.CalculaArea());
        System.out.println(circ.CalculaComprimento());

    }
}
