import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Divide {
    public static void main (String args[]) {
        Scanner s = new Scanner(System.in);
        try {
            int dividendo = s.nextInt();
            int divisor = s.nextInt();
            divide(dividendo, divisor);
        } catch (Exception e1) {
            System.out.println("Não pode dividir por zero!");
            System.out.println(e1.getMessage());
        }
    }

    public static void divide(int dividendo, int divisor) throws Exception {
        if (divisor == 0) {
            throw new Exception("NÃO PODE DIVIDIR POR ZERO!!!!");
        }
        System.out.println("Divisão = " + (dividendo/divisor));
    }
}
