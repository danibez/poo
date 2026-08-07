import java.util.Scanner;

public class AgeValidator {
    public static void setAge(int age) throws IllegalArgumentException {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Idade precisa ser entre 0 e 120.");
        }
        System.out.println("Nova idade: " + age);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int idade;
        while (true) {
            idade = s.nextInt();
            try {
                setAge(idade);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("FIM!!!!!!");
    }
}

