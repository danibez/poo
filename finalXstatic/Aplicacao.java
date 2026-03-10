public class Aplicacao {
    public static void main(String[] args) {
        double area = OperacoesMat.areaCirculo(2);
        imprime(area);
    }
    public static void imprime(double area) {
        System.out.println("A área é: " + area);
    }

}
