package taller.repaso.pkg1;
import java.lang.*;
import java.util.Scanner;
public class TallerRepasopunto1 
{
    
    
    public static void
        main(String []arg)
{
Scanner teclado=new Scanner(System.in);
        String str;
        str = teclado.next();
    
   //System.out.println("index of letter ',' = " + str.indexOf(','));
   //str.indexOf(',') permite hallar la posicion de la coma en la cadena str
   
   int a =(str.indexOf(',')+1);
   
   if(a!=0)
   {
   double b = Integer.parseInt(str.substring(0,(a-1)));
   double c = Integer.parseInt(str.substring(a));
   
   double area = Math.pow(((b*c)/6.28399),2)*3.1416;
   int area2=(int)area;
   System.out.println(area2);  
   }
   
   else
   {
       System.out.println ("Debe digitar una coma para separar los números. Intente de nuevo");
   }
   
    }
}

