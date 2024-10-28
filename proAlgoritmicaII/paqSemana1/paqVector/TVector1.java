package proAlgoritmicaII.paqSemana1.paqVector;
public class TVector1 {

	public static void main(String[] args) {

	  Vector1 v1=new Vector1(new int[] {6, 4, 8, 12, 3, 3});
      v1.mostrarVector();
      v1.ordenarVector();
      v1.mostrarVector();

      System.out.printf("media = %10.2f\n",v1.valorMedio());
      System.out.printf("mayor = %10d\n",v1.valorMayor());
      System.out.printf("menor = %10d\n",v1.valorMenor());

      System.out.println("Presione ENTER para salir...\n");

      try  {
			//espera la pulsación de una tecla y luego RETORNO
         System.in.read();
      }
      catch (Exception e) {
      }

  }
}