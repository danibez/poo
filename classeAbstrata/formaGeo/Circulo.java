public class Circulo extends FormaGeom{
    private int raio;

    public Circulo(int raio){
        super();
        this.raio = raio;
    }

    public double area() {
        return 3.1415 * raio * raio;
    }

    public double comprimento() {
        return 2 * 3.1415 * raio;
    }
}
