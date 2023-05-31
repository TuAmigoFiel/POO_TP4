package POO_TP4;

import java.util.ArrayList;

class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + "]";
    }
}

class Pila {
    private ArrayList<Circulo> elementos;
    private int capacidad;

    public Pila() {
        this.capacidad = 10;
        this.elementos = new ArrayList<>(capacidad);
    }

    public Pila(int capacidad) {
        this.capacidad = capacidad;
        this.elementos = new ArrayList<>(capacidad);
    }

    public boolean isVacio() {
        return elementos.isEmpty();
    }

    public Circulo sacar() {
        if (isVacio()) {
            throw new IllegalStateException("La pila está vacía.");
        }
        return elementos.remove(elementos.size() - 1);
    }

    public void poner(Circulo circulo) {
        if (elementos.size() >= capacidad) {
            throw new IllegalStateException("La pila está completa.");
        }
        elementos.add(circulo);
    }

    @Override
    public String toString() {
        return "Pila: " + elementos;
    }
}

public class TP4Ejercicio1 {
    public static void main(String[] args) {
        Pila pila1 = new Pila();
        System.out.println("Pila 1 (Constructor por defecto):");
        System.out.println("Pila vacía? " + pila1.isVacio());
        System.out.println(pila1);

        Pila pila2 = new Pila(5);
        System.out.println("\nPila 2 (Constructor con capacidad 5):");
        System.out.println("Pila vacía? " + pila2.isVacio());
        System.out.println(pila2);

        Circulo circulo1 = new Circulo(3.5);
        pila2.poner(circulo1);
        System.out.println("\nDespués de agregar un círculo a la Pila 2:");
        System.out.println("Pila vacía? " + pila2.isVacio());
        System.out.println(pila2);

        Circulo sacado = pila2.sacar();
        System.out.println("\nDespués de sacar un círculo de la Pila 2:");
        System.out.println("Círculo sacado: " + sacado);
        System.out.println("Pila vacía? " + pila2.isVacio());
        System.out.println(pila2);
    }
}

