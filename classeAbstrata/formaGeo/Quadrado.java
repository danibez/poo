package formaGeo;

public class Quadrado extends FormaGeometrica{
    private int lado;

    public Quadrado(int lado){
        this.lado = lado;
    }

    public double area() {
        return lado * lado;
    }

    public double comprimento() {
        return lado * 4;
    }

    

}
