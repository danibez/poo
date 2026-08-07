package exemplo;

public class Exemplo2 implements IExemplo{
    
    public Exemplo2(){

    }

    public void hello(){
        System.out.println("AAAAAAAAAAAAA");
    }

    @Override
    public void metodo1() {
        System.out.println("Metodo1");
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
