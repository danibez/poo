public class Retangulo {
    int largura;
    int comprimento;

    Retangulo(int largura, int comprimento){
        this.largura = largura;
        this.comprimento = comprimento;
    }

    Retangulo(){}

    int area(){
        return largura * comprimento;
    }

}
