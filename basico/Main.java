import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int lado = s.nextInt();
        
        Quadrado q1 = new Quadrado(lado);

        double area = q1.area();
        double comp = q1.comprimento();
        System.out.println("A área do quadrado é " + area);
        System.out.println("O comprimento do quadrado é " + comp);
        q1.desenha();


    }
}