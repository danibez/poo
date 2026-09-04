public class CachorroAdestrado extends Cachorro {

    public CachorroAdestrado(String nome, String raca){
        super(nome, raca);
    }
    
    public String deitar(){
        return "deitei";
    }

    public String rolar(){
        return "rolei";
    }

    public String fingirDeMorto(){
        return "morri";
    }

}
