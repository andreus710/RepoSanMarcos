package proAlgoritmicaII.paqSemana11.progPersistencia.persistenciaAdic; /**
 * @(#)MiObjectOutputStream.java
 *      Operaciones basicas de serializado.
 *
 * @author ddr
 * @version 1.00 2017/4/20
 */

import java.io.*;
public class MiObjectOutputStream extends ObjectOutputStream{
    
    /** 
     * Constructor que recibe OutputStream 
     * @param out OutputStream
     * @throws IOException IOException
     */
    public MiObjectOutputStream(OutputStream out) throws IOException{
        super(out); //Llama al constructor de la superclase(OutputStream)
    }
    
    /** 
     * Constructor sin par�metros 
     * @throws IOException IOException
     */
    protected MiObjectOutputStream() throws IOException, SecurityException{
        super(); //Llama al constructor de la superclase(OutputStream)
    }
    
    @Override
    protected void writeStreamHeader() throws IOException{
        //No hacemos nada
    }
}