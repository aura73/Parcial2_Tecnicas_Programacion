import java.util.Scanner;

public class Vuelo extends Reserva {
    /* *
     * ATRIBUTOS
     * */
    public int numeroVuelo;
    public String Origen;
    public String destino;
    public int fecha;
    public int horaSalida;
    public int maxPasajeros;

    /**
     * metodo constructor para inicializar la clase libro
     * @param numeroVuelo
     * @param Origen
     * @param destino
     * @param fecha
     * @param horaSalida
     * @param maxPasajeros
     * O(1) Constante.
     */
    public  Vuelo (int numeroVuelo, String Origen,String destino,int fecha,int horaSalida, int maxPasajeros) {
        this.numeroVuelo = numeroVuelo;
        this.Origen = Origen;
        this.destino = destino;
        this.fecha = fecha;
        this.horaSalida = horaSalida;
        this.maxPasajeros = maxPasajeros;

    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }


}
