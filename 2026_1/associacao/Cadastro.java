public class Cadastro {
    public static void main(String[] args) {
        Data nascimento = new Data(15, 8, 1995);

        Telefone telefone1 = new Telefone("11", "99999-8888");
        Endereco endereco1 = new Endereco(
                "Rua das Flores",
                123,
                "Centro",
                "São Paulo",
                "SP"
        );

        Client cli = new Client("João Silva",
                "1234567",
                "123.456.789-00",
            nascimento, telefone1,endereco1);

        System.out.println(cli);
    }
}
