package atv2;

import java.sql.Date;

public class InfoClientePessoaFisica extends InfoCliente {
    private String cpf;

    public InfoClientePessoaFisica(String cpf, String email, Date dataCadastro) {
        super(email, dataCadastro);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Email: " + getEmail() + "\nData: " + getDataCadastro() + "CPF: " + getCpf());
    }
}
