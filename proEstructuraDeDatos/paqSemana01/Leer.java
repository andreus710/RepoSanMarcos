package proEstructuraDeDatos.paqSemana01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
            return Float.parseFloat(dato());
        }
        catch(NumberFormatException e){
            return Float.NaN;//no es un numero: valor double
        }
    }
    public static double datoDouble(){
        try{
            return Double.parseDouble(dato());
        }
        catch(NumberFormatException e){
            return Double.NaN;
        }
    }
}


