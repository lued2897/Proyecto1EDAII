/**
 *Autor: Mojica Pereda Elena Samantha
 *Fecha:17 de septiembre
 *Clase para ordenar el arreglo a través de SelectionSort
 */
package ordenamiento;
public class Selection {
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
