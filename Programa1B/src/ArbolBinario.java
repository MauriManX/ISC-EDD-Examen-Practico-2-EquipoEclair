/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Equipo Eclair
 */
public class ArbolBinario {
    Lista importarAList = new Lista();
    private Nodo root;

    public ArbolBinario() {
        this.root = null;//Árbol vacío
    }
    
    //A partir de aquí TODOOOO será recursivo
    //Agregar un nodo:
    public void add(String valor){
        Nodo nuevo = new Nodo(valor);
        //Verificamos si hay nodos en el arbol
        if (root == null){//No hay árbol
            root=nuevo;
        }else{
            addRecu(root,nuevo);
        }
    }
    
    public void addRecu(Nodo actual, Nodo nuevo){
        //Se verifica a que lado irá el nodo
        switch (comparar(actual,nuevo)) {
            case 0:
                //Izq: Valor nuevo menor a nodo actual
                if(actual.getIzquierda()==null){
                    actual.setIzquierda(nuevo);
                }else{
                    addRecu(actual.getIzquierda(),nuevo);
                }
                //Derecha
                break;
            case 1:
                if(actual.getDerecha()==null){
                    actual.setDerecha(nuevo);
                }else{
                    addRecu(actual.getDerecha(),nuevo);
                } break;
            case 2:
                
            default:      
                System.out.println("Ese valor ya existe en el arbol");
                break;
        }
    }
    
    public void printPreOrder(){
        preOrder(root);//Se llama al metodo recursivo
    }
    
    private void preOrder(Nodo actual){
        if(actual != null){
            System.out.print("["+actual.getDato()+"]");//Visit node
            preOrder(actual.getIzquierda());//Traverse left subtree
            preOrder(actual.getDerecha());//Traverse right subtree
}
 }
    public void printInOrder(){
        inOrder(root);//Se llama al metodo recursivo
    }
    
    private void inOrder(Nodo actual){
        if(actual != null){
            inOrder(actual.getIzquierda());//Traverse left subtree
            System.out.print("["+actual.getDato()+"]");//Visit node
            inOrder(actual.getDerecha());//Traverse right subtree
}
 }
    public void printPostOrder(){
        postOrder(root);//Se llama al metodo recursivo
    }
    
    private void postOrder(Nodo actual){
        if(actual != null){
            postOrder(actual.getIzquierda());//Traverse left subtree
            postOrder(actual.getDerecha());//Traverse right subtree
            System.out.print("["+actual.getDato()+"]");//Visit node
}
 }
    
    //Método casero para comparar dos palabras, y determinar el orden alfabetico
    private int comparar(Nodo actual, Nodo nuevo){
        int iCantidadLetras = actual.getDato().length();
        int iPosicion = 0;
        
        for(int i=0; i<iCantidadLetras; i++){
            if( (actual.getDato().charAt(i) != nuevo.getDato().charAt(i)) || (nuevo.getDato().length()-1) == i){
                iPosicion = i;
                break;
            }
        }
        if(actual.getDato().charAt(iPosicion) > nuevo.getDato().charAt(iPosicion)){
            return 0;
        }else if((actual.getDato().charAt(iPosicion) == nuevo.getDato().charAt(iPosicion)) && (actual.getDato().length() > nuevo.getDato().length())){
            return 0;
        }else if(actual.getDato().charAt(iPosicion) < nuevo.getDato().charAt(iPosicion)){
            return 1;
        }else if((actual.getDato().charAt(iPosicion) == nuevo.getDato().charAt(iPosicion)) && (actual.getDato().length() < nuevo.getDato().length())){
            return 1;
        }else
            return 2;
    }
    
    public void exportarInOrder(){
         eInOrder(root);//Se llama al metodo recursivo
    }
    
    private void eInOrder(Nodo actual){
        if(actual != null){
            eInOrder(actual.getIzquierda());
            importarAList.add(actual.getDato());
            eInOrder(actual.getDerecha());
    }
    }
    
    public void imprimirLista(){
        importarAList.clear();
        exportarInOrder();
        importarAList.printList();
}
}

 

