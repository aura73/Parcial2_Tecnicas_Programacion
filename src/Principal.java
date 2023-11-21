import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero de la opccion que desea realizar \n 1.Crear un vuelo \n 2.Buscar un vuelo \n 3. realizar una reserva \n 4. registrar una persona");
        int op;
        op=scanner.nextInt();
        Reserva vuelos = new Reserva();
        switch (op){
            case 1:
                System.out.println("Ingrese la siguiente informacion");
                int numeroVuelo = scanner.nextInt();
                String Origen =scanner.next() ;
                String destino=scanner.next();
                int fecha= scanner.nextInt();
                int horaSalida = scanner.nextInt();
                int maxPasajeros =scanner.nextInt();
             Vuelo vuelo1 = new Vuelo(numeroVuelo,Origen,destino,fecha,horaSalida,maxPasajeros );
             vuelos.registrarVuelo(vuelo1);
            case 2:
                System.out.println("ingrese el numero de vuelo");
                int numVuelo = scanner.nextInt();
                vuelos.buscarVuelo(numVuelo);
            case 3:
                System.out.println("reservar vuelo ingrese \n pasajero \");

            case 4:
        }
    }
}