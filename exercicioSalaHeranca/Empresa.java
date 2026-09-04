import java.util.ArrayList;

public class Empresa {
    private Gerente gerente;
    private ArrayList<Projeto> projetos;

    public Empresa(Gerente gerente) {
        this.gerente = gerente;
        this.projetos = new ArrayList<>();
    }

    public Empresa(Gerente gerente, ArrayList<Projeto> projetos) {
        this.gerente = gerente;
        this.projetos = projetos;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(ArrayList<Projeto> projetos) {
        this.projetos = projetos;
    }

    public void adicionarProjeto(Projeto projeto) {
        projetos.add(projeto);
    }
    @Override
    public String toString() {
        String ret =  "====== DADOS DA EMPRESA ======" + 
                        "\n--- GERENTE RESPONSÁVEL ---\n" + gerente + 
                        "\n--- PROJETOS CADASTRADOS ---";
        
        for (int i = 0; i < projetos.size(); i++) {
            ret = ret + "\n\n[ Projeto " + (i + 1) + " ]" + projetos.get(i);
        }
        
        return ret;
    }
}