/**
* nombreClase: Leer.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 08-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana4.paqEmpresa;

import java.io.*;
public class Leer {

    public static String dato(){
        String sdato=" ";
        try{
            //definir un flujo de caracteres de entrada: flujoE
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader flujoE=new BufferedReader(isr);
            //Leer.la entrada finaliza al pulsar la tecla entrar
            sdato =flujoE.readLine();
        }
        catch(IOException e){
            System.err.println("error: "+e.getMessage());

        }
        return sdato;//devolver el dato tecleado
    }
    public static int datoInt(){
        try{
            return Integer.parseInt(dato());
        }
        catch(NumberFormatException e){
            return Integer.MAX_VALUE;//valor mas pequeño
        }
    }
    public static float datoFloat(){
        try{
            Float f=new Float(dato());
            return f.floatValue();
        }
        catch(NumberFormatException e){
            return Float.NaN;//no es un numero: valor double

        }
    }
    public static double datoDouble(){
        try{
            Double d=new Double(dato());
            return d.doubleValue();
        }
        catch(NumberFormatException e){
            return Double.NaN;//no es un numero: valor double

        }
    }
}

