package formativa2;

/**
 *
 * @author Duoc
 */
public interface Impuesto {
    double ajustePrecio = 0.105;
    double antiguedad = 0.02;
    
    double descuentoPorAntiguedad();
}
