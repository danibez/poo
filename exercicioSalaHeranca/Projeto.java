class Projeto {
    private String nome;
    private String descricao;
    private Desenvolvedor desenvolvedorResponsavel;

    public Projeto(String nome, String descricao, Desenvolvedor desenvolvedorResponsavel) {
        this.nome = nome;
        this.descricao = descricao;
        this.desenvolvedorResponsavel = desenvolvedorResponsavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Desenvolvedor getDesenvolvedorResponsavel() {
        return desenvolvedorResponsavel;
    }

    public void setDesenvolvedorResponsavel(Desenvolvedor desenvolvedorResponsavel) {
        this.desenvolvedorResponsavel = desenvolvedorResponsavel;
    }

    @Override
    public String toString() {
        String ret = "\nNome do Projeto: " + nome +
                     "\nDescrição: " + descricao +
                     "\n--- Desenvolvedor Responsável ---\n" + desenvolvedorResponsavel;
        return ret;
    }
}