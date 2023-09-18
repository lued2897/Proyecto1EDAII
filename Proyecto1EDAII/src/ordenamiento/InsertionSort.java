
package ordenamiento; 
/**La clase InsertionSort proporciona una implementación del algoritmo de ordenamiento InsertionSort.
Este algoritmo a medida que avanza, va dividiedno el arreglo en unaparte ordenada y una desordenada 
toma elementos de la parte desordenada y los inserta en la posición correcta.
 <p>Autor: Hernández Sánchez Karla
 *
 <p>Ultima modificacion 17/09/2023</p>
 */
public class InsertionSort {
    /**
     * 
     * @param array Lista de entrada
     * @return numero de operaciones realizadas
     */
    public static int insertionSort(int array[]) { 
        int count = 0; 
        int n = array.length;  
        for (int j = 1; j < n; j++) {
            int key = array[j]; 
            int i = j-1;  
            count+=2; // Contador para el bucle externo (for) y comp comp array [i] > key
            while ( (i > -1) && ( array [i] > key ) ) { 
                array [i+1] = array [i];  
                count++; //inter, se mueve array[i] a la derecha
                i--;  
            }  
            array[i+1] = key;  
            count++; //Inse, Se coloca a key en su lugar correcto
        }
        return count; 
    } 
}
