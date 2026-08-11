public class Main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(2);
        Circulo c2 = new Circulo(4);

        System.out.println("Área de C1: " + c1.area());
        System.out.println("Comprimento de C1: " + c1.comprimento());
        System.out.println("==================");
        System.out.println("Área de C2: " + c2.area());
        System.out.println("Comprimento de C2: " + c2.comprimento());
        
    }
}
