public class Circulo {
    private double raio;
    public static final double PI = 3.1415;

    public Circulo(double r){
        setRaio(r);
        raio = r;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    public double getRaio(){
        return this.raio;
    }

    public double comprimento(){
        return 2 * PI * raio;
    }

    public double area(){
        return PI * raio * raio;
    }

}
