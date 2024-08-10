import java.util.Scanner;

public class Calificaciones {

        public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);

        float promedio=0.0f;
        float primeraCalificacion= 0.0f;
        float segundaCalificacion= 0.0f;
        float terceraCalificacion= 0.0f;
        float cuartaCalificacion= 0.0f;
        float totalCalificacion=0.0f;
        
        System.out.println("ingrese la primera calificacion");
        primeraCalificacion= scan.nextFloat();
        System.out.println("ingrese la segunda calificacion");
        segundaCalificacion= scan.nextFloat();
        System.out.println("ingrese la tercera calificacion");
        terceraCalificacion= scan.nextFloat();
        System.out.println("ingrese la cuarta calificacion");
        cuartaCalificacion= scan.nextFloat();
        totalCalificacion=primeraCalificacion+segundaCalificacion+terceraCalificacion+cuartaCalificacion;
        
        promedio=totalCalificacion/4;
        
          System.out.println("el promedio de la calificaciones es:" + promedio);
         //segunda prueba git de Promedio
    }
    
}