package POO_TP4;

public class Actor {
    private long cuil;
    private String apellido;
    private String nombre;
    private String nombreArtistico;

    public Actor(long cuil, String apellido, String nombre, String nombreArtistico) {
        this.cuil = cuil;
        this.apellido = apellido;
        this.nombre = nombre;
        this.nombreArtistico = nombreArtistico;
    }

    @Override
    public String toString() {
        return "Actor [CUIL=" + cuil + ", Apellido=" + apellido + ", Nombre=" + nombre + ", Nombre Artístico=" + nombreArtistico + "]";
    }
}
