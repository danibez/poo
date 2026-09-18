
public class Programador extends Func{
    public Programador(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public void aumentaSalario() {
        setSalario(getSalario()*1.05);
    }
    
}
