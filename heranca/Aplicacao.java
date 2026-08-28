import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nome, info;
        int idade;

        nome = s.next();
        idade = s.nextInt();
        info = s.next();
        Pessoa pf = new PessoaFisica(nome, idade, info);
        imprime(pf);

        nome = s.next();
        idade = s.nextInt();
        info = s.next();
        Pessoa pj = new PessoaJuridica(nome, idade, info);
        imprime(pj);
    }

    public static void imprime(Pessoa p){
        System.out.println("Nome da Pessoa: " + p.getNome());
        System.out.println("Idade da Pessoa: " + p.getIdade());
        if(p instanceof PessoaFisica)
            System.out.println("CPF da Pessoa: " + ((PessoaFisica)p).getCpf() );
        else
            System.out.println("CNPJ da Pessoa: " + ((PessoaJuridica)p).getCnpj() );
    }

}
