package proAlgoritmicaII.paqSemana6.paqInterfases.Auto1;

public class Automovil{
	public Motor motor=new Motor();
	public Rueda rueda[]=new Rueda[4];
	public Puerta izquierda=new Puerta(),
				  derecha  =new Puerta();
				  
	public Automovil(){
		for(int i=0;i<4;i++){
			rueda[i]=new Rueda();
		}
	}
}