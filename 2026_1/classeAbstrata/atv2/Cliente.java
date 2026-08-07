package atv2;

public class Cliente {
    private String nome;
    private String endereco;
    private InfoCliente infoCliente;

    public Cliente(String nome, String endereco, InfoCliente infoCliente) {
        this.nome = nome;
        this.endereco = endereco;
        this.infoCliente = infoCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public InfoCliente getInfoCliente() {
        return infoCliente;
    }

    public void setInfoCliente(InfoCliente infoCliente) {
        this.infoCliente = infoCliente;
    }
}