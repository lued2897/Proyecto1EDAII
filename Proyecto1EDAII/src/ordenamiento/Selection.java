/**Esta clase contiene el algoritmo de ordenamiento Selection Sort.
 El Selection Sort funciona encontrando repetidamente el elemento mínimo 
 desde la parte no ordenada y colocándolo al principio.
 <p>Autor: Mojica Pereda Elena Samantha
 *
 <p>Ultima modificacion 15/09/2023</p>
 */
package ordenamiento;
public class Selection {
    /**
     * Ordena un arreglo utilizando el algoritmo de Selection Sort.
     * 
     * @param array El arreglo que se desea ordenar.
     * @param size  El tamaño del arreglo.
     * @return La cantidad total de operaciones realizadas durante el proceso de ordenamiento.
     */
    public static int selectionSort(int array[], int size){
        int indiceMenor;
        int count = 0;
        for(int i=0; i<size-1; i++) {
            indiceMenor=i;
            count+=2;
            for(int j=(i+1); j<size; j++){
                count++;
                if(array[j] < array[indiceMenor]){
                    indiceMenor=j;
                    count++;
                }
                count++;
            }
            if(i!=indiceMenor) {
                Utilerias.swap(array, i, indiceMenor);
                count++;
            }
            count++;
        }
        return count;
    }
        
}
