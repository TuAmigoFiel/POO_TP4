package POO_TP4;
import java.util.ArrayList;
import java.util.Date;

public class Funciones {
    private String titulo;
    private String descripcion;
    private String genero;
    private String turno;
    private ArrayList<Actor> actores = new ArrayList<>();
    private ArrayList<Date> fechasDePresentacion = new ArrayList<>();
    private ArrayList<ObraTeatro> obrasteatrales = new ArrayList<>();
    private ArrayList<Teatro> teatros = new ArrayList<>();

    public Funciones(String titulo, String descripcion, String genero, String turno) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.genero = genero;
        this.turno = turno;
    }
    public void agregarActor(Actor actor) {
        actores.add(actor);
    }

    public void agregarFechaDePresentacion(Date fecha) {
        fechasDePresentacion.add(fecha);
    }

    public void agregarObraTeatral(ObraTeatro obra) {
        obrasteatrales.add(obra);
    }

    public void agregarTeatro(Teatro teatro) {
        teatros.add(teatro);
    }

    @Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Funciones [Título=").append(titulo)
            .append(", Descripción=").append(descripcion)
            .append(", Género=").append(genero)
            .append(", Turno=").append(turno)
            .append("]\n");

    sb.append("Actores:\n");
    for (int i = 0; i < actores.size(); i++) {
        Actor actor = actores.get(i);
        sb.append("Índice ").append(i).append(": ").append(actor.toString()).append("\n");
    }

    sb.append("Fechas de Presentación:\n");
    for (int i = 0; i < fechasDePresentacion.size(); i++) {
        Date fecha = fechasDePresentacion.get(i);
        sb.append("Índice ").append(i).append(": ").append(fecha.toString()).append("\n");
    }

    sb.append("Obras Teatrales:\n");
    for (int i = 0; i < obrasteatrales.size(); i++) {
        ObraTeatro obra = obrasteatrales.get(i);
        sb.append("Índice ").append(i).append(": ").append(obra.toString()).append("\n");
    }

    sb.append("Teatros:\n");
    for (int i = 0; i < teatros.size(); i++) {
        Teatro teatro = teatros.get(i);
        sb.append("Índice ").append(i).append(": ").append(teatro.toString()).append("\n");
    }

    return sb.toString();
}

}
