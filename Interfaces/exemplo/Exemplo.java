public class Exemplo implements IExemplo {

    public Exemplo(){

    }

    @Override
    public String metodo1(int var) {
        return "Metodo1 "+ var;
    }

    @Override
    public void metodo2() {
        System.out.println("Metodo2");
    }

    @Override
    public void metodo3() {
        System.out.println("Metodo3");
    }
    
}
