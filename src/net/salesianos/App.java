import java.util.Scanner;

import clases.Cajero;
import clases.GestorCestas;

public class App {
    public static void main(String[] args) {

        Cajero cajeroClase;
        GestorCestas gestor;
        final Scanner SCANNER = new Scanner(System.in);
        boolean seguirPreguntando = true;

        boolean cajero = false;
        while (seguirPreguntando) {
            String opcion;
            switch (opcion) {
                case "1":
                    if (cajero = false) {
                        cajero = true;
                        System.out.println("Acaba de abrir la caja!!!");
                    } else if (cajero = true) {
                        System.out.println("La caja ya esta abierta!!!");
                    }
                    break;
                case "2":
                    Cajero.agregarCliente(gestor.generarClienteAleatorio());
                    break;
                case "3":
                    cajeroClase.atenderCliente();
                    break;
                case "4":
                    cajeroClase.getTotalClientesEnCola();
                    break;
                case "5":
                    seguirPreguntando = false;
                    break;

                default:
                    break;
            }
        }
    }
}
