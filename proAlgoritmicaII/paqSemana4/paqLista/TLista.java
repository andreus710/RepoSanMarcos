/**
 * nombreClase: TLista.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 08-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana4.paqLista;

import java.util.*;
public class TLista {

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]){
   	int opcion=0;
      Scanner leer=new Scanner(System.in);
      Lista a= new Lista();
      //a.recorrerLista();
      
      a.crearLista();
      a.recorrerLista();
      a.insertarIni();
      a.recorrerLista();
      a.insertarFinal();	
      a.recorrerLista();
      a.eliminarNodo();
      a.recorrerLista();
      a.insertarNodo();
      a.recorrerLista();
      a.buscarDato();
      
      /*
      while(opcion!=8){
         System.out.printf("\t\tOPERACIONES DE LISTA ENLAZADA SIMPLE\n\n");
         System.out.println("1.- Crear una lista enlazada");
         System.out.println("2.- Insertar nodos al inicio");
         System.out.println("3.- Insertar nodos al final");
         System.out.println("4.- Mostrar la lista");
         System.out.println("5.- Insertar nodos a la lista");
         System.out.println("6.- Buscar datos en la lista");
         System.out.println("7.- Eliminar datos de la lista.");
         System.out.println("8.- Salir");
         System.out.print("Ingrese su Opcion : ");
         opcion=leer.nextInt();
         switch(opcion){
            case 1: a.crearLista();
                     break;
            case 2: a.insertarIni();
                     break;
            case 3: a.insertarFinal();
                     break;
            case 4: a.recorrerLista();
                     break;
            case 5: a.insertarNodo();
                     break;
            case 6: a.buscarElemento();
                     break;
            case 7: a.eliminarNodo();
                     break;
         }
      }
      */
   }
}

