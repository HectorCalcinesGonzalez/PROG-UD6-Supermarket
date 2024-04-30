package clases;

import java.util.Random;
import java.util.Stack;

public class GestorCestas {

    private static Cliente[] nombreClientes = {
            new Cliente("Héctor"),
            new Cliente("Kevin"),
            new Cliente("Jose"),
            new Cliente("Alonso"),
            new Cliente("Marco"),
            new Cliente("Adrián"),
            new Cliente("Giova"),
            new Cliente("Ramiro"),
            new Cliente("Pepón"),
            new Cliente("Alejandro"),
            new Cliente("Messi"),
            new Cliente("Mbappe"),
            new Cliente("Jorge"),
            new Cliente("Lucia"),
            new Cliente("Carla"),
            new Cliente("Pepe"),
            new Cliente("Claudia"),
            new Cliente("Sebastian"),
            new Cliente("Ana"),
            new Cliente("Oriana")
    };

    private static Producto[] productosArray = {
            new Producto("Munchitos", 3.50f),
            new Producto("Clipper", 2.00f),
            new Producto("Atún calvo", 5.30f),
            new Producto("Mojo rojo", 8.00f),
            new Producto("Coca-cola", 1.80f),
            new Producto("Doritos", 2.80f),
            new Producto("Agua", 1.30f),
            new Producto("Monster", 1.60f),
            new Producto("Pan", 0.40f),
            new Producto("Yogures", 3.80f),
            new Producto("Queso", 3.30f),
            new Producto("Papas", 8.00f),
    };

    public static Cesta generarCestaAleatoria() {
        Stack<Producto> stack = new Stack<>();
        Random random = new Random();
        for (int index = 0; index < Math.floor(Math.random() * 12 + 1); index++) {
            stack.push(productosArray[random.nextInt(productosArray.length)]);
        }
        return new Cesta(stack);
    }

}
