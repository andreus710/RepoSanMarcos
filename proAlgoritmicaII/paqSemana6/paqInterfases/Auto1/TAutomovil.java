/*
 * Composicion vs Herencia
 *
 * La COMPOSICION debe usarse cuando se quiere mantener las caractrerisiticas de una clase ya 
 * existente dento de la nueva clase, pero no su interfaz
 * Se hace con finalidad de:
 * - Implementar su funcionalidad en la nueva clase
 * - El usuario de la nueva define su propia interfaz(metodo)
 *   (se declaran o empotran objeto privados de clases existentes
 *    dentro de la nueva clase)
 *
 * La HERENCIA, se toma una clase existente y se hace una version especial
 * de la misma, esto es, se esta tomando una clase de proposito general para especializarla 
 * para una necesidad especial.
 * Por tanto no tendria sentido COMPONER un Automovil  utilizando
 * un objeto Vehiculo
 *    Un automovil ES UN vehiculo
 * Recordemos, la relacion:
 *     TIENE UN se expresa con composicion
 *     ES UN se expresa con herencia
 *
 * En el siguiente analice las clases, sus metodos, las referencias a ellas y
 * complete la implementacion
 *
 * 
 */

package proAlgoritmicaII.paqSemana6.paqInterfases.Auto1;

public class TAutomovil{
	public static void main(String[] a){
		Automovil auto=new Automovil();
		auto.izquierda.ventana.subir();
		auto.rueda[0].inflar(25);
	}
}