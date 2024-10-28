package proAlgoritmicaII.paqSemana11.programaFlujos.persistencia; /**
 * @(#)Persona.java
 *
 *		Serializar los objetos de la clase Persona.
 *
 *	1. Implemente la clase Persona 
 * 2. Implemente un vector o una coleccion objetos Persona
 *		2.1 Serializa el vector o la coleccion.
 *		2.2 Serializa cada uno de los objetos del vector o coleccion.
 *		2.3 Desserializa para obtener el vector o la coleccion de objetos.
 * 
 * @author 
 * @version 1.00 2011/6/10
 */
import java.io.Serializable;
import java.util.Date;

public class Persona implements Serializable {
	private String dni;
	private String nombre;
	private String direccion;
	private Date fNacim;
	private String correo_e;
	
   public Persona() {
   }
    
    
}
