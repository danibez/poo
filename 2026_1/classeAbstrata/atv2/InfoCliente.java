package atv2;

import java.sql.Date;

public abstract class InfoCliente {
    private String email;
    private Date dataCadastro;

    public InfoCliente(String email, Date dataCadastro) {
        this.dataCadastro = dataCadastro;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    // Método abstrato para exibir informações do cliente
    public abstract void exibirInfo();
}

