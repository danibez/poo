public class Quadrado {
    int lado;

    Quadrado (int lado){
        this.lado = lado;
    }

    Quadrado(){}

    double area(){
        return lado * lado;
    }

    double comprimento(){
        return 4 * this.lado;
    }

    void desenha(){
        for (int i = 0; i < this.lado; i++) {
            for (int j = 0; j < this.lado; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
