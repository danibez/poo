public class AppCachorro {

    public static void imprimeCachorro(Cachorro c){
        System.out.println("Nome: " + c.getNome());
        System.out.println("Raca: " + c.getRaca());
        System.out.println("Lata: "+ c.latir());
        if (c instanceof CachorroAdestrado) {
            System.out.println( ((CachorroAdestrado)c).fingirDeMorto());            
        }
    }

    public static void main(String[] args) {
        Cachorro c = new Cachorro("pluto", "viralata");
        Cachorro ca = new CachorroAdestrado("floquinho", "mato");

        imprimeCachorro(c);
        System.out.println();
        imprimeCachorro(ca);
    }
}
