
package logica;


public class Vendedor extends Empleado {

    
    private double extra;

    public Vendedor(double extra, String apellido, String Nombre, double jornal, int dias) {
        super(apellido, Nombre, jornal, dias);
        this.extra = extra;
    }
    
    public double getExtra() {
        return extra;
    }

    public void setExtra(double extra) {
        this.extra = extra;
    }
    
    @Override
    public double sueldo(){
        double sueldo = (super.sueldo()+extra);
        return sueldo;
    }
    
}
