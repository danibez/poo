public class Cachorro {
    private String nome;
    private String raca;

    Cachorro(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String latir(){
        return "AUAU";
    }

    public String dormir(){
        return "zzzzzzzzz";
    }

    public String comer(){
        return "NHAM NHAM";
    }
}
