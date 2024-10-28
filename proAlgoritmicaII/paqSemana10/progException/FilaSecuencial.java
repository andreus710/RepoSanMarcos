package proAlgoritmicaII.paqSemana10.progException;

import java.io.*;

public class FilaSecuencial {
	public static void main(String args[]) {
		try { 
			// escritura de datos
			PrintWriter salida = new PrintWriter( new BufferedWriter(
			new FileWriter("prueba.txt")));
			salida.println("en un lugar de la mancha de cuyo");
			salida.println("nombre no quiero acordarme");
			salida.close();
			// lectura de datos
			BufferedReader entrada =new BufferedReader(new
			FileReader("prueba1.txt"));
			String s, s2 = new String();
			while((s = entrada.readLine())!= null) 
				s2 = s2 + s + "\n";
			System.out.println("Texto leido:" + "\n" + s2);
			entrada.close();
		} 
		catch (IOException e) {
			System.out.println("Texto NO leido:");
			System.out.println(e.getMessage());
		}
	}
}