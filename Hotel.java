
import java.util.*;

public class Hotel {

    private String nombre;
    private String ubicacion;
    private int capacidad;
    private int numhabitaciones;
    ArrayList<Habitaciones> listadehabitaciones = new ArrayList<Habitaciones>();
    ArrayList<Cliente> listadeclientes = new ArrayList<Cliente>();

    public Hotel(String nombre, String ubicacion, int capacidad, int numhabitaciones) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.numhabitaciones = numhabitaciones;
    }

    public Hotel() {

    }

    // Sets y Gets

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setNumHabitaciones(int numhabitaciones) {
        this.numhabitaciones = numhabitaciones;
    }

    public int getNumHabitaciones() {
        return numhabitaciones;
    }

    public void setListadeclientes(ArrayList<Cliente> listadeclientes) {
        this.listadeclientes = listadeclientes;
    }

    public ArrayList<Cliente> getListadeclientes() {
        return listadeclientes;
    }

}