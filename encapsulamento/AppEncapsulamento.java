import java.util.Scanner;

public class AppEncapsulamento {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        Pessoa p1 = new Pessoa("fulano", "123456");
        System.out.println(p1.getSenha());

        p1.setSenha("123");
        p1.setSenha("111111111");
        System.out.println(p1.getSenha());
        






        // TesteEncapsulamento t = new TesteEncapsulamento();
        // t.atrib1 = 2;
        // // t.atrib2 = 2;
        // t.setAtrib2(2);
        // t.atrib3 = 2;
        // t.atrib4 = 2;


    }
}

