
package tareas9;

import java.util.Scanner;


public class problema1 {

    
    public static void main(String[] args) {
         // Creando objeto de lectura
        Scanner lectura = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el numero de personas: ");
        int n = lectura.nextInt();

        // Variables
        double[] pesos = new double[n];
        double suma = 0;
        double promedio;

        // Proceso de datos
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el peso de la persona " + (i + 1) + ": ");
            pesos[i] = lectura.nextDouble();
            suma += pesos[i];  
        }

        promedio = suma / n;

        // Salida de datos
        System.out.println("El peso promedio es: " + promedio + " kg");

    }
}

    
    

