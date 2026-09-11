package exercicio2;

public class Main {
    public static void main(String[] args) {
        InfoCliente infoCli1 = new InfoClientePessoaFisica("123456");
        InfoCliente infoCli2 = new InfoClientePessoaFisica("111111");
        
        ClienteFidelizacao cf = new ClienteFidelizacao( "fulano",
                                                        "rua 1",
                                                        infoCli1,
                                                        0, "5 anos");
        ClienteFidelizacaoEspecial cfe = new ClienteFidelizacaoEspecial( "fulano",
                                                        "rua 2",
                                                        infoCli2,
                                                        0, "5 anos");

        cf.adicionaBonus(100);
        cf.adicionaBonus(100);
        System.out.println(cf.getBonus());
        System.out.println();
        cfe.adicionaBonus(100);
        cfe.adicionaBonus(100);
        System.out.println(cfe.getBonus());
    }
}
