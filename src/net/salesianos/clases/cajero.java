package clases;

import java.util.LinkedList;
import java.util.Queue;

public class cajero {
    private int numeroCajero;
    private Queue<Cliente> colaCajero = new LinkedList<>();

    public cajero(int numeroCajero, Queue<Cliente> colaCajero) {
        this.numeroCajero = numeroCajero;
        this.colaCajero = colaCajero;

    }

    public int getNumeroCajero() {
        return numeroCajero;
    }

    public void setNumeroCajero(int numeroCajero) {
        this.numeroCajero = numeroCajero;
    }

    public Queue<Cliente> getColaCajero() {
        return colaCajero;
    }

    public void setColaCajero(Queue<Cliente> colaCajero) {
        this.colaCajero = colaCajero;
    }

    public void aniadirCliente(Cliente cliente) {
        colaCajero.add(cliente);
    }

}
