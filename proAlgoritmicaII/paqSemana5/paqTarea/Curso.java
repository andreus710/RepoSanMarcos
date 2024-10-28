/**
* nombreClase: Curso.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 16-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana5.paqTarea;

class Curso{
	private String codigo;
	private int creditos;
	public Curso(String sig, int cred){
	 codigo = sig;
	 creditos = cred;
	 }
	public int getCreditos(){
	 return creditos;
	 }
	public String getCodigo(){
	 return codigo;
 }
}
