public class MainRPG {

    public static void main(String[] args) {

        Guerreiro guerreiro =
                new Guerreiro(20, 25, "Aragorn", 10, 150);

        Mago mago =
                new Mago(80, 50, "Merlin", 10, 100);

        Arqueiro arqueiro =
                new Arqueiro(100, 20, "Legolas", 10, 120);

        guerreiro.exibirStatus();
        mago.exibirStatus();
        arqueiro.exibirStatus();

        System.out.println("\n--- Batalha ---");

        guerreiro.atacar(mago);
        mago.usarHabilidade(guerreiro);

        guerreiro.defender();
        mago.atacar(guerreiro);

        arqueiro.usarHabilidade(mago);

        System.out.println("\n--- Status Final ---");

        guerreiro.exibirStatus();
        mago.exibirStatus();
        arqueiro.exibirStatus();
    }
}
