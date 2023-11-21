public class Pasajero {
    private String nombre;
    private String pasaporte;
    private int edad;
    private String comida;

    public Pasajero(String nombre, String pasaporte, int edad, String comida) {
        this.nombre = nombre;
        this.pasaporte = pasaporte;
        this.edad = edad;
        this.comida = comida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }
}
