package formativa2;
/**
 *
 * @author Duoc
 */
public class Datos {
    private String codigo;
    private String nombre;
    private double precioBase;
    
    public Datos(String codigo, String nombre, double precioBase){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the precioBase
     */
    public double getPrecioBase() {
        return precioBase;
    }

    /**
     * @param precioBase the precioBase to set
     */
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    
    
}
