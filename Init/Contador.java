public class Contador {
    static int count = 0;

    public Contador(){
        count++;
    }

    public void p(){
        System.out.println(count);
    }

    public static int max(int a, int b){
        if (a >= b)
            return a;
        return b;
    }

    

}
