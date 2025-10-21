package formativa2;
/**
 *
 * @author Duoc
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Formativa2 {
    public static void main(String[] args){
        ArrayList<Datos> veleros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;
        
       do{
           System.out.println("\n--- Menú de Veleros ---");
           System.out.println("1. Ingresar Velero");
           System.out.println("2. Mostrar Precio Final");
           System.out.println("3. Aplicar Ajuste de precio");
           System.out.println("4. Contar Veleros");
           System.out.println("5. Salir");
           System.out.println("Seleccione una opción: ");
           opcion = sc.nextInt();
           sc.nextLine();
           
           switch(opcion){
               case 1:
                   System.out.println("Tipo de Velero (Ligero/Oceánico): ");
                   String tipo = sc.nextLine();
                   
                   System.out.println("Código: "); String c = sc.nextLine();
                   System.out.println("nombre: "); String n = sc.nextLine();
                   System.out.println("Precio Base: "); double pb = sc.nextDouble(); sc.nextLine();
                   System.out.println("Marca: "); String m = sc.nextLine();
                   System.out.println("Modelo: "); String mo = sc.nextLine();
                   System.out.println("Año Fabricación: "); int af = sc.nextInt(); sc.nextLine();
                   System.out.println("Cantidad Velas: "); int cv = sc.nextInt(); sc.nextLine();
                   System.out.println("Eslora(Pies): "); double e = sc.nextDouble(); sc.nextLine();
                   
                   boolean existe = veleros.stream().anyMatch(v -> v.getCodigo().equals(c));
                   if(existe){
                       System.out.println("Velero duplicado");
                       break;
                   }
                   if("Ligero".equalsIgnoreCase(tipo)){
                       veleros.add(new VeleroLigero(c,n,pb,m,mo,af,cv,e));
                       System.out.println("Velero Ligero Agregado");
                   }else if("Oceánico".equalsIgnoreCase(tipo)){
                       veleros.add(new VeleroOceanico(c,n,pb,m,mo,af,cv,e));
                       System.out.println("Velero Oceánico Agregado");
                   }else{
                       System.out.println("Velero no válido");
                   }
               case 2:
                   System.out.print("Ingrese Código del velero");
                   String cod = sc.nextLine();
                   /// Contar elementos con Stream
                  /* veleros.stream()
                           .filter(v -> v.getCodigo().equals(cod))
                           .findFirst()
                           .ifPresentOrElse(v -> {
                               double precioFinal; //polimorfismo aplicado al 100%
                               if(v instanceof VeleroLigero){
                                   precioFinal = ((VeleroLigero) v).precioFinal();
                               }else{
                                   precioFinal = ((VeleroOceanico) v).precioFinal();
                               }
                               System.out.printf("Precio Base: $%,.0f | Precio Final: $%,.0f%n",
                                       v.getPrecioBase(),precioFinal);
                           }, 
                            () -> System.out.println("Velero no Encontrado"));*/
                   /// Contar elementos con For
                   boolean encontrado = false;
                   for(Datos v : veleros){
                       if(v.getCodigo().equals(cod)){
                           double precioFinal;
                           if(v instanceof VeleroLigero){
                                   precioFinal = ((VeleroLigero) v).precioFinal();
                            }else{
                                   precioFinal = ((VeleroOceanico) v).precioFinal();
                            }
                           System.out.printf("Precio Base: $%,.0f | Precio Final: $%,.0f%n",
                                   v.getPrecioBase(),precioFinal);
                           encontrado = true;
                           break;
                       }
                   }
                   if (!encontrado) System.out.println("Velero no encontrado");
                   break;
               case 3:
               case 4:
               case 5:
                   System.out.println("Saliendo....");
                   break;
               default:
                   System.out.println("Opción no válida");
           }
       }while(opcion !=5);
       sc.close();
    }
}
