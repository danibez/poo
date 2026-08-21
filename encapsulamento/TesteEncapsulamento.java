

public class TesteEncapsulamento {
    public int atrib1;
    private int atrib2;
    protected int atrib3;
    int atrib4;
    
    public TesteEncapsulamento() {
        atrib1 = atrib2 = atrib3 = atrib4 = 0;
    }

    public void setAtrib2(int atrib2){
        this.atrib2 = atrib2;
    }

    public int getAtrib2(){
        return this.atrib2;
    }

}
