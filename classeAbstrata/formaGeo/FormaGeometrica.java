package formaGeo;

public abstract class FormaGeometrica {
    public abstract double area();
    public abstract double comprimento();

    public double CalculaArea(){
        return area();
    }

    public double CalculaComprimento(){
        return comprimento();
    }
}