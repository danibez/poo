package formaGeo;

public class Circulo extends FormaGeometrica{
    private int raio;

    public Circulo(int raio){
        this.raio = raio;
    }

    public double area() {
        return 3.1415 * raio * raio;
    }

    public double comprimento() {
        return 2 * 3.1415 * raio;
    }
}
