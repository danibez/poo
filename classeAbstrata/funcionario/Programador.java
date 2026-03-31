package funcionario;

public class Programador extends Funcionario{
    public Programador(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public void aumentaSalario(){
        setSalario(getSalario()*1.2);
    }
}
