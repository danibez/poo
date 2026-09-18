public class Quadrado extends FormaGeom{
    private int lado;

    public Quadrado(int lado){
        super();
        this.lado = lado;
    }

    public double area() {
        return lado * lado;
    }

    public double comprimento() {
        return lado * 4;
    }

    

}
