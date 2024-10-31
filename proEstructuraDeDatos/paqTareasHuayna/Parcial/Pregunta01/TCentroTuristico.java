package proEstructuraDeDatos.paqTareasHuayna.Parcial.Pregunta01;

import java.util.ArrayList;

public class TCentroTuristico {


    public static void menu(){
        System.out.println("\n*** MENU ***\n");
        System.out.println("1. CT con mas restaurantes");
        System.out.println("2. Nombre del centro turistico que cuenta con mas habitaciones");
        System.out.println("3. Ingresar Nombre CT");
        System.out.println("4. Relacion CT con resturante y numero habitaciones");
        System.out.println("0. Salir");
        System.out.print("---------> ");
    }


    public static void main(String[] args) {
        ArrayList<CentroTuristico> lista = new ArrayList<>();

        lista.add(new CentroTuristico("Centro A", 20, 30, 5));
        lista.add(new CentroTuristico("Centro B", 40, 25, 8));
        lista.add(new CentroTuristico("Centro C", 15, 10, 2));
        lista.add(new CentroTuristico("Centro D" , 10 , 20 , 3));

        int opc =0;
        do{
            menu();
            opc = Leer.dInt();
            switch (opc){
                case 1:
                    int max=0;
                    CentroTuristico a = new CentroTuristico();
                    for (CentroTuristico ct : lista){
                        ct.mostrar();
                        if(ct.getTotalRestaurantes()> max) {
                            max = ct.getTotalRestaurantes();
                            a = ct;
                        }
                    }

                    System.out.println("El numero de restaurantes que hay en el CT // " + a.getNombre()+" // es "+ a.getTotalRestaurantes() );
                    break;
                case 2:

                    int s=0;
                    CentroTuristico b = new CentroTuristico();
                    for (CentroTuristico ct : lista){
                        ct.mostrar();
                        int suma1 = ct.getNumDobles()+ ct.getNumSencillas();
                        if(suma1 > s ) {
                            s = suma1;
                            b = ct;
                        }
                    }

                    System.out.println("El numero de habitaciones total que hay en el CT // " + b.getNombre()+" // es "+ s );

                    break;
                case 3:

                    if(lista != null){
                        System.out.print("Ingrese el nombre del CT -->");
                        String nom = Leer.dato();
                        for (CentroTuristico ct : lista){
                            if(nom.equals(ct.getNombre())) {
                                System.out.println("El numero de Habitaciones simples es " + ct.getNumSencillas());
                                System.out.println("El numero de Habitaciones Dobles es " + ct.getNumDobles());
                                System.out.println("El numero de Habitaciones simples es " + (ct.getNumSencillas() +ct.getNumDobles()));
                            }
                        }
                    }else{
                        System.out.print("No ha lista generada");
                    }

                    break;
                case 4:
                    int ma=0;
                    CentroTuristico d = new CentroTuristico();
                    for (CentroTuristico ct : lista){
                        ct.mostrar();
                        if(ct.getTotalRestaurantes()> ma) {
                            ma = ct.getTotalRestaurantes();
                            d = ct;
                        }
                    }

                    System.out.println("El numero de restaurantes que hay en el CT // " + d.getNombre()+" // es "+ d.getTotalRestaurantes() + " en relacion con el numero de habitaciones que son "+ ( d.getNumDobles()+d.getNumSencillas()));
                    break;
                case 0:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }while(opc != 0);

    }

}
