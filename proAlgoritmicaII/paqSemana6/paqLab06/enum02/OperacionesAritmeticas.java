/**
 * @(#)OperacionesAritmeticas.java
 *
 *
 * @author
 * @version 1.00 2024/9/18
 */

package proAlgoritmicaII.paqSemana6.paqLab06.enum02;

public class OperacionesAritmeticas {
	private int num1;
	private int num2;

    public OperacionesAritmeticas() {
    }
    public OperacionesAritmeticas(int vnum1, int vnum2) {
    	num1=vnum1;
    	num2=vnum2;
    }

	public void setNum1(int vnum1){
		num1=vnum1;
	}
	public void setNum2(int vnum2){
		num2=vnum2;
	}

	public int getNum1(){
		return num1;
	}
	public int getNum2(){
		return num2;
	}
	public void operaciones(){

	}
}