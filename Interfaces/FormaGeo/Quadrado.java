package FormaGeo;

public class Quadrado implements FormaGeometrica{
    private int lado;

    public Quadrado(int lado){
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado*lado;
    }

    public double comprimento() {
        return lado*4;
    };

}
