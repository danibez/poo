import java.util.Scanner;

public class AplicacaoPessoa {
    public static void main(String[] args){
        Pessoa p = null;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String n = s.next();
            int id = s.nextInt();
            p = new Pessoa(n, id);
            System.out.println(p.getNome());
            System.out.println(p.getIdade());
            System.out.println(Pessoa.contador);
        }
        Math.pow(0, 0)
    }

}
