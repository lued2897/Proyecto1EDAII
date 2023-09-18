/**La clase ShellSort proporciona una implementación del algoritmo de ordenamiento ShellSort.
Este algoritmo trabaja dividiendo el arreglo en subgrupos más pequeños, aplicando Insertion Sort a cada 
subgrupo y luego combinando gradualmente estos subgrupos para obtener una lista ordenada.
 
 <p>Autor: Hernández Sánchez Karla
 *
 <p>Ultima modificacion 17/09/2023</p>
 */
package ordenamiento; 

public class ShellSort {

    public static int shellSort(int[] array) {
        int n = array.length;
        int h = n / 2; 
        int count=0; 

        while (h > 0) {
            for (int i = h; i < n; i++) {
                int key = array[i];
                int j = i;
                count++;
                
                while (j >= h && array[j - h] > key) {
                    array[j] = array[j - h];
                    j -= h;
                    count += 2; // Contar comparación e intercambio
                }

                array[j] = key;
                count++; // Contar inserción
            }
            h = h / 2; // Reducir h a la mitad en cada iteración
        }
        return count;
    }
}
