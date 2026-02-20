public class Circulo {
    double raio;

    Circulo(double r){
        raio = r;
    }

    double comprimento(){
        return 2 * 3.14 * raio;
    }

    double area(){
        return 3.14 * raio * raio;
    }

}
