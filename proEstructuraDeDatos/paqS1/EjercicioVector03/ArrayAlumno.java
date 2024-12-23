package proEstructuraDeDatos.paqS1.EjercicioVector03;

public class ArrayAlumno {

    public void almacenarDatos(int[] v){
        for(int i = 0; i < v.length; i++){
            v[i] = (int)(Math.random()*20);
        }
    }

    public void leerNotas( int[] v){
        for(int i = 1; i < v.length; i++){
            System.out.println(i+".  "+v[i]);
        }
    }

    public void escribirNotas(int[] v){
        if(v.length == 20){
            System.out.println("Numero maximo de alumnos en la vector");
        }else{
            for(int i = 0; i < v.length; i++){
                if (v[i] == 0) {
                    v[i] = (int) (Math.random()*20);
                    System.out.println("Ingrese la nota del  alumno en la posicion " + i + " : " + v[i]);

                }
            }
        }
    }

    public void notapromedio(int[] v){
        double prom ;
        int suma = 0 ;
        for(int i = 0; i < v.length; i++){
            suma = suma + v[i];

        }
        prom = (double) suma / v.length;

        System.out.println("Promedio del salon : " + prom);
    }



    public static void main(String[] args) {
        int[] v = new int[20];
        ArrayAlumno a = new ArrayAlumno();

        a.almacenarDatos(v);
        a.leerNotas(v);
        a.notapromedio(v);
        a.escribirNotas(v);
    }
}
