public class Hora {
    int horas;
    int minutos;
    int segundos;

    Hora(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        return this.horas + " " + this.minutos + " " + this.segundos;
    }
}
