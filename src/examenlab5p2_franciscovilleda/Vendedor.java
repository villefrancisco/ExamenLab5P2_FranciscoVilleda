
package examenlab5p2_franciscovilleda;
import java.util.*;
public class Vendedor extends Usuario{
    private double estrellas;
    ArrayList <Juego> juegos = new ArrayList();
    private int dinero;
    private int cuenta;
    private String personaje;

    public Vendedor() {
    }

    public Vendedor(double estrellas, int dinero, int cuenta, String personaje, String nombre, String user, String password, int edad) throws Exception {
        super(nombre, user, password, edad);
        this.estrellas = estrellas;
        this.dinero = dinero;
        this.cuenta = cuenta;
        this.personaje = personaje;
    }

    public double getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(double estrellas) {
        this.estrellas = estrellas;
    }

    public ArrayList<Juego> getJuegos() {
        return juegos;
    }

    public void setJuegos(ArrayList<Juego> juegos) {
        this.juegos = juegos;
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

    @Override
    public String toString() {
        return "Vendedor: " + super.toString();
    }


}
