package taller.repaso.pkg1;
public class TallerRepasopunto2 
{
    public static void main(String[] arg) 
    {
        System.out.println("Ingrese el numero de histogramas a realizar");
        java.util.Scanner teclado=new java.util.Scanner (System.in);
        int cantidad=teclado.nextInt();
        for(int vez=0;vez<cantidad;vez++)
        {
            System.out.println("Ingrese el numero de barras de el histograma "+(vez+1));
        
            int barras= teclado.nextInt();
            char x='*';
            char z=' ';
            char[][] matrix= new char[barras][15];
            for(int i=0;i<barras;i++)
            {
                for(int k=0;k<15;k++)
                {
                    matrix[i][k]=z;
                }
            }
            for(int i=0;i<barras;i++)
            {
                System.out.println("Ingrese los numeros para la barra"+(i+1));
                String numero=teclado.next();
                int largo=numero.length();
                for(int k=0;k<largo;k++)
                {
                   matrix[i][k]=x;
                }
            }
            System.out.println("Histograma"+(vez+1));
            for(int i =0;i<barras;i++)
            {
                for(int k=0;k<15;k++)
                {
                     System.out.print(matrix[i][k]);
                }
                System.out.println();
            }
        }
    
    }
}
