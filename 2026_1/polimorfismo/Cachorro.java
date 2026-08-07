public class Cachorro {
    private String nome;
    private String raca;

    public Cachorro(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }
    
    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void latir(){}

    public void dormir(){}

    public void comer(){}
}
