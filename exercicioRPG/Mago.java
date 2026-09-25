public class Mago extends Personagem {
    private int inteligencia;
    private int mana;

    public Mago(int inteligencia, int mana, String nome, int nivel, int vida){
        super(nome, nivel, vida);
        this.inteligencia = inteligencia;
        this.mana = mana;
    }

    @Override
    public void receberDano(int dano) {
        setVida(getVida() - dano);
        System.out.println(getNome() + " recebeu " + dano + " de dano.");
        
    }

    @Override
    public void defender() {
        System.out.println("O Mago se defendeu!");
    }

    @Override
    public void usarHabilidade(Personagem alvo) {
        System.out.println("Bola de fogo!!");
    }

    @Override
    public boolean estaVivo() {
        if(getVida() <= 0)
            return false;
        return true;
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(getNome() + " lançou um ataque mágico!");
        alvo.receberDano(inteligencia);
    }
}
