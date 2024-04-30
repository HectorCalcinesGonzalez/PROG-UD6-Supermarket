package clases;

import java.util.Stack;

public class Cesta {

    private Stack<Producto> cestaCompra = new Stack<>();

    public Cesta(Stack<Producto> cestaCompra) {
        this.cestaCompra = cestaCompra;
    }

    public void aniadirCesta(Producto producto) {
        cestaCompra.push(producto);
    }
}
