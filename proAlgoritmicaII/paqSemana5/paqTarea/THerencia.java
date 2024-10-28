/**
* nombreClase: THerencia.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 16-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana5.paqTarea;

class THerencia{
public static void main(String[] args){
	Curso c1 = new Curso("202021", 6);
	Curso c2 = new Curso("202023", 5);
	 Curso c3 = new Curso("202026", 4);
	 Curso c4 = new Curso("207127", 12);
	 Persona p1=new Persona("Adan", "Av. Wilson 1800",
	"019939123");
	 AlumnoPre a1=new AlumnoPre("Edith", "Paseo Colon 234", "019922124");
	 AlumnoPos ap1=new AlumnoPos("Juan","Av Arequipa 2323", "019931125", "Ing Sistemas");
	 a1.asignaCurso(c1);
	 a1.asignaCurso(c2);
	 a1.asignaCurso(c3);
	 ap1.asignaCurso(c1);
	ap1.asignaCurso(c4);
	 p1.mostrarInfo();
	 System.out.println();
	 a1.mostrarInfo();
	 System.out.println();
	 ap1.mostrarInfo();
	 //Que pasa si:
	 System.out.println("\n...!\n");
	 Persona p2=p1;
	 Persona p3=a1;
	 Persona p4=ap1;
	 //¿Que se muestra y porque?
	 p2.mostrarInfo();
	 System.out.println();
	 p3.mostrarInfo();
	 System.out.println();
	 p4.mostrarInfo();
 }
}
