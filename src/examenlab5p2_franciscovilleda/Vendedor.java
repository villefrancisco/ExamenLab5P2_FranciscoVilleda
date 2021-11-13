
package examenlab5p2_franciscovilleda;
import java.util.*;
public class Vendedor extends Usuario{
    private double estrellas;
    private int numero = 0;
    ArrayList <Juego> juegos = new ArrayList();
    ArrayList <Juego> vendidos = new ArrayList();
    private int dinero;
    private int saldo;
    private int cuenta;
    private String personaje;

    public Vendedor() {
    }

    public Vendedor(int saldo, double estrellas, int dinero, int cuenta, String personaje, String nombre, String user, String password, int edad) throws Exception {
        super(nombre, user, password, edad);
        this.saldo = saldo;
        this.estrellas = estrellas;
        this.dinero = dinero;
        this.cuenta = cuenta;
        this.personaje = personaje;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Juego> getVendidos() {
        return vendidos;
    }

    public void setVendidos(ArrayList<Juego> vendidos) {
        this.vendidos = vendidos;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
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

    public void darEstrella(int x){
        numero += 1;
        double promedio = (estrellas * (numero - 1) + x)/numero;
        estrellas = promedio;
    }
}
