import java.util.LinkedList;
public class Reserva {
    public LinkedList<Vuelo> vuelosDisponibles = new LinkedList<Vuelo>();


    // Complejidad temporal: O(1) - Operación de tiempo constante.
    public void registrarVuelo(Vuelo vuelo) {
        vuelosDisponibles.add(vuelo); // Agregamos el Vuelo a la lista.
    }
    public Reserva buscarVuelo(int numeroVuelo) {
        for (int i = 0; i < vuelosDisponibles.size(); i = i + 1) {
            Vuelo vuelo1 = vuelosDisponibles.get(i);
            if (numeroVuelo == vuelo1.getNumeroVuelo()) {
                return vuelo1;
            }
        }
        return null;
    }
    public void reservarVuelo (){

    }

}
