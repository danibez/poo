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

    public void setCodigo(int codigo){
        if (codigo < 0) {
            throw new IllegalArgumentException(
                "O código não pode ser menor que zero."
            );
        }
        this.codigo = codigo;
    }

    public void setNome(String nome){
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException(
                "O nome não pode ser nulo ou vazio."
            );
        }
        this.nome = nome;
    }

    public String toString(){
        return getNome() + "\nCódigo do Departamento: " + getCodigo();
    }

}
