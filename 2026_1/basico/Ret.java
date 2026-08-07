public class Ret {
    int base;
    int altura;

    Ret (int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    Ret(){
        this.base = 0;
        this.altura = 0;
    }

    double area(){
        return this.base * this.altura;
    }
}

