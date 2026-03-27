import java.util.ArrayList;

public class AplicacaoDev {
    public static void main(String[] args) {
        
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

        Funcionario g = new Gerente("fulano", 1000, "computação");
        Funcionario d1 = new Desenvolvedor("Cicrano", 800, "java");
        Funcionario d2 = new Desenvolvedor("Marcelo", 800, "C++");

        funcionarios.add(g);
        funcionarios.add(d1);
        funcionarios.add(d2);

        imprimeFuncs(funcionarios);
    }

    public static void imprimeFuncs(ArrayList<Funcionario> f){
        
        f.forEach((funcionario) -> {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Salario: " + funcionario.getSalario());
            if (funcionario instanceof Gerente) {
                System.out.println("Bonus do Gerente: " + ((Gerente) funcionario).calcularBonusGerente() );                
            } else if ( funcionario instanceof Desenvolvedor) {
                System.out.println("Bonus do Desenvolvedor: " + ((Desenvolvedor) funcionario).calcularBonusDesenvolvedor() );                
            } else {
                System.out.println("Bonus do Funcionario: " + funcionario.calcularBonus() );                
            }
            System.out.println("=============");
        });

        // for (Funcionario funcionario : f) {
        //     System.out.println("Nome: " + funcionario.getNome());
        //     System.out.println("Salario: " + funcionario.getSalario());
        //     if (funcionario instanceof Gerente) {
        //         System.out.println("Bonus do Gerente: " + ((Gerente) funcionario).calcularBonusGerente() );                
        //     } else if ( funcionario instanceof Desenvolvedor) {
        //         System.out.println("Bonus do Desenvolvedor: " + ((Desenvolvedor) funcionario).calcularBonusDesenvolvedor() );                
        //     } else {
        //         System.out.println("Bonus do Funcionario: " + funcionario.calcularBonus() );                
        //     }
        //     System.out.println("=============");
        // }


        // for (int i = 0; i < f.size(); i++) {
        //     System.out.println("Nome: " + f.get(i).getNome());
        //     System.out.println("Salario: " + f.get(i).getSalario());
        //     if (f.get(i) instanceof Gerente) {
        //         System.out.println("Bonus do Gerente: " + ((Gerente) f.get(i)).calcularBonusGerente() );                
        //     } else if ( f.get(i) instanceof Desenvolvedor) {
        //         System.out.println("Bonus do Desenvolvedor: " + ((Desenvolvedor) f.get(i)).calcularBonusDesenvolvedor() );                
        //     } else {
        //         System.out.println("Bonus do Funcionario: " + f.get(i).calcularBonus() );                
        //     }
        //     System.out.println("=============");
        // }

    }

}
