package FormaGeo;

public class Circulo implements FormaGeometrica, Impressao{
    private int raio;

    public Circulo(int raio){
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public double area(){
        return PI * raio * raio;
    }

    public double comprimento(){
        return 2 * PI * raio;
    }

    public void imprimirDados() {
        System.out.println("Raio: " + raio);
    }
}
