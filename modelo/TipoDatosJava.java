package modelo;

public class TipoDatosJava 
{
  public static void main(String[] args) 
  {
      //Tipos de datos primitivos
        int x= 12;
        short w= 2;
        char c= '@';
        double y= 3.45;
        boolean esta = true;
        System.out.println("Tipos de datos primitivos: ");
        System.out.println("x=  "+ x);

      //Tipos datos referenciados

        String s = "UIS SOCORRO";
        int[] a= new int[12];
        Punto p1 = new Punto(2,3);
        System.out.println("Tipos de datos primitivos: ");
        System.out.println(p1);




  }
}