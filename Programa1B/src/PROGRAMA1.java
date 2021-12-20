/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;


/**
 *
 * @author Edgar, Mauri, Marco
 */
public class PROGRAMA1 extends ArbolBinario{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        ArbolBinario arbolB = new ArbolBinario();
        Lista listaImport = new Lista();
        
        String palabra, continuar, continuar2;
        do{
            /*while(verificar(palabra))
                System.out.println("Esta palabra esta repetida");*/
            
            System.out.println("Ingresa la palabra que quieras: ");
            palabra = input.nextLine();
            arbolB.add(palabra);
            System.out.println("¿Desea continuar(Sí/No)?");
            continuar = input.nextLine();
            
        }while(continuar.equalsIgnoreCase("Si"));
        
        do{
        System.out.println("¿Cómo deseas imprimir tus palabras? digite número entre 1-3 "
                + "\nPresiona 1 -> para tipo de impresión PreOrder "
                + "\nPresiona 2 -> para tipo de impresión InOrder "
                + "\nPresiona 3 -> para tipo de impresión PostOrder"
                + "\nPresiona 4 -> para exportar a lista e imprimirla");
        
        int dato = input.nextInt();
        switch(dato){
            case 1: 
                arbolB.printPreOrder();
                break;
            case 2: 
                arbolB.printInOrder();
                break;
            case 3: 
                arbolB.printPostOrder();
                break;
            case 4:
                arbolB.imprimirLista();
                break;
            default: 
                System.out.println("Opción inexistente.");
                break;
        }
            System.out.println("\n¿Deseas imprimir tus palabras en algun orden de nuevo?\n(Sí/No)");
            //Por alguna razón, se tiene que poner la linea dos veces para que funcione
            continuar2 = input.nextLine();
            continuar2 = input.nextLine();
            
        }while(continuar2.equalsIgnoreCase("Si"));
    }

}
