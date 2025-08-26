public class Departamento {
    private int codigo;
    private String nome;

    public Departamento(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public void setCodigo(int cod){
        codigo = cod;
    }

    public void setNome(String n){
        nome = n;
    }

    public String toString(){
        return "Nome do Departamento: " + getNome() + "\nCódigo do Departamento: " + getCodigo();
    }

}
