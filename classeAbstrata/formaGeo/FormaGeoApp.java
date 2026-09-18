
public class FormaGeoApp {
    public static void main(String[] args) {
        FormaGeom quad = new Quadrado(3);
        FormaGeom circ = new Circulo(3);

        System.out.println(quad.area());
        System.out.println(quad.comprimento());
        System.out.println(circ.area());
        System.out.println(circ.comprimento());

    }
}
