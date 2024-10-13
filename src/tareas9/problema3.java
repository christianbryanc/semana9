
package tareas9;

import java.util.Scanner;

public class problema3 {
    public static void main(String[] args) {
        // Creando objeto de lectura
        Scanner lectura = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el numero de personas: ");
        int n = lectura.nextInt();

        // Variables
        double[] compras = new double[n];
        double suma = 0;
        double mayorCompra = Double.MIN_VALUE;
        double menorCompra = Double.MAX_VALUE;

        // Proceso de datos
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el monto de la compra de la persona " + (i + 1) + ": ");
            compras[i] = lectura.nextDouble();
            suma += compras[i]; 

            if (compras[i] > mayorCompra) {
                mayorCompra = compras[i];
            }
            if (compras[i] < menorCompra) {
                menorCompra = compras[i];
            }
        }

        double promedio = suma / n;

        // Salida de datos
        System.out.println("El total de las compras es: " + suma);
        System.out.println("El promedio de las compras es: " + promedio);
        System.out.println("La mayor compra es: " + mayorCompra);
        System.out.println("La menor compra es: " + menorCompra);
        
    }
}
