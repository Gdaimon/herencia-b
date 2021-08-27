package herenciab;

public class Empleado extends Trabajador{
    private double sueldo;
    private double prima;

    public Empleado(String nombre, String cargo, String direccion, String telefono,double sueldo, double prima) {
        super(nombre, cargo, direccion, telefono);
        this.sueldo = sueldo;
        this.prima = prima;
    }

    public double calcularPago(){
        return this.sueldo*this.prima;
    }
    
    
    
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getPrima() {
        return prima;
    }

    public void setPrima(double prima) {
        this.prima = prima;
    }

    @Override
    public String toString() {
        return "Empleado{" + "sueldo=" + sueldo + ", prima=" + prima + '}';
    }
    
    
    
}
