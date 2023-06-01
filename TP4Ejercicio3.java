package POO_TP4;

import java.sql.Date;

public class TP4Ejercicio3 {
    public static void main(String[] args) {
        Estudiante pepe = new Estudiante("pepe");
        System.out.println(pepe.toString());
    }
    
}
abstract class Persona{
    String nombre;
    String direccion;
    int telefono;
    String correo;
    public String toString(){
        return getClass().getSimpleName() + ": " + nombre;
    }
    public Persona(String nombre){
        this.nombre = nombre;
    }
}
class Estudiante extends Persona{
    String anio;

    
    Estudiante(String nombre){
        super(nombre);
    }
}
abstract class Empleado extends Persona{
    double salario;
    Date contratoFecha;
    Empleado(String nombre){
        super(nombre);
    }
}
class Docente extends Empleado{
    String cargo;
    
    Docente(String nombre){
        super(nombre);
    }
}
class NoDocente extends Empleado{
    String titulo;
    
    NoDocente(String nombre){
        super(nombre);
    }
}

