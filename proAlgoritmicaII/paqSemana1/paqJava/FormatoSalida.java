/**
* nombreClase: FormatoSalida.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 19-08-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana1.paqJava;


import java.util.*;
import java.text.*;

public class FormatoSalida {

    public FormatoSalida() {
    }

	public void formatoAlfaNumerico(){
		int x, y;
		float f=11.195f;
		double pi=3.141516;
		char c = 'z';
		String s="Hola Javaaaaa....!";
		x=4;
		y=10;
		//Salida de Datos
		System.out.println("x= "+x+"y= "+y);
		System.out.println("x= "+x+"\n"+"y= "+y);
		System.out.println("f= "+f);
		System.out.println("pi= "+pi);
		System.out.println("c= "+c);
		System.out.println("s= "+s);
		//Salida formateada con printf
		System.out.printf("\nSALIDA FORMATEADA CON printf\n\n");
		System.out.printf("f = %10.4f\n",f);
		System.out.printf("pi= %10.4f\n",pi);
		System.out.printf("c= |%15s|\n",c);
		System.out.printf("c= |%-15s|\n",c);
		System.out.printf("s= |%20s|\n",s);
		System.out.printf("s= |%-20s|\n",s);


		//Lectura de datos
		Scanner jin=new Scanner(System.in);
		System.out.println("\nLECTURA DE DATOS con scaner\n");
		System.out.print("\nIngrese un entero ---> ");
		x=jin.nextInt();
		System.out.println("Se ha leido x = "+x);

		System.out.print("\nIngrese un real -----> ");
		f=jin.nextFloat();
		System.out.println("Se ha leido f = "+f);

		System.out.print("\nIngrese un double ---> ");
		pi=jin.nextDouble();
		System.out.println("Se ha leido pi = "+pi);

		System.out.print("\nIngrese un caracter--> ");
		c=jin.next().charAt(0);
		System.out.println("Se ha leido c = "+c);

		System.out.print("\nIngrese una cadena ---> ");
		s=jin.next();//
		System.out.println("Se ha leido s = "+s);
	}

	public void formatoNumerico(){
		final double PI=3.1415916;
		final double inch=2.54;
		final double IGV=0.19;
		final int nMes=12;
		double radio, area, circun;
		radio=2.55;

		DecimalFormat df=new DecimalFormat("0.00");

		area=PI*radio*radio;
		System.out.printf("\nSALIDA FORMATEADA CON format\n\n");

		System.out.println("radio : "+df.format(radio));
		System.out.println("area  : "+df.format(area));
		System.out.println("Mes   : "+df.format(nMes));

		Formatter formato=new Formatter(System.out);

		formato.format("%10.2f\n", radio);
		formato.format("%10.2f\n", area);
		formato.format("%10d\n", nMes);

		System.out.format("Radio : %10.2f\n", radio);
		System.out.format("Area  : %10.2f\n", area);
		System.out.format("N Mes : %10d\n", nMes);
	}

	public void tiposDeDato(){
		byte byte1;
		short short1;
		int int1;
		long long1;
		float float1;
		double double1;
		char car1, car2;
		byte1=1;
		short1=100;
		int1=1000;
		long1=10000000;
		float1=1.111111111111F;
		double1=1.1111111111111E+9D;
		car1=65;
		car2='C';
		System.out.println("byte = " + byte1);
		System.out.println("short = " + short1);
		System.out.println("int = " + int1);
		System.out.println("long = " + long1);
		System.out.println("float = "+ float1);
		System.out.println("double = "+ double1);
		System.out.println("car1 = " + car1);
		System.out.println("car2 = " + car2);
		System.out.println("car1 + 1 = " + car1 + 1);
		System.out.println("++car2 + 1 = " + ++car2);
	}
}
