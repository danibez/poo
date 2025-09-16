package FormaGeo;

public class Circulo implements Impressao, FormaGeometrica{
    private int raio;
    private static final double PI = 3.1415;

    public Circulo(int raio){
        this.raio = raio;
    }

    @Override
    public double area() {
        return PI*raio*raio;
    }

    @Override
    public double comprimento(){
        return 2*PI*raio;
    }

    @Override
    public void imprimirDados() {
        System.out.println("Circulo de raio " + raio + ", area " + area() + " e comprimento " + comprimento());
    }
}
