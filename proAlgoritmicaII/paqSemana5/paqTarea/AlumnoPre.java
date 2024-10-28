/**
* nombreClase: AlumnoPre.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 16-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana5.paqTarea;

class AlumnoPre extends Persona{
private Curso[] cursos;
private int cantidadCursos;
 private int maximaCantidadCursos;
 public AlumnoPre(String nom, String dir, String f){
//Debemos construir los objetos de persona y de alumno
super(nom, dir, f); //Llama al constructor de la Super clase
cantidadCursos = 0;
maximaCantidadCursos = 6;
cursos = new Curso[maximaCantidadCursos];
 }
//Se redefine el metodo mostrarInfo de la clase Persona
 public void mostrarInfo(){
super.mostrarInfo();
System.out.println("Num cursos : " + cantidadCursos);
System.out.println("Num creditos : " +
cantidadTotalCreditos());
}
public void asignaCurso(Curso c){
if (!tieneCurso(c)){
 if ( cantidadCursos == maximaCantidadCursos ){
 System.out.println("alumno " + nombre + " NO PUEDE tener mas cursos ...");
 }
else{
cursos[cantidadCursos] = c;
cantidadCursos++;
}
}
}
 public boolean tieneCurso(Curso c){
 boolean tiene = false;
 int i;
for( i = 0; i < cantidadCursos; i++){
if ( cursos[i] == c ){
tiene = true;
 }
 }
 return tiene;
 }
public int cantidadTotalCreditos(){
 int c = 0, i;
 for( i = 0; i < cantidadCursos; i++){
 c = c + cursos[i].getCreditos();
 }
 return c;
 }
}

