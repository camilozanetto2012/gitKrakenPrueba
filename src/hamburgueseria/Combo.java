package hamburgueseria;

import java.util.ArrayList;

public class Combo implements Cosa{
    private Double descuento;
    private ArrayList<Cosa> contenidoCombo;

    //METODOS
    @Override
    public Double DarPrecio(){

        return null;
    }

    @Override
    public String DarDescripcion() {
        return null;
    }

    //GETTERS
    public Double getDescuento() {
        return descuento;
    }
}
