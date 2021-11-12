
package examenlab5p2_franciscovilleda;
import java.util.*;

public class Comprador extends Usuario{
    private int dinero;
    private int cuenta;
    private String personaje;
    ArrayList<Juego> juegos = new ArrayList();

    public Comprador() {
    }

    
    public Comprador(int dinero, int cuenta, String personaje, String nombre, String user, String password, int edad) throws Exception {
        super(nombre, user, password, edad);
        this.dinero = dinero;
        this.cuenta = cuenta;
        this.personaje = personaje;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public ArrayList<Juego> getJuegos() {
        return juegos;
    }

    public void setJuegos(ArrayList<Juego> juegos) {
        this.juegos = juegos;
    }

    @Override
    public String toString() {
        return "Comprador: " + super.toString();
    }
    
    
}
