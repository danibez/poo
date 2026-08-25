public class Pagamento {

    public static final String APROVADO = "APROVADO";
    public static final String NEGADO = "NEGADO";
    public static final String PENDENTE = "PENDENTE";

    private String cliente;
    private double valor;
    private String status;

    private static int totalPagamentos = 0;

    public Pagamento(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
        this.status = PENDENTE;
        totalPagamentos++;
    }

    public void exibirDados() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Valor: R$ " + valor);
        System.out.println("--------------------");
    }

    public void aprovar() {
        status = APROVADO;
    }

    public void negar() {
        status = NEGADO;
    }

    public static int getTotalPagamentos(){
        return totalPagamentos;
    }

}
