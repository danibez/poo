public class AplicacaoCliente {
 public static void main(String[ ] args) {
    // Cliente cli = new
    // ClientePessoaFisica("Fulano", "Rua tal", "123");
    Cliente cli = new
    ClientePessoaJuridica("Fulano", "Rua tal", "123");
    AplicacaoCliente.imprime(cli);
 }

 public static void imprime(Cliente c) {
    System.out.println("Nome: " + c.getNome( ));
    System.out.println("Endereço: " + c.getEndereco());
    if (c instanceof ClientePessoaJuridica)
        System.out.println("CNPJ: " + ((ClientePessoaJuridica)c).getCnpj( ));
    else if (c instanceof ClientePessoaFisica)
        System.out.println("CPF: " + ((ClientePessoaFisica)c).getCpf( ));
 }
}









// if (c instanceof ClientePessoaFisica) {
//  System.out.println("CPF: " + ((ClientePessoaFisica)c).getCpf( ));
//  } else if (c instanceof ClientePessoaJuridica) {
//  System.out.println("CNPJ: " + ((ClientePessoaJuridica)c).getCnpj( ));
//  } 