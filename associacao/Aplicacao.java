public class Aplicacao {
    public static void main(String[] args) {
        Telefone tel = new Telefone("81", "982739028");
        Data dataNasc = new Data(1,1,91);
        Endereco end = new Endereco("12", "0", "blabla", "recife", "PE");
        Cliente cli = new Cliente("fulano", "123456", "1111111111", tel, dataNasc, end);

        System.out.println(cli.endereco.cidade);

    }
}
