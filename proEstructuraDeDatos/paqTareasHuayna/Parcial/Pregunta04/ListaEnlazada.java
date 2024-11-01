package proEstructuraDeDatos.paqTareasHuayna.Parcial.Pregunta04;


import java.util.Objects;

public class ListaEnlazada {
    Nodo cabeza; //Primer nodo de la lista

    public ListaEnlazada() {
        this.cabeza = cabeza; // la lista inicialmente esta vacia
    }

    //Agregar un nuevo nodo al fianl de la lista
    public void reservar_Sala(int sala , int hora  , String dia ){
        Nodo nuevo = new Nodo(sala , hora , dia);
        if(cabeza == null){ // si la lista empieza vacia
            cabeza = nuevo;
        }else {// si no lo esta
            int[][] horas_semana = new int[7][6];
            for(int i = 0; i < 7; i++){
                for(int j = 0; j < 6; j++){
                    horas_semana[i][j]=0;
                }
            }
            int d;
            Nodo temp  = cabeza;
            while(temp  != null){
                if(Objects.equals(temp.dia, "LUNES")){
                    horas_semana[0][temp.sala] +=1;
                }else if(Objects.equals(temp.dia, "MARTES")){
                    horas_semana[1][temp.sala] +=1;
                }else if(Objects.equals(temp.dia, "MIERCOLES")){
                    horas_semana[2][temp.sala] +=1;
                }else if(Objects.equals(temp.dia, "JUEVES")){
                    horas_semana[3][temp.sala] +=1;
                }else if(Objects.equals(temp.dia, "VIERNES")){
                    horas_semana[4][temp.sala] +=1;
                }else if (Objects.equals(temp.dia, "SABADO")){
                    horas_semana[5][temp.sala] +=1;
                }else if(Objects.equals(temp.dia, "DOMINGO")){
                    horas_semana[6][temp.sala] +=1;
                }else{
                    System.out.println("ERROR");
                    return;
                }
                temp = temp.next;// recorre la lista hasta el ultimo
            }

            switch(nuevo.dia){
                case "LUNES":
                    d=0;
                    break;
                case "MARTES":
                    d=1;
                    break;
                case "MIERCOLES":
                    d=2;
                    break;
                case "JUEVES":
                    d=3;
                    break;
                case "VIERNES":
                    d=4;
                    break;
                case "SABADO":
                    d=5;
                    break;
                case "DOMINGO":
                    d=6;
                    break;
                default:
                    System.out.println("ERROR");
                    return;
            }

            if(horas_semana[d][nuevo.sala]<4){
                temp = cabeza;
                while (temp.next != null) {
                    temp = temp.next; // mueve temp al último nodo
                }
                temp.next = nuevo;
                System.out.println("Se a registrado correctamente");// agregar al nuevo nodo al final
            }else{
                System.out.println("El lugar que a seleccionado ya esta ocupado , elija otro dia");
            }

        }
    }


    public void encabezado(){
        System.out.printf("  %-10s%-10s%-10s\n" , "SALA" , "HORA" , "DIA");
        System.out.println("---------------------------------------");
    }

    //Metodo para mostrar la lista
    public  void mostrar(){
        Nodo temp = cabeza;
        encabezado();
        while(temp != null){
            System.out.printf ("  Sala %-10d%-6d%-10s\n" , temp.sala , temp.hora , temp.dia);
            temp = temp.next;  // pasar al siguiente nodo
        }
        // fin de la lista poner nulo
    }

    //insertar en una posicion
    public void insertar(int sala , int hora , String dia, int posicion) {
        Nodo nuevo = new Nodo(sala , hora , dia);

        if (posicion == 0) {
            nuevo.next = cabeza;
            cabeza = nuevo;
        } else {
            Nodo temp = cabeza;
            int contador = 0;

            while (temp != null && contador < posicion - 1) { // Llegar a la posición anterior
                temp = temp.next;
                contador++;
            }

            if (temp == null) {
                System.out.println("La posición es mayor que el tamaño de la lista. Insertando al final.");
                reservar_Sala(sala , hora , dia); // Agregar al final si la posición es mayor que el tamaño
            } else {
                nuevo.next = temp.next; // Inserta en la posición
                temp.next = nuevo;
            }
        }
    }

    public void eliminarPenultimo() {
        if (cabeza == null) {
            System.out.println("La lista está vacía...");
            return;
        }
        if (cabeza.next == null) {
            System.out.println("La lista solo tiene un nodo, no hay penúltimo nodo para eliminar.");
            return;
        }

        // Caso especial: solo hay dos nodos
        if (cabeza.next.next == null) {
            cabeza.next = null; // Eliminar el segundo nodo, que es el último y penúltimo a la vez
            return;
        }

        // Caso general: más de dos nodos
        Nodo temp = cabeza;
        while (temp.next.next.next != null) {
            temp = temp.next;
        }

        // Aquí, temp está en el nodo anterior al penúltimo
        temp.next = temp.next.next; // Eliminar el penúltimo nodo
        System.out.println("El penúltimo nodo ha sido eliminado.");
    }

}
