
package examenlab5p2_franciscovilleda;

public class Admin extends Usuario{

    public Admin() {
    }

    public Admin(String nombre, String user, String password, int edad) throws Exception {
        super(nombre, user, password, edad);
    }

    @Override
    public String toString() {
        return "Administrador: " + super.toString();
    }

}
