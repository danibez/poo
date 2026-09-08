import java.util.ArrayList;

public class Turma {
    private String nome;
    private ArrayList<Pessoa> participantes;

    public Turma(String nome) {
        this.nome = nome;
        this.participantes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarPessoa(Pessoa pessoa) {
        participantes.add(pessoa);
    }

    public void analisarParticipantes() {

        for (int i = 0; i < participantes.size(); i++) {
            Pessoa pessoa = participantes.get(i);

            if (pessoa instanceof Aluno) {

                Aluno aluno = (Aluno) pessoa;
                if (aluno.foiAprovado()) {
                    System.out.println(aluno.getNome() + " foi aprovado.");
                } else {
                    System.out.println(aluno.getNome() + " foi reprovado.");
                }

            } else if (pessoa instanceof Professor) {
                
                //OUTRA POSSIBILIDADE - ((Professor) pessoa).lecionar();
                Professor professor = (Professor) pessoa;
                professor.lecionar();

            } else if (pessoa instanceof Coordenador) {
                Coordenador coordenador = (Coordenador) pessoa;
                coordenador.coordenar();
            }
        }
    }
}
