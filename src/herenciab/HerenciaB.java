package herenciab;

public class HerenciaB {

    public static void main(String[] args) {
        
        Trabajador trabajador;
        Empleado empleado;
        Consultor consultor;
        
        trabajador = new Trabajador("Bill Gates", "Presidente", "Redmond", "");
        empleado = new Empleado("Larry", "Presidente", "Redmond", "", 1000.0, 10.0);
        consultor = new Consultor("Steve Jobs", "Consulto Jefe", "Cupertino", "", 13.5, 1000.0);
        
        System.out.println(trabajador);
        System.out.println(empleado);
        System.out.println(empleado.calcularPago());
        System.out.println(consultor);
        System.out.println(consultor.calcularPago());
        
        
        
    }
    
}
