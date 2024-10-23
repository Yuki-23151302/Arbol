package com.edu.netbeans.arbol;

public class Arbol {

    public static void main(String[] args) {
        ClaseArbolBinario arbol = new ClaseArbolBinario();

        // Construir el árbol 
        arbol.construirArbol();

        // Recorridos
        System.out.println("Recorrido en preorden:");
        arbol.preOrden(arbol.raiz);

        System.out.println("\nRecorrido en inorden:");
        arbol.inOrden(arbol.raiz);

        System.out.println("\nRecorrido en postorden:");
        arbol.postOrden(arbol.raiz);
    }
}
