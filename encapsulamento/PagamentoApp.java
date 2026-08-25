public class PagamentoApp {

    public static void main(String[] args) {

        Pagamento pagamento1 = new Pagamento("João", 150.00);
        Pagamento pagamento2 = new Pagamento("Maria", 250.00);
        Pagamento pagamento3 = new Pagamento("Carlos", 100.00);

        pagamento1.exibirDados();
        pagamento2.exibirDados();
        pagamento3.exibirDados();

        System.out.println(
            "Total de pagamentos: " + Pagamento.getTotalPagamentos());
    }
}
