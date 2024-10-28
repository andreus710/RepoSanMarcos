/**
* nombreClase: Lista.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 08-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana4.paqLista;

import java.util.*;
public class Lista{
	//Puedo declarar private a estos atributos?
	Scanner leer=new Scanner(System.in);
   Nodo cab;
   //Constructor por defecto
   public Lista(){
      cab=null;
   }
	/*
	 * Eclique el funcionamiento de este metodo
	 * Como y cuando lo utilizaria
	 */   
   public void crearLista(){
      if(cab==null){
         System.out.print("NOMBRE: ");
         String dato=leer.next();
         cab= new Nodo(cab, dato);
      }
      else{
      	System.out.print("Lista NO vacia... ");
      }
   }
   
   public void insertarIni(){
      Nodo p, n=cab;
      String dato;
      System.out.print("Inserta al inicio, nombre :");
      dato=leer.next();
      p=new Nodo(dato);
      if(cab==null){
      	cab=p;
      }
      else{
      	p.sgte=cab;
      	cab=p;
      }
   }
	/*
	 * Implemente una lista con un apuntador al inicio y al
	 * final de lista e implemente todas operaciones
	 * Explique esquematicamente la insercion de un nodo
	 */   
   public void insertarFinal(){
      Nodo p, q;
      String dato;
      p=cab;
      while(p.sgte!=null){
      	p=p.sgte;
      }
      System.out.print("Inserta al final, nombre :");
      dato=leer.next();      
      q=new Nodo(dato);
      if(p==null){
      	cab=q;
      }
      p.sgte=q;    
   }

   public void recorrerLista(){
      Nodo p;
      p=cab;
      System.out.print("Lista = < ");
      if(p==null){
      	//System.out.println("Lista vaciaaaa...");}
      	System.out.print("Lista vaciaaaa...");}
      else{
      	while(p!=null){
      		System.out.print(p.val+",");
      		p=p.sgte;
      	}
      }
     System.out.println(">");      
   }
	/*
	 * Que finalidad tienen actual y anter?
	 * Se utilizan los dos?
	 * Explique esquematicamente la insercion de un nodo
	 */
   public void insertarNodo(){
      //Nodo ref=null, n=cab;
      String dato,ndato;
      Nodo actual, anter=null, p;
      actual=cab;
      boolean hallado=false;
      Scanner leer=new Scanner(System.in);
      if(actual==null){
         System.out.println("Lista vaciaaaa...");
      }
      else{
         System.out.print("Imserta despues de un NODO dado, nombre :");
         dato=leer.next();
         //while(actual!=null){
         while(actual!=null && !hallado){
            if(dato.equals(actual.val)){
               //anter=actual;
               hallado=true;
               System.out.println(dato+" esta en la lista ..");
            }
            anter=actual;
            actual=actual.sgte;
         }
         if(hallado==true){
            System.out.print("Ingrese nuevo dato :");
            ndato=leer.next();
            p=new Nodo(ndato);
            //System.out.println("dato actual  :"+actual.val);
            System.out.println("dato anterior:"+anter.val);
            p.sgte=anter.sgte;
            anter.sgte=p;
         }
         else{
         	System.out.println("Dato "+dato+" no encontrado...");
         }
       }
    }
	/*
	 * Haga un esquema de eliminacion de un nodo
	 * No da mensaje cuando el nodo no se encuentra
	 * que haria para dar dicho mensaje
	 * Implemente el metodo eliminarLista()
	 */
   
   public void eliminarNodo(){
      Nodo actual, anter;
      String dato;
      actual=cab; anter=null;
      boolean hallado=false;
      if(actual==null){
         System.out.println("Lista vaciaaaa...");
      }
      else{
         System.out.print("Dato a eliminar :");
         dato=leer.next();
         while((actual!=null) && (hallado==false)){
            hallado=(dato.equals(actual.val));
            if(hallado==false){
               anter=actual;
               actual=actual.sgte;
            }
         }
         if(actual!=null){
            if(actual==cab){
               cab=actual.sgte;
            }
            else{
               anter.sgte=actual.sgte;
            }
         }
      }
   }
  
    
   public void buscarDato(){
      int cdato=1;
      Nodo p;
      String dato;
      //p=null; //Porque??
      p=cab;
      boolean hallado=false;
      if(p==null){
         System.out.println("Lista vaciaaaa...");
      }
      else{
         System.out.print("Ingrese dato a buscar : ");
         dato=leer.next();
           
         while(p!=null){//Haga el esquema de busueda
         //while(p.sgte!=null){//Ha el esquema busqueda
            if(dato.equals(p.val)){
               System.out.println("El dato ["+dato+"] encontrado en la posicion :"+cdato);
               hallado=true;
            }
            cdato=cdato+1;
            p=p.sgte;
         }
         if(hallado==false){
            System.out.println("El dato :["+dato+"] no esta en la lista");
         }
      }
   }
}
