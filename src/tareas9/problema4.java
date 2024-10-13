

package tareas9;

import java.util.Scanner;

public class problema4 {

    public static void main(String[] args) {
        // Creando objeto de lectura
        Scanner lectura = new Scanner(System.in);

        // Variables
        String[] nombres = new String[5];
        int posicion;
        boolean busqueda;        
        
        // Proceso de datos
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            nombres[i] = lectura.nextLine();
        }

        System.out.print("Ingrese el nombre que desea buscar: ");
        String nombreBuscado = lectura.nextLine();

        busqueda = false;
        posicion = -1;

        for (int i = 0; i < 5; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) { 
                busqueda = true;
                posicion = i;
                break; 
            }
        }

        if (busqueda) {
            System.out.println("El nombre " + nombreBuscado + " existe en el arreglo en la posicion " + (posicion + 1));
        } else {
            System.out.println("El nombre " + nombreBuscado + " no existe en el arreglo.");
        }
    }
}

    
