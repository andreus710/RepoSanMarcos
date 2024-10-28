package proAlgoritmicaII.paqSemana6.paqInterfases.Lista;

public class Nodo{
   public Object info;
   public Nodo next;
   public Nodo() {
   	next = null;
   }
   public Nodo(Object dato) {
      info = dato; 
    	next = null;
   }
   public Nodo(Object dato, Nodo p) {
      info = dato; 
   	next = p;
   }
}

