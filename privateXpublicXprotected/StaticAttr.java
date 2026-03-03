
public class StaticAttr {

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("fulano", 20);

        pessoa.setNome("cicrano");
        pessoa.setIdade(18);
        
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        
        // TesteEncapsulamento t = new TesteEncapsulamento();
        // t.atrib1 = 2;
        // t.atrib2 = 2;
        // t.atrib3 = 2;
        // t.atrib4 = 2;


    }
}

