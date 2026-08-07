public class Triangulo {

    private int lado1, lado2, lado3;

    public Triangulo(int lado) {
        this.lado1 = lado;
        this.lado2 = lado;
        this.lado3 = lado;
    }

    public Triangulo(int ladoIgual, int base) {
        this.lado1 = ladoIgual;
        this.lado2 = ladoIgual;
        this.lado3 = base;
    }

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public int calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    public String tipoTriangulo() {
        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

    public void exibirInformacoes() {
        System.out.println("Lados: " + lado1 + ", " + lado2 + ", " + lado3);
        System.out.println("Tipo: " + tipoTriangulo());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}