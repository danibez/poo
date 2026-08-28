import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nome, endereco, info;

        nome = s.next();
        endereco = s.next();
        info = s.next();
        ClienteHeranca pf = new ClientePF(nome, endereco, info);
        imprime(pf);

        nome = s.next();
        endereco = s.next();
        info = s.next();
        ClienteHeranca pj = new ClientePJ(nome, endereco, info);
        imprime(pj);
    }

    public static void imprime(ClienteHeranca p){
        System.out.println("Nome da Pessoa: " + p.getNome());
        System.out.println("Endereco da Pessoa: " + p.getEndereco());
        if(p instanceof ClientePF)
            System.out.println("CPF da Pessoa: " + ((ClientePF)p).getCpf() );
        else
            System.out.println("CNPJ da Pessoa: " + ((ClientePJ)p).getCnpj() );
    }

}
