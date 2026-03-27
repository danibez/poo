import java.util.UUID;

public class Funcionario {
    private String nome;
    private double salario;
    private static int totalFuncionarios = 0;
    private final String id;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
        totalFuncionarios++;
        id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public static int getTotalFuncionarios() {
        return totalFuncionarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularBonus(){
        return this.salario * 0.15;
    }

}
