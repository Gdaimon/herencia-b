package herenciab;

public class Trabajador {
    private String nombre;
    private String cargo;
    private String direccion;
    private String telefono;

    public Trabajador(String nombre, String cargo, String direccion, String telefono) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", cargo=" + cargo + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

    
    
    
}
