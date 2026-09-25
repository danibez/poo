public abstract class Personagem implements Combatente{
    private String nome;
    private int nivel;
    private int vida;
    private static final int vidaMaxima = 100; 

    public Personagem(String nome, int nivel, int vida){
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void exibirStatus(){
        System.out.println("Nome: " + this.nome + " Vida: " + this.vida);
    }

    public void curar(int quantidade){
        vida += quantidade;
        if(vida > vidaMaxima)
            vida = vidaMaxima;
    }

    public abstract void atacar(Personagem alvo); 
    public abstract void usarHabilidade(Personagem alvo); 

}
