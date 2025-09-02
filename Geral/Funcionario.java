public class Funcionario {
    private String nome;
    private int matricula;
    Departamento dept;

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
        return getNome() + " " + getMatricula() + " " + getDept().toString();
    }

}
