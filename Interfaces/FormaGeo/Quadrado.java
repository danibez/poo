package FormaGeo;

public class Quadrado implements FormaGeometrica{
    private int lado;

    @Override
    public double area() {
        return lado*lado;
    }

    public double comprimento() {
        return lado*4;
    };

}
