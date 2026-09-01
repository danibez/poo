public class Main {
    public static void main(String[] args) {
        // 1. Criar um objeto Gerente
        Gerente gerente = new Gerente("Carlos Silva", "123.456.789-00", 12000.00, "Tecnologia da Informação");

        // 2. Criar dois objetos Desenvolvedor
        Desenvolvedor dev1 = new Desenvolvedor("Ana Souza", "111.222.333-44", 7500.00, "Java");
        Desenvolvedor dev2 = new Desenvolvedor("Bruno Lima", "555.666.777-88", 8000.00, "Python");

        // 3. Criar dois objetos Projeto, associando um desenvolvedor a cada um
        Projeto projeto1 = new Projeto("Sistema E-Commerce", "Plataforma web para vendas online", dev1);
        Projeto projeto2 = new Projeto("App de Logística", "Aplicativo mobile para rastreamento de cargas", dev2);

        // 4. Criar um objeto Empresa com o gerente criado
        Empresa empresa = new Empresa(gerente);

        // 5. Adicionar os projetos à empresa
        empresa.adicionarProjeto(projeto1);
        empresa.adicionarProjeto(projeto2);

        // 6. Exibir os dados da empresa, gerente, projetos e desenvolvedores
        System.out.println(empresa);
    }
}