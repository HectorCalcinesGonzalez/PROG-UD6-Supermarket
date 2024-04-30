package clases;

public class Producto {
    private String nombreProducto;
    private float precio;

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto: [nombreProducto=" + nombreProducto + ",\n precio=" + precio + "]\n";
    }
}
