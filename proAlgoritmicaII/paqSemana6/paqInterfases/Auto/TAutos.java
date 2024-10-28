/**
 * @(#)TAutos.java
 *
 *
 * @author 
 * @version 1.00 2009/10/4
 */
package proAlgoritmicaII.paqSemana6.paqInterfases.Auto;

public class TAutos {

	public static void main(String[] args) {
    
Auto a1,a2;
   	a1 =  new AutoDeportivo("Adan","Deportivo","Rojo");
   	System.out.println(a1);//Analizar su funcionamiento
   	
   	a2 =  new AutoEconomico("Juan","Economico","Azul",new Punto(200,200));
   	System.out.println(a2);
      
      AutoDeportivo ad;
      ad =  new AutoDeportivo("Adan","Descapotable","Plata");
      System.out.println(ad);

      Taxi t1, t2;
   	t1 =  new Taxi("Anace","Taxi",new Punto(30,30),5);
   	System.out.println(t1);
            
   	t2 =  new Taxi("Ignacio","Taxi",new Punto(36,36),4);
   	System.out.println(t2);
      
		for (int i=0;i<3;i++){
			a2.avanza();
	  		System.out.println("==>avanzando....   "+a2);
   	}  	}
}