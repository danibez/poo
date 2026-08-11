public class Circulo {
    int raio;

    Circulo(int raio){
        this.raio = raio;
    }

    double area(){
        return 3.14 * this.raio * this.raio;
    }

    double comprimento(){
        return 2 * 3.14 * raio;
    }
}
