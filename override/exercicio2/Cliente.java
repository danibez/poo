package exercicio2;

public class Cliente {
    
    private String nome;
    private String endereco;
    private InfoCliente infoCli;

    public Cliente(String nome, String endereco, InfoCliente infoCli){
        this.nome = nome;
        this.endereco = endereco;
        this.infoCli = infoCli;
    }

    public String getEndereco() {
        return endereco;
    }

    public InfoCliente getInfoCli() {
        return infoCli;
    }

    public String getNome() {
        return nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setInfoCli(InfoCliente infoCli) {
        this.infoCli = infoCli;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
