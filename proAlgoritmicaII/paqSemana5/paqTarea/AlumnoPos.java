/**
* nombreClase: AlumnoPos.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 16-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana5.paqTarea;

class AlumnoPos extends AlumnoPre{
	private String carreraPregrado;
	public AlumnoPos(String nom, String dir, String f, String
	carrera){
	//Llama al contructorde la Super Clase
	super(nom, dir, f);
	carreraPregrado = carrera;
	}
	//Se redefine el metodo mostrarInfo de la clase AlumnoPre
	public void mostrarInfo(){
	 super.mostrarInfo();
 System.out.println("graduado en : " + carreraPregrado);
 }
}
