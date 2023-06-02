package POO_TP4;

public class Teatro {
    private String nombre;
    private int capacidad;
    private String direccion;
    private int codigoPostal;
    private String ciudad;

    @Override
    public String toString() {
        return "Teatro{" +
                "nombre='" + nombre + '\'' +
                ", capacidad=" + capacidad +
                ", direccion='" + direccion + '\'' +
                ", codigoPostal=" + codigoPostal +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }

    public Teatro(String nombre,int capacidad,String direccion,int codigoPostal,String ciudad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
    } 
}
