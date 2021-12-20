/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Equipo Eclair
 */
public class Lista { //Lista simplemente enlazada
    private Nodo inicio;//Es el punto de incio y acceso a la lista
    private Nodo fin;
    private int tama;
    
    public Lista(){
        inicio = null; //Lista vacia
        fin = null;
        tama= 0;
    }
    
    //Agregar nodos
    public void add(String valor){//O(1)
        Nodo nuevo = new Nodo(valor);
        if(inicio==null){
            inicio=nuevo; //Se conecta el primer nodo a la lista
            fin = nuevo;
        }
        else{//Cuando la lista con nodos...
            //Se debe ir hasta el final de la lista
            //Usando temp se recorrerá nodo por nodo hasta llegar al final
            
            
            /*Nodo temp = inicio;//Desde aqui se empieza
            //while
            while(temp.getSiguiente() != null){//Mientras temp.siguiente != seguiremos avanzando nodo tras nodo
                temp = temp.getSiguiente();//Se mueve temp al nodo siguiente
      
            }
            temp.setSiguiente(nuevo);//Conectamos el nodo nuevo al final de la lista*/
            
            //Agregar nodo al final de la lista
            fin.setDerecha(nuevo);
            fin = nuevo; // Nos movemos hacia el final de la lista
        }
        tama++;
    }
    //Imprimir Lista
    public void printList(){//O(N)
        Nodo temp = inicio;//Desde aqui se empieza
            //while
            while(temp != null){//Mientras temp != seguiremos avanzando
                System.out.print(temp.getDato() + " - ");
                temp = temp.getDerecha();//Temo se mueve al siguiente nodo
            }
    }
    //Borrar la lista
    public void clear(){//O(1)
        inicio = null;
        fin = null;
        tama=0;
    }
    
    //Contar los nodos
    public int length(){
        /*int iCont = 0;
        Nodo temp = inicio;//Desde aqui se empieza
            //while
            while(temp != null){//Mientras temp != seguiremos avanzando
                iCont++;
                temp = temp.getSiguiente();//Temo se mueve al siguiente nodo
            }
            return iCont;*/
            return tama;
    }
    
    //La lista está vacía: True, con Nodos: False
    public boolean isEmpty(){
        //Verificacion
        if(inicio == null)
            return true;
        else
            return false;
    }
    
    //Recuperar un valor de la lista
    public String get(int pos) throws Exception{
        //verificacion
        if(isEmpty()){//Lista vacía
            throw new Exception("No hay valores almacenados en la lista");
        }else{//Posicion que no exista: Posicion negativa o que nos pasemos
            //pos tiene que estar entre 0 y n-1 --> n es el tamaño (length)
            if((pos < 0) || (pos >= length() ))//Si pod es menor a cero o por es mayor o igual a n
              throw new Exception("Esa posicion no existe dentro de la lista");  
        }
     
        Nodo temp = inicio;
        for(int i = 0; i < pos ;i++){
            temp = temp.getDerecha();//Temo se mueve al siguiente nodo
        }
        return temp.getDato();
    }
    
    private void insertAtBegining(Nodo nuevo){//O(1)
        nuevo.setDerecha(inicio);
        inicio = nuevo;
    }
    public void insertAt (int pos,String valor){// O(N)
        Nodo nuevo = new Nodo(valor);
        //Validar
        
        //Situaciones
        //Insertar al inicio
        if(pos == 0){
            insertAtBegining(nuevo);
        }else{//Cualquier otro caso
            Nodo temp = inicio;//Desde aqui se empieza
            for (int i = 0; i<(pos-1); i++){
                temp = temp.getDerecha();//Mover temp al siguiente nodo
            }
            //Falta reconectar
            //Primero conectamos el nievo nodo
            nuevo.setDerecha(temp.getDerecha());
            //Conectamos la lista al nuevo nodo
            temp.setDerecha(nuevo);
    }
        tama++;
    }
    
    public void deleteAt(int pos){// O(N)
        int iTamaLista = length();//Se obtiene el tamaño de la lista
        //Validar
        if(iTamaLista == 1){
            clear();
        }
        //Situaciones
        if(pos == 0){//Borrar el nodo al inicio
            inicio = inicio.getDerecha();
        }else{//Otros casos
            //Movernos al nodo previo a la posicion
            Nodo temp = inicio;
            for (int i = 0; i<(pos-1); i++){
                temp = temp.getDerecha();//Mover temp al siguiente nodo
            }
            //Falta reconectar
            temp.setDerecha(temp.getDerecha().getDerecha());
            if (pos == (iTamaLista -1))//Se verifica si es el ultimo nodo de la lista
                fin = temp;
    }
        tama--;
        
    }

}
