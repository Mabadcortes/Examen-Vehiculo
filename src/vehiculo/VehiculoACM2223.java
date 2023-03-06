package vehiculo;

/**
 *
 * @author Manu Abad
 */
public class VehiculoACM2223 {

    private String nombre;
    private double precio;
    private double precioIVA;
    private int stock;

    /**
     * Constructor sin parámetros
     */
    public VehiculoACM2223() {
    }

    /**
     * Constructor con parámetros para iniciar todas las propiedades de la clase
     *
     * @param nom nombre del vehículo
     * @param precio precio del vehículo
     * @param stock stock del vehículo
     */
    public VehiculoACM2223(String nom, double precio, int stock) {
        this.nombre = nom;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Método para asignar el nombre del vehiculo
     *
     * @param nom nombre del vehículo
     */
    public void asignarNombre(String nom) {
        nombre = nom;
    }

    /**
     * Método que me devuelve el nombre del vehiculo
     *
     * @return nombre del vehículo
     */
    public String obtenerNombre() {
        return nombre;
    }

    /**
     *Método que me devuelve el stock de vehiculos disponible en cada momento
     * @return stock de vehículos
     */
    public int obtenerStock() {
        return stock;
    }
/**
 * Método para comprar vehiculos. Modifica el stock.
 * Este método va a ser probado con Junit
 * @param cantidad cantidad de vehículos
 * @throws Exception muestra una excepción
 */
    public void comprar(int cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        }
        stock = stock + cantidad;
    }
/**
 *  Método para vender vehículos. Modifica el stock
 * @param cantidad cantidad de vehículos
 * @throws Exception muestra una excepción
 */
    public void vender(int cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede vender una cantidad negativa de vehiculos");
        }
        if (obtenerStock() < cantidad) {
            throw new Exception("No se hay suficientes vehiculos para vender");
        }
        stock = stock - cantidad;
    }
/**
 * Muestra el valor del nombre del vehiculo
 * @return nombre del vehiculo
 */
    public String getNombre() {
        return nombre;
    }
/**
 * Permite cambiar el nombre del vehiculo
 * @param nombre nombre del vehiculo
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * Muestra el valor del precio del vehiculo
 * @return el precio del vehiculo
 */
    public double getPrecio() {
        return precio;
    }
/**
 * Permite cambiar el precio del vehiculo
 * @param precio precio del vehiculo
 */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
/**
 * Muestra el valor del precioIVA
 * @return devuelve el valor de precioIVA
 */
    public double getPrecioIVA() {
        return precioIVA;
    }
/**
 * Permite cambiar el valor de precioIVA
 * @param precioIVA precio del IVA
 */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }
/**
 * Muestra el stock de vehiculos
 * @return devuelve el stock de vehiculos
 */
    public int getStock() {
        return stock;
    }
/**
 * Permite cambiar la cantidad de vehiculos en stock
 * @param stock devuelve el stock de vehiculos
 */
    public void setStock(int stock) {
        this.stock = stock;
    }

}
