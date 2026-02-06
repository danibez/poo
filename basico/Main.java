public class Main {
    public static void main(String[] args) {
        Ret r = new Ret();
        Ret r2 = new Ret();

        r2.base = 5;
        r2.altura = 10;
        System.out.println(r.area());
        System.out.println(r2.area());
        
    }    
}