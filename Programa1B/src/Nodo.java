/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Equipo Eclair 
 */
public class Nodo {
    private String dato;
    private Nodo derecha;//REFERENCIA
    private Nodo izquierda;
    
    //constructores
    public Nodo(){//default
        this.derecha = null;
        this.izquierda = null;
    }
    public Nodo(String dato){
        this.dato = dato;
        this.derecha = null;
        this.izquierda = null;
    }
    //get y set
    public String getDato() {
        return dato;
    }
    public void setDato(String dato) {
        this.dato = dato;
    }
    public Nodo getDerecha() {
        return derecha;
    }
    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
    public Nodo getIzquierda() {
        return izquierda;
    }
    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }  
}
