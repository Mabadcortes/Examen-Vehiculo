package vehiculo;

/**
 *
 * @author Manu Abad
 */
public class Main {

    /**
     * Esta función muestra la venta y compra de vehículos y el stock actual de vehículos
     * @param miVehiculoACM2223 objeto vehiculo
     * @param cantidad cantidad de vehiculos en stock
     */
    private static void operativaVehiculosACM2223(VehiculoACM2223 miVehiculoACM2223, int cantidad) {
        int stockActual;
        try {
            System.out.println("Venta de Vehiculos");
            miVehiculoACM2223.vender(20);
        } catch (Exception e) {
            System.out.print("Fallo al vender");
        }
        try {
            System.out.println("Compra de Vehiculos");
            miVehiculoACM2223.comprar(100);
        } catch (Exception e) {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoACM2223.obtenerStock();
        System.out.println("El stock actual es " + stockActual);
    }
/**
 * 
 * El main crea el objeto vehículo y llama a la función OperativaVehiculosACM2223
 */
    public static void main(String[] args) {
        VehiculoACM2223 miVehiculoACM2223;

        miVehiculoACM2223 = new VehiculoACM2223("Seat", 18000, 100);
        operativaVehiculosACM2223(miVehiculoACM2223, 50);
    }

}
