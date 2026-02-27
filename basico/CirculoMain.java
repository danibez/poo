public class CirculoMain {

    public static void main(String[] args) {

        // Inicialização usando new
        Triangulo t1 = new Triangulo(5);            // Equilátero
        Triangulo t2 = new Triangulo(4, 6);         // Isósceles
        Triangulo t3 = new Triangulo(3, 4, 5);      // Escaleno

        System.out.println("Triângulo 1:");
        t1.exibirInformacoes();

        System.out.println("\nTriângulo 2:");
        t2.exibirInformacoes();

        System.out.println("\nTriângulo 3:");
        t3.exibirInformacoes();
    }
}