public class OperacoesMat {
    public static double pot(double a, double b){
        double ret = 1;
        for (int i = 0; i < b; i++) {
            ret *= a;
        }
        return ret;
    }

    public static double areaCirculo(double r){
        return ConstantesMat.PI * pot(r, 2);
    }
}
