public class AplicacaoQuadrado {
    public static void main(String[] args) {
        Quadrado quad = new Quadrado(5);
        System.out.println("A área do quadrado é " + quad.area());
        System.out.println("O comprimento do quadrado é "+quad.comprimento());
        quad.desenha();
    }
}

