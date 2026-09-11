public class CachorroFicticio extends Cachorro {
    public CachorroFicticio(String nome, String raca){
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
