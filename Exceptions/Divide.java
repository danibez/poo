import java.util.InputMismatchException;
import java.util.Scanner;

public class Divide {
    public static void main (String args[]) {
        Scanner s = new Scanner(System.in);
        try {
            int dividendo = s.nextInt();
            int divisor = s.nextInt();
            divide(dividendo, divisor);
        } catch (ArithmeticException e1) {
            System.out.println("Não pode dividir por zero!");
        } catch (InputMismatchException e2){
            System.out.println("Digite um valor de número válido");
        }
        
    }

    public static void divide(int dividendo, int divisor) {
        System.out.println("Divisão = " + (dividendo/divisor));
    }
}
