package formativa2;

/**
 *
 * @author Duoc
 */
public class VeleroOceanico extends Datos implements Impuesto{
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private int cantidadVelas;
    private double eslora;
    
    public VeleroOceanico(String codigo, String nombre, double precioBase,String marca, String modelo, 
            int anioFabricacion, int cantidadVelas, double eslora){
        super(codigo,nombre,precioBase);
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.cantidadVelas = cantidadVelas;
        this.eslora = eslora;
    }
    public void ajustePrecio(){
        if(anioFabricacion == 2000){
            setPrecioBase(getPrecioBase() * (1 - ajustePrecio));
        }
    }
    @Override
    public double descuentoPorAntiguedad(){
        int anioActual = java.time.Year.now().getValue();
        if(anioActual - anioFabricacion > 20){
            return getPrecioBase() * antiguedad;
        }
        return 0;
    }
    
    public double precioFinal(){
        int recargo = 1340000;
        if(eslora > 20){
            return getPrecioBase() + recargo - descuentoPorAntiguedad();
        }
            return getPrecioBase() - descuentoPorAntiguedad();
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }
}

