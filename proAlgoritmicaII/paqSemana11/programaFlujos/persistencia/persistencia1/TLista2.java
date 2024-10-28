package proAlgoritmicaII.paqSemana11.programaFlujos.persistencia.persistencia1;/*
 *	Nombre		:	TLista2.java
 *	Descripcion	:	Objeto recuperado (persistente)
 *
 *	Autor			:
 *	Fecha			:
 *
 *
 *
 */
import java.io.*;
import java.util.*;

public class TLista2 {
	public static void main(String[] args) {
      try {

         ObjectInputStream entrada=new ObjectInputStream(new FileInputStream("media.obj"));
         String str=(String)entrada.readObject();
         Lista obj1=(Lista)entrada.readObject();
         System.out.println("Objeto lista ha sido recuperada...\n\n");
         System.out.println("Valor medio "+obj1.valorMedio());
         System.out.println("-----------------------------");
         System.out.println(str+obj1);
         System.out.println("-----------------------------");
         entrada.close();
			//se puede fundir en una catch Exception
    	}
    	catch (IOException ex) {
      	System.out.println("ioexception");
      	System.out.println(ex);
      }
      catch (ClassNotFoundException ex) {
      	System.out.println("ClassNotFoundException");
      	System.out.println(ex);
      }
      try  {
			//espera la pulsaci�n de una tecla y luego RETORNO
         System.in.read();
     	}
     	catch (Exception e) {  
     	}
	}
}

