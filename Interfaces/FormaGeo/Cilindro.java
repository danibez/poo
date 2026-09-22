package FormaGeo;

public class Cilindro implements FormaGeometrica {
    private int altura, raio;

    public Cilindro(int altura, int raio){
        this.altura = altura;
        this.raio = raio;
    }

    public int getAltura() {
        return altura;
    }

    public int getRaio() {
        return raio;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void setRaio(int raio) {
        this.raio = raio;
    }

    public double area() {
        return 2*PI*raio*raio + 2*PI*raio*altura;
    }

    public double comprimento() {
        return 2*PI*raio*altura;
    }

}
