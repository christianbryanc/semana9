
package tareas9;

import java.util.Scanner;

public class problema2 {
    public static void main(String[] args) {
        // // Creando objeto de lectura
        Scanner lectura = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el numero de personas: ");
        int n = lectura.nextInt();

        // Variables 
        double[] ingresos = new double[n];
        double suma = 0;
        double mayorIngreso = 0;

        // Proceso de datos
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el ingreso economico de la persona " + (i + 1) + ": ");
            ingresos[i] = lectura.nextDouble();
            suma += ingresos[i]; 
            
            if (ingresos[i] > mayorIngreso) {
                mayorIngreso = ingresos[i];
            }
        }

        double promedio = suma / n;

        // Salida de datos
        System.out.println("El ingreso promedio es: " + promedio);
        System.out.println("El mayor ingreso es: " + mayorIngreso);

    }
}

    

