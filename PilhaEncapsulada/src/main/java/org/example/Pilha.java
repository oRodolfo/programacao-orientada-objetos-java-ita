package org.example;

public class Pilha {

    private Object[] elementos;
    private int topo = 0;

    public Pilha(int maximo){
        elementos = new Object[maximo];
    }

    public void empilhar(Object elemento){
        elementos[topo] = elemento;
        topo++;
    }

    public Object desempilhar(){
        topo--;
        return elementos[topo];
    }

    public Object topo(){
        return elementos[topo-1];
    }

    public Object[] getElementos() {
        return elementos;
    }

    public Pilha setElementos(Object[] elementos) {
        this.elementos = elementos;
        return this;
    }

    public Pilha setTopo(int topo) {
        this.topo = topo;
        return this;
    }

    public int tamanho(){
        return topo;
    }
}
