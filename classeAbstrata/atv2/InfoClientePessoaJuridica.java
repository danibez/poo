package atv2;

import java.sql.Date;

public class InfoClientePessoaJuridica extends InfoCliente {
    private String cnpj;

    public InfoClientePessoaJuridica(String cnpj, String email, Date dataCadastro) {
        super(email, dataCadastro);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Email: " + getEmail() + "\nData: " + getDataCadastro() + "CNPJ: " + getCnpj());
    }
}
