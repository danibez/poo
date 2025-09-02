import java.util.Scanner;

public class StaticAttr {

    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("fulano", 20);
        Pessoa p2 = new Pessoa("cicrano", 20);
        Pessoa p3 = new Pessoa("beltrano", 20);
        Pessoa p4 = new Pessoa("maria", 20);

        System.out.println(Pessoa.contador);

    }
}

