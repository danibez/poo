public class Funcionario {
    private String nome;
    private int matricula;
    private Departamento dept;

    Funcionario(String nome, int matricula, Departamento dept){
        this.nome = nome;
        this.matricula = matricula;
        this.dept = dept;
    }

    public Departamento getDept() {
        return dept;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setDept(Departamento dept) {
        this.dept = dept;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return "Nome do Funcionario: " + this.nome + 
                "\nMatrícula: " + this.matricula +
                "\nDepartamento: " + this.dept;
    }

}
