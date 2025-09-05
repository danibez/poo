public class CachorroAdestrado extends Cachorro{
    private boolean frescura;

    public CachorroAdestrado(String nome, String raca, boolean frescura) {
        super(nome, raca);
        this.frescura = frescura;
    }

    public boolean getFrescura(){
        return this.frescura;
    }

    public void deitar(){}

    public void rolar(){}

    public void fingirDeMorto(){}
    
}
