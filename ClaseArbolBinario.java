package com.edu.netbeans.arbol;

public class ClaseArbolBinario {
    ClaseNodo raiz;

    // Constructor del árbol
    public ClaseArbolBinario() {
        raiz = null;
    }

    // Método para agregar nodos manualmente según la estructura del ejemplo
    void construirArbol() {
        raiz = new ClaseNodo(60); // Raíz del árbol

        // Definir subárbol izquierdo
        raiz.nodoIzq = new ClaseNodo(41);
        raiz.nodoIzq.nodoIzq = new ClaseNodo(16);
        raiz.nodoIzq.nodoIzq.nodoDer = new ClaseNodo(25);

        raiz.nodoIzq.nodoDer = new ClaseNodo(53);
        raiz.nodoIzq.nodoDer.nodoIzq = new ClaseNodo(46);
        raiz.nodoIzq.nodoDer.nodoIzq.nodoIzq = new ClaseNodo(42);
        raiz.nodoIzq.nodoDer.nodoDer = new ClaseNodo(55);

        // Definir subárbol derecho
        raiz.nodoDer = new ClaseNodo(74);
        raiz.nodoDer.nodoIzq = new ClaseNodo(65);
        raiz.nodoDer.nodoIzq.nodoIzq = new ClaseNodo(63);
        raiz.nodoDer.nodoIzq.nodoIzq.nodoIzq = new ClaseNodo(62);
        raiz.nodoDer.nodoIzq.nodoIzq.nodoDer = new ClaseNodo(64);
        raiz.nodoDer.nodoDer = new ClaseNodo(70);
    }

    // Método para mostrar el recorrido en preorden
    void preOrden(ClaseNodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preOrden(nodo.nodoIzq);
            preOrden(nodo.nodoDer);
        }
    }

    // Método para mostrar el recorrido en inorden
    void inOrden(ClaseNodo nodo) {
        if (nodo != null) {
            inOrden(nodo.nodoIzq);
            System.out.print(nodo.valor + " ");
            inOrden(nodo.nodoDer);
        }
    }

    // Método para mostrar el recorrido en postorden
    void postOrden(ClaseNodo nodo) {
        if (nodo != null) {
            postOrden(nodo.nodoIzq);
            postOrden(nodo.nodoDer);
            System.out.print(nodo.valor + " ");
        }
    }
}
