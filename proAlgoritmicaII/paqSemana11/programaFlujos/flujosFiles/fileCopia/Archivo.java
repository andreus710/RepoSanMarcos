package proAlgoritmicaII.paqSemana11.programaFlujos.flujosFiles.fileCopia; /**
 * @(#)Archivo.java
 *
 *
 * @author 
 * @version 1.00 2011/11/5
 */


import java.io.*;
public class Archivo {
	public static void main(String[] args) throws IOException {
		File fEntrada = new File("filelpo.txt");
		File fSalida = new File("cfilelpo.txt");
		
		FileReader entrada = new FileReader(fEntrada);
		FileWriter salida = new FileWriter(fSalida);
		int dato;
		while ( (dato = entrada.read()) != -1 )
			salida.write(dato);
	
		entrada.close();
		salida.close();
	}
}