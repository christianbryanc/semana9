
package tareas9;

import java.util.Scanner;

public class problema5 {
    public static void main(String[] args) {
        // Creando objeto de lectura
        Scanner lectura = new Scanner(System.in);

        // variables
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[10]; 

        // Proceso de datos
        System.out.println("Ingrese 5 numeros para el arreglo a:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Numero " + (i + 1) + " para a: ");
            a[i] = lectura.nextInt();
        }

        System.out.println("\nIngrese 5 numeros para el arreglo b:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Numero " + (i + 1) + " para b: ");
            b[i] = lectura.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            c[i * 2] = a[i];     
            c[i * 2 + 1] = b[i];  
        }

        // Salida de datos
        System.out.println("\nArreglo c con los valores intercalados de a y b:");
        for (int i = 0; i < 10; i++) {
            System.out.print(c[i] + " ");
        }

    }
}

    
