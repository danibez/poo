public class aplicacaoFuncionario {
    public static void main(String[] args) {
        Departamento departamento = new Departamento(123, "Dept. de Computacao");
        Funcionario f = new Funcionario("Fulano", 11111, departamento);

        System.out.println(f);

    }
}
