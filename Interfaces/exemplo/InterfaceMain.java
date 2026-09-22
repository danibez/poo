public class InterfaceMain {
    public static void main(String[] args) {
        IExemplo ex = new Exemplo();
        System.out.println(ex.metodo1(3));

        ex = new Exemplo2();
        System.out.println(ex.metodo1(3));

    }
}
