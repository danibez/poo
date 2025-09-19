package conflitos;

public interface A {
    public double PI = 3.14;
    public void fazerAlgo();
}

interface B {
    public double PI = 3;
    // public int fazerAlgo(); <= GERA ERRO
    public void fazerAlgo();
}

class MinhaClasse implements A, B {

    private int x, y;

    public MinhaClasse(int x, int y){
        this.x = x;
        this.y = y;
    }

    public MinhaClasse(){
        x = 0;
        y = 0;
    };
    
    @Override
    public void fazerAlgo() {
        // System.out.println(PI); <= GERA ERRO
        System.out.println(A.PI);
    }
    
}
