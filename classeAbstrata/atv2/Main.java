package atv2;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        InfoCliente ic = new InfoClientePessoaFisica("12345","fulano@gmail", new Date(0));
        Cliente c = new Cliente("fulano","Rua 1", ic);
        c.getInfoCliente().exibirInfo();
    }
}
