package POO_TP4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Alumno {
    private int legajo;
    private String nombre;
    private String apellido;
    private int nota;

    public Alumno(int legajo, String nombre, String apellido, int nota) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Legajo: " + legajo + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Nota: " + nota;
    }
}

public class TP4Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean numIngresado;
        String textnumcant;
        int cantidadAlumnos;
        ArrayList<Alumno> alumnos;
        do {
            System.out.print("Ingrese la cantidad de alumnos a cargar: ");
            textnumcant = scanner.nextLine();
            numIngresado = false;
            if (textnumcant.isEmpty()) {
                System.out.println("Error, no ha ingresado nada. Ingrese algo por favor");
            } else {
                do {
                    try {
                        cantidadAlumnos = Integer.parseInt(textnumcant);
                        alumnos = new ArrayList<>();
                        for (int i = 0; i < cantidadAlumnos; i++) {
                            System.out.println("Ingrese los datos del alumno " + (i + 1) + ":");
                            System.out.print("Legajo: ");
                            int legajo = scanner.nextInt();
                            System.out.print("Nombre: ");
                            String nombre = scanner.next();
                            System.out.print("Apellido: ");
                            String apellido = scanner.next();
                            System.out.print("Nota: ");
                            int nota = scanner.nextInt();
                
                            Alumno alumno = new Alumno(legajo, nombre, apellido, nota);
                            alumnos.add(alumno);
                        }
                
                        System.out.println("\nDatos de los alumnos:");
                
                        for (Alumno alumno : alumnos) {
                            System.out.println(alumno);
                        }
                
                        // Ordenar el ArrayList en orden decreciente según la nota de cada alumno
                        Collections.sort(alumnos, Comparator.comparingInt(Alumno::getNota).reversed());
                
                        System.out.println("\nDatos de los alumnos ordenados por nota (decreciente):");
                
                        for (Alumno alumno : alumnos) {
                            System.out.println(alumno);
                        }
                        numIngresado = true;
                        scanner.close();
                    } catch (NumberFormatException e) {
                        System.out.println("El valor ingresado no es un número válido.");
                        numIngresado = false;
                        System.out.print("Ingrese un número entero: ");
                        textnumcant = scanner.nextLine();
                    }
                } while (!numIngresado);
            }
        } while (textnumcant.isEmpty());
    }
}

