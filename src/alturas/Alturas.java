
package alturas;


public class Alturas {

    
    public static void main(String[] args) {
     // tengo que calcular el promedio de altura de 10 personas y mostrar por pantalla.
     //y además mostras por pantalla el nombre de la persona mas alta y la mas baja.
     int altura [] = {150,162,163,154,156,160,179,180,190};
     String nombre [] = {"Marcos","Ludmila","Martín","David","Lucas","Marcela","Susana","Thalia","Pedro","Ignacio"};
     int suma = 0;
     double promedio;
     int alturaMin = 0;
     int alturaMax = 0;
     int minima = 99999;
     int maxima = -99999;
     
    //sacar promedio:
    
    for(int i = 0; i<altura.length; i++){
        suma += altura[i];
    }
    promedio = suma/altura.length;
     
     //buscar la Altura minima y maxima:
     
     for(int i =0; i<altura.length;i++){
         if(altura[i]<minima){
             minima=altura[i];
             alturaMin=i;
         }
         if(altura[i]>maxima){
                maxima=altura[i];
                alturaMax=i;
            }
     }
      
     System.out.println("El promedio es: " + promedio);
     System.out.println("La persona más alta mide: " + maxima + " y se llama " + nombre[alturaMax]);
     System.out.println("La persona más baja: " + minima + " y se llama " + nombre[alturaMin]);
    }
    
}
