public class Arqueiro extends Personagem {
    private int agilidade;
    private int flechas;

    public Arqueiro(int agilidade, int flechas, String nome, int nivel, int vida){
        super(nome, nivel, vida);
        this.agilidade = agilidade;
        this.flechas = flechas;
    }

    @Override
    public void receberDano(int dano) {
        setVida(getVida()- dano);
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

        if (flechas > 0) {
            flechas--;

            System.out.println(getNome() + " disparou uma flecha!");
            alvo.receberDano(agilidade);

        } else {
            System.out.println("Flechas insuficientes!");
        }
    }
}
