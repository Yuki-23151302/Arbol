package com.edu.netbeans.arbol;

public class ClaseNodo {
    int valor;
    ClaseNodo nodoIzq, nodoDer;

    // Constructor del nodo
    public ClaseNodo(int valor) {
        this.valor = valor;
        nodoIzq = nodoDer = null;
    }
}
