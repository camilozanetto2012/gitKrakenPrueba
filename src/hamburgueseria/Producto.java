package hamburgueseria;

public class Producto implements Cosa{
    private Double Precio;
    private String tipo ;

    //GETTERS
    public Double getPrecio() {
        return Precio;
    }
    public String getTipo() {
        return tipo;
    }

    @Override
    public Double DarPrecio() {
        return null;
    }

    @Override
    public String DarDescripcion() {
        return null;
    }
}
