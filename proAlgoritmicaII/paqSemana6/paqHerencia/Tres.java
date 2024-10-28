/**
 * @(#)Tres.java
 *
 *
 * @author 
 * @version 1.00 2013/4/30
 */
package proAlgoritmicaII.paqSemana6.paqHerencia;


public class Tres extends Dos {

   public Tres() {
   }
	public int result2(){
		return this.result1();
	}
	public int result3(){
		return super.test();
	}    
}