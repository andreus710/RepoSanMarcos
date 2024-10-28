package proAlgoritmicaII.paqSemana11.programaFlujos.persistencia.persistencia1;/*
 *	Nombre		:	TLista1.java
 *	Descripcion	:	Objeto salvado (persistente)
 *
 *	Autor			:
 *	Fecha			:
 *
 *
 *
 */

import java.io.*;
import java.util.*;

public class TLista1 {
	public static void main(String[] args) {
   	Lista lista1= new Lista(new int[]{12, 15, 11, 4, 32});
      try {
      	ObjectOutputStream salida=new ObjectOutputStream(new FileOutputStream("media.obj"));
         salida.writeObject("guardar este string y un objeto\n");
         salida.writeObject(lista1);
         salida.close();
			System.out.println("Objeto lista salvada...");
    	}
    	catch (IOException ex) {
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

