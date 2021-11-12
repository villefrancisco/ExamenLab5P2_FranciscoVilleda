
package examenlab5p2_franciscovilleda;

public class Usuario {
    private String nombre;
    private String user;
    private String password;
    private int edad;

    public Usuario() {
    }

    
    public Usuario(String nombre, String user, String password, int edad) throws Exception{
        this.nombre = nombre;
        setUser(user);
        this.password = password;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if(edad < 18){
            throw new Exception("El usuario debe tener al meno 18 años");
        }
    }

    @Override
    public String toString() {
        return nombre;
    }

    
    
    
}
