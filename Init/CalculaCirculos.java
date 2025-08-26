public class CalculaCirculos {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(2);

        System.out.println("Valor do raio " + c1.getRaio());
        System.out.println(c1.area());
        // c1.raio = 3;
        c1.setRaio(-3);
        System.out.println("Valor do raio " + c1.getRaio());
        System.out.println(c1.area());

    }
}
