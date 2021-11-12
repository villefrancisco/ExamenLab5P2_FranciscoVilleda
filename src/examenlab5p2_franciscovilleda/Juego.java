
package examenlab5p2_franciscovilleda;

public class Juego {
    private String nombre;
    private int precio;

    public Juego(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Juego() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre + " $" + precio;
    }
    
    
}
