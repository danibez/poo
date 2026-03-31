package FormaGeo;

public class Circulo implements FormaGeometrica, Impressao{
    private int raio;

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
        System.out.println("Raio " + raio );
    }
}
