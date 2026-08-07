public class Gerente extends Funcionario {
    private String depart;

    public Gerente(String nome, double salario, String depart){
        super(nome, salario);
        this.depart = depart;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getNome() {
        return super.getNome();
    }

    public void setNome(String nome) {
        super.setNome(nome);
    }

    public double getSalario() {
        return super.getSalario();
    }

    public void setSalario(double salario) {
        super.setSalario(salario);
    }

    public String getId() {
        return super.getId();
    }

    public double calcularBonusGerente(){
        return super.getSalario() * 0.2;
    }

}
