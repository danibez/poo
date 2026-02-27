public class Endereco {
    String logradouro;
    int numero;
    String bairro;
    String cidade;
    String estado;

    public Endereco(String logradouro, int numero, String bairro, String cidade, String estado) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String toString() {
        return logradouro +", " + numero +", " + bairro + ", " + cidade + "/" + estado;
    }
    
}
