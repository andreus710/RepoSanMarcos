/**
 * @(#)GradoEstudios.java
 *		Clase enumerado enum.
 *	Analice el codig y las operaciones
 *	Implemente la clase TGradoEstudios y tesstee las operaciones.
 *
 *	Que uso puede darle
 *	Que operaciones agregaria.
 *
 * @author
 * @version 1.00 2024/9/18
 */

package proAlgoritmicaII.paqSemana6.paqLab06.enum01;

public class GradoEstudios {
	public enum Estudio {
		SIN_ESTUDIOS, PRIMARIA, SECUNDARIA, SUPERIOR
	};

	private int num;
	private Estudio estudio;

    public GradoEstudios() {
    }

    public GradoEstudios(int vnum, Estudio vestud) {
    	num=vnum;
    	estudio=vestud;
    }

    public int getNum(){
    	return num;
    }
    public Estudio getEstudio(){
    	return estudio;
    }
	public String toString(){
		String cad="";
		cad=String.format("%4d %-15s", num, estudio);
		return(cad);
	}
}