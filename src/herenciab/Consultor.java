package herenciab;

public class Consultor extends Trabajador{
    private double horas;
    private double tarifa;

    public Consultor(String nombre, String cargo, String direccion, String telefono, double horas, double tarifa) {
        super(nombre, cargo, direccion, telefono);
        this.horas = horas;
        this.tarifa = tarifa;
    }
    
    public double calcularPago(){
        return this.horas*this.tarifa;
    }
    

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public String toString() {
        return "Consultor{" + "horas=" + horas + ", tarifa=" + tarifa + '}';
    }
    
    
    }
