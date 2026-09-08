public class Main {
    public static void main(String[] args) {

        Turma turma = new Turma("3ºP - SIN");

        Aluno aluno1 = new Aluno("João", 17, 8.5);
        Aluno aluno2 = new Aluno("Maria", 16, 6.0);
        Aluno aluno3 = new Aluno("Pedro", 17, 7.2);

        Professor professor1 = new Professor("Carlos", 40, "Programação");
        Professor professor2 = new Professor("Ana", 35, "Banco de Dados");

        Coordenador coordenador = new Coordenador("Roberto", 50, "Informática");

        turma.adicionarPessoa(aluno1);
        turma.adicionarPessoa(aluno2);
        turma.adicionarPessoa(aluno3);

        turma.adicionarPessoa(professor1);
        turma.adicionarPessoa(professor2);

        turma.adicionarPessoa(coordenador);

        turma.analisarParticipantes();
    }
}
