package POO_TP4;
import java.time.LocalDate;


public class ObraTeatro {
    private int id;
    private String nombre;
    private LocalDate fechaCreacion;
    private String autor;   
    private String libro;
    
    public ObraTeatro(int id, String nombre, LocalDate fechaCreacion, String autor, String libro) {
        this.id = id;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.autor = autor;
        this.libro = libro;
    }

    @Override
    public String toString() {
        return "Obra de Teatro [id=" + id + ", nombre=" + nombre + ", fecha de creación=" + fechaCreacion + ", autor="
                + autor + ", libro=" + libro + "]";
    }
}
