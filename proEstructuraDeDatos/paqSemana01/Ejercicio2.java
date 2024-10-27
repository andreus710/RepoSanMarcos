package proEstructuraDeDatos.paqSemana01;

public class Ejercicio2 {

    public static void main(String[] args) {
        int[] dado = new int[5];

        for(int i=0; i<5; i++){
            dado[i] =i+1;
        }

        int dato , opc=1 ;
        System.out.print("Cual numero desea buscar : ");
        dato = Leer.datoInt();

        int i=0;
        while(i < 5 && opc!=0) {
            if(dato==dado[i]){
                opc=0;
                System.out.println("Se encontro el numero "+ dato+" en la posicion "+i);
            }else {
                opc=1;
            }
            i = i+1;
        }
        if(opc==1) {
            System.out.println("DATO NO ENCONTRADO");

        }

    }

}
