public class Endereco {
    String nomeLogradouro;
    String numero;
    String bairro;
    String cidade;
    String estado;

    public Endereco(String nomeLogradouro, String numero, String bairro,
                    String cidade, String estado) {
        this.nomeLogradouro = nomeLogradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }
}