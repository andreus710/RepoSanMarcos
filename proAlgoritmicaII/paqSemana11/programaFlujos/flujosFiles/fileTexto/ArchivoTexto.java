package proAlgoritmicaII.paqSemana11.programaFlujos.flujosFiles.fileTexto; /**
 * @(#)ArchivoTexto.java
 *
 *
 * @author 
 * @version 1.00 2011/11/5
 */


import java.io.*;

public class ArchivoTexto {
	public static void main(String args[]) {
		try { 
			// Rutina de escritura del archivo fileLpo.txt
			//PrintWriter salida = new PrintWriter( new BufferedWriter(new FileWriter("fileLpo.txt")) );
			FileWriter fw=new FileWriter("fileLpo.txt");
			BufferedWriter bw=new BufferedWriter(fw); 
			PrintWriter salida = new PrintWriter(bw);
			
			salida.println("\t\t\tSUPREMACIA DE ROMA\n");
			salida.println("En el reinado de Roma de Tulio Hostilio (s vii a JC), ");
			salida.println("los tres hermanos Curiacios, campeones de la villa del Alba ");
			salida.println("y los tres hermanos Horacios, campeones de la villa Roma");
			salida.println("tenian que definir la supremacia de sus pueblos. En el primer");
			salida.println("encuentro los tres hermanos Curiacios fueron heridos y dos Horacios");
			salida.println("murieron. Tres contra uno ...!");
			salida.println("El superviviente Horacio figiendo huir desplaz� a los ");
			salida.println("tres  hermanos Curiacios pudiendo asi derrotar a cada uno de los ");
			salida.println("hermanos Curiacios y de esta forma dio el triumfo a su patria.");
			salida.println("Al regresar a Roma fue recibido con imprecaciones de su  hermana ");
			salida.println("Camila, prometida de uno de los Curiacios, y que su hermano atraves�");
			salida.println("con su espada. ");
			salida.println("Horacio fue absuelto de este crimen en recompensa a los sevicios ");
			salida.println("prestados a la patria ");
			salida.close();
			
			// Rutina de lectura de archivo fileLpo.txt
			//BufferedReader entrada =new BufferedReader(new FileReader("fileLpo.txt"));
			FileReader fr=new FileReader("fileLpo.txt");
			BufferedReader entrada =new BufferedReader(fr);
			String s, s2 = new String();
			s=entrada.readLine();
			while(s!=null){//�Que hace ...?
				s2=s2+ s+"\n";
				s=entrada.readLine();
			}
			
			System.out.println("Texto leido:" + "\n" + s2);
			entrada.close();
		} 
		catch (IOException e) {
			e.printStackTrace(); 
		}
	}
}