public class Funcionario {
    private String nome;
    private int matricula;
    private Departamento dept;

    public Funcionario(String nome, int matricula, Departamento dept){
        setNome(nome);
        setMatricula(matricula);
        setDept(dept);
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
        if (dept == null) {
            throw new IllegalArgumentException(
                "O departamento não pode ser nulo."
            );
        }
        this.dept = dept;
    }

    public void setMatricula(int matricula) {
        if (matricula < 0) {
            throw new IllegalArgumentException(
                "A matrícula não pode ser menor que zero."
            );
        }
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException(
                "O nome não pode ser nulo ou vazio."
            );
        }
        this.nome = nome;
    }

    public String toString(){
        return "Nome do Funcionario: " + this.nome + 
                "\nMatrícula: " + this.matricula +
                "\nDepartamento: " + this.dept;
    }

}
