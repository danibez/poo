public interface Combatente {
    void atacar(Personagem alvo); 
    void defender(); 
    void usarHabilidade(Personagem alvo); 
    void receberDano(int dano); 
    boolean estaVivo(); 
}
