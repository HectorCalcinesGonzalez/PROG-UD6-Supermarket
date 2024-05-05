package clases;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Cajero {
    private int numeroCajero;
    private Queue<Cliente> colaCajero = new LinkedList<>();

    public Cajero(int numeroCajero, Queue<Cliente> colaCajero) {
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

    public void atenderCliente() {
        Cliente cliente = colaCajero.poll();
        if (cliente != null) {
            System.out.println("Cajero " + numeroCajero + " atendiendo a: " + cliente.toString());
        } else {
            System.out.println("No hay clientes para atender en la cola del Cajero " + numeroCajero);
        }
    }

    public void agregarCliente(Cliente cliente) {
        colaCajero.add(cliente);
    }

    public int getTotalClientesEnCola() {
        return colaCajero.size();
    }

    @Override
    public String toString() {
        return "cajero: \nnumeroCajero=" + numeroCajero + ", colaCajero=" + colaCajero;
    }

    public String getNumero() {
        return String.valueOf(numeroCajero);
    }
}
