public class Guerreiro extends Personagem {

    private int forca;
    private int defesa;

    public Guerreiro(int forca, int defesa, String nome, int nivel, int vida){
        super(nome, nivel, vida);
        this.forca = forca;
        this.defesa = defesa;
    }

    @Override
    public void receberDano(int dano) {
        setVida(getVida()- dano);
        System.out.println(getNome() + " recebeu " + dano + " de dano.");
        
    }

    @Override
    public void defender() {
        System.out.println("O guerreiro se defendeu!");
    }

    @Override
    public void usarHabilidade(Personagem alvo) {
        System.out.println("Golpe Forte!!");
    }

    @Override
    public boolean estaVivo() {
        if(getVida() <= 0)
            return false;
        return true;
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(getNome() + " atacou com sua espada!");
        alvo.receberDano(forca);
    }
    
}
