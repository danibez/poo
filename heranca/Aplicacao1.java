public class Aplicacao1 {
    public static void main(String[] args) {
        ClientePF pf = new ClientePF("fulano","rua 1", "1111111");
        ClientePJ pj = new ClientePJ("Cicrano","rua 2", "222222");
        ClienteHeranca c = new ClienteHeranca("beltrano", "rua 3");

        System.out.println(c);
        System.out.println();
        System.out.println(pf);
        System.out.println();
        System.out.println(pj);
    }
}
