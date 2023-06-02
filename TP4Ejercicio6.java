package POO_TP4;
import java.time.LocalDate;
import java.util.Date;

public class TP4Ejercicio6 {
    public static void main(String[] args) {
        Funciones funcion1 = new Funciones("Cenicienta", "Buscar un zapato de cristal es lo que se hara", "Fantasia", "Tarde");
        
        // Agregar actores
        Actor actor1 = new Actor(123456789, "Gelabert", "Andre", "TuAmigoFiel");
        Actor actor2 = new Actor(987654321, "Lesiw", "Naila", "Nailon");
        funcion1.agregarActor(actor1);
        funcion1.agregarActor(actor2);
        
        // Agregar fechas de presentación
        funcion1.agregarFechaDePresentacion(new Date());
        funcion1.agregarFechaDePresentacion(new Date());
        
        // Agregar obras teatrales
        ObraTeatro obra1 = new ObraTeatro(1, "La Cenicienta", LocalDate.now(), "Disney", "Cenicienta");
        ObraTeatro obra2 = new ObraTeatro(2, "Harry Potter", LocalDate.now(), "JK Rowling", "Harry Potter y la piedra filosofal");
        funcion1.agregarObraTeatral(obra1);
        funcion1.agregarObraTeatral(obra2);
        
        // Agregar teatros
        Teatro teatro1 = new Teatro("Monarch", 600, "Crime Alley", 12345, "Gotham City");
        Teatro teatro2 = new Teatro("Imax", 400, "Centro del Conocimiento", 3345, "Posadas");
        funcion1.agregarTeatro(teatro1);
        funcion1.agregarTeatro(teatro2);
        
        // Imprimir información de la función
        System.out.println(funcion1.toString());
    }
}
