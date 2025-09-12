package funcionario;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public void aumentaSalario(){
        setSalario(getSalario()*1.1);
    }
}
