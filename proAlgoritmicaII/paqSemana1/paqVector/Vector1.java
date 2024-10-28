/*
 *  Nombre Prog:  Vector1
 *  Descripcion:  Clase vector de entros con las operaciones basicas
 *      Leer, Ordenar,  Mostrar Vector
 *			Tarea
 *  0. Analice la implementacion de la clase, atributos y metodos.
 *     La implementqcion de los metodos/operaciones crear, leer,
 *     mostrar, ordenar, mayor, menor de vector es lo mismo a las
 *     implementaciones de la programacion modular. Practicar esto
 *     y asi sera mas facil la implementacion de vector de objetos.
 *
 *	1. Implemente una nueva clase Vector2 con el atributo  int v[]
 *		Cada ves que se inserte o elimine datos al vector esto debe hacerlo
 *		automaticamente. Para esto debe crear dos metodos uno para aumentar
 *		y otro para disminuir la dimension del vector, entonces al insertar
 *		un elemento primero debe llamarse a redimensionar, luego de eliminar
 *		debe llamar redimensionar para actualizar la dimension del vector: Pues
 *		se trata de vectores dinamicos.
 *	2.  Comparar la implementacion  de las operaciones basicas de la
 *      programacion en C, de implementacion OO en C++ y Java, se aplica los
 *      mismso conceptos teniendo en cuentas las sintaxis  de cada uno
 *      de los lenguajes C, C++ y Java.
 *  3.  Estudie y practique mas, anote sus dudas y consulte a primera hora
 *      de la siguiente clase.
 *
 *  Autor: gasa
 *  Fecha: 03072024
 *  Version 1
 */
package proAlgoritmicaII.paqSemana1.paqVector;

public class Vector1 {
    int v[];		//array de datos
    int dv;      	//dimensi n

    public Vector1(){
    }
    public Vector1(int vx[]) {
        this.v=vx;
        dv=v.length;
    }

    public double valorMedio(){
        int suma=0;
        if(dv>0){
	        for(int i=0; i<dv; i++){
	            suma=suma+v[i];
	        }
	        return (double)suma/dv;
        }
        else{
        	System.out.println("vector vaciooo...\n");
        	return(0);
        }
    }

    public int valorMayor(){
    	int mayor;
    	if(dv>0){
	        mayor=v[0];
	        for(int i=1; i<dv; i++){
	            if(v[i]>mayor){
	            	mayor=v[i];
	            }
	        }
	        return  mayor;
    	}
    	else{
        	System.out.println("vector vaciooo...\n");
        	return(0);
    	}
    }

    public int valorMenor(){
    	int i,menor;
    	if(dv>0){
	        menor=v[0];
	        for(i=1; i<dv; i++){
	            if(v[i]<menor) {
	            	menor=v[i];
	            }
	        }
	        return  menor;
    	}
    	else{
        	System.out.println("vector vaciooo...\n");
        	return(0);
    	}
    }

    public void ordenarVector(){
        int aux,i;
    	if(dv>0){
	        for(i=0; i<dv-1; i++){
	            for(int j=i+1; j<dv; j++){
	                if(v[i]>v[j]){
	                    aux=v[j];
	                    v[j]=v[i];
	                    v[i]=aux;
	                }
	            }
	        }
    	}
    	else{
        	System.out.println("vector vaciooo...\n");
    	}
    }

    public void mostrarVector(){
    	int i;
    	if(dv>0){
    		System.out.print("Vector = {");
	        for(i=0; i<dv; i++){
	            System.out.printf("%d ",v[i]);
	        }
	        System.out.println("}");
    	}
    	else{
        	System.out.println("vector vaciooo...\n");
    	}
    }
}
