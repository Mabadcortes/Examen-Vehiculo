package vehiculo;

/**
 *
 * @author Manu Abad
 */
public class Main {

    private static void OperativaVehiculosACM2223(VehiculoACM2223 miVehiculoXXX2223, int cantidad) {
        int stockActual;
        try {
            System.out.println("Venta de Vehiculos");
            miVehiculoXXX2223.vender(20);
        } catch (Exception e) {
            System.out.print("Fallo al vender");
        }
        try {
            System.out.println("Compra de Vehiculos");
            miVehiculoXXX2223.comprar(100);
        } catch (Exception e) {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoXXX2223.obtenerStock();
        System.out.println("El stock actual es " + stockActual);
    }

    public static void main(String[] args) {
        VehiculoACM2223 miVehiculoXXX2223;

        miVehiculoXXX2223 = new VehiculoACM2223("Seat", 18000, 100);
        OperativaVehiculosACM2223(miVehiculoXXX2223, 50);
    }

}
