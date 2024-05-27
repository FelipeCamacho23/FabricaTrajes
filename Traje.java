package FabricaDeTrajes;

import java.util.ArrayList;

public class Traje {
    private ArrayList<Componente> piezas;
    private String nombre;

    public Traje(String nombre, ArrayList<Componente> piezas) {
        this.nombre = nombre;
        this.piezas = piezas;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public ArrayList<Componente> getPiezas() { return piezas; }
    public void setPiezas(ArrayList<Componente> piezas) { this.piezas = piezas; }

    @Override
    public String toString() {
        return "Traje{" +
                "nombre='" + nombre + '\'' +
                ", piezas=" + piezas +
                '}';
    }
}

