/**
 *Autor: Mojica Pereda Elena Samantha
 *Fecha última modificación:17 de septiembre
 * La clase Quick proporciona una implementación del algoritmo de ordenamiento QuickSort.
 * Este algoritmo divide una lista en sublistas más pequeñas, ordena cada lista y luego
 * las combina para obtener una matriz ordenada.
 */
package ordenamiento;
public class Quick {
     
    /**
     * Un contador que rastrea la cantidad total de operaciones realizadas durante el proceso de ordenamiento.
     */
    public static int count;

    /**
     * Ordena una matriz utilizando el algoritmo QuickSort.
     *
     * @param array La matriz que se va a ordenar.
     * @param low   El índice más bajo de la lista (generalmente 0).
     * @param high  El índice más alto de la lista (generalmente la longitud de la matriz - 1).
     * @return El número total de operaciones realizadas durante el proceso de ordenamiento.
     */
    public static int quickSort(int array[], int low, int high){
        count = 0;
        if(low < high) {
            int piv = partition(array, low, high);
            count += quickSort(array, low, (piv-1));
            count +=quickSort(array, (piv+1), high);
            count ++;
        }
        return count;
    }
    
    /**
     * Particiona una lista en dos sublistas y coloca elementos menores o iguales al pivote
     * en la sublista izquierda y elementos mayores en la sublista derecha.
     *
     * @param array La lista que se va a particionar.
     * @param low   El índice más bajo de la lista.
     * @param high  El índice más alto de la lista.
     * @return El índice del pivote después de la partición.
     */

    public static int partition (int array[], int low, int high) {
        int pivot = array[high];
        int i=(low-1);
        count+=2;
        for(int j=low; j<=(high-1); j++) {
            count ++;
            if (array[j] <= pivot) {
                i++;
                Utilerias.swap(array, i, j);
                count ++;
            }
            count++;
        }
        Utilerias.swap(array, (i+1), high);
        count++;
        return (i+1);
    }   
}
