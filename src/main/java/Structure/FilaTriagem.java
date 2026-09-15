/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * implementacao manual de fila fifo (first in, first out).
 * usada para triagem de ordens de servico ou veiculos.
 * nao usa java.util.queue (exigencia academica).
 * 
 * @author gsantiagommv
 */
import java.util.ArrayList;
import java.util.List;

public class FilaTriagem<T> {

    private List<T> elementos = new ArrayList<>();

    public void enfileirar(T elemento) {
        elementos.add(elemento);
    }

    public T desenfileirar() {
        if (elementos.isEmpty()) {
            return null;
        }
        return elementos.remove(0);
    }

    public T peek() {
        if (elementos.isEmpty()) {
            return null;
        }
        return elementos.get(0);
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public int size() {
        return elementos.size();
    }

    public List<T> getTodos() {
        return new ArrayList<>(elementos);
    }
}
