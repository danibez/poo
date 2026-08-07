import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GravaArquivo {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        try {
            grava(s.next());
        } catch (IOException e) {
            System.out.println("Erro ao gravar arquivo!");
            System.out.println(e); // Imprime detalhadamente a Exceção.
            e.printStackTrace( ); // Imprime detalhadamente a Exceção.
        } catch (ExcecaoTextoInvalido e){
            System.out.println(e.getMessage());
        }
    }

    public static void grava(String texto) throws IOException, ExcecaoTextoInvalido {
        FileWriter fw = null;
        if (texto == null || texto.trim( ).equals("")) {
            throw new ExcecaoTextoInvalido("Texto inválido: " + texto);
        } else {
            fw = new FileWriter("teste.txt");
            fw.write(texto);
            fw.close();
        }
    }

    
    // public static void grava(String texto) throws IOException {
    //     FileWriter fw = new FileWriter("teste.txt");
    //     fw.write(texto);
    //     fw.close( );
    // }
}
