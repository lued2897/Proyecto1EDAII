
package ordenamiento; 
/**La clase BubbleSort proporciona una implementación del algoritmo de ordenamiento BubbleSort.
 Este algoritmo recorre repetidamente una lista, compara elementos adyacentes y los intercambia si están en 
 el orden incorrecto. Este proceso se repite hasta que la lista esté completamente ordenada.
 
 <p>Autor: Hernández Sánchez Karla
 *
 <p>Ultima modificacion 17/09/2023</p>
 */
public class BubbleSort {

    /***
     * 
     * @param a lista de entrada
     * @param n tamaño de la lista
     * @return conteo de las operaciones realizadas
     */
    public static int bubbleSort(int a[], int n) {  
    int i, j, count = 0;

    for (i = n - 1; i > 0; i--) {
        count++;
        boolean verificar = false; 
        for (j = 0; j < i; j++) {
            count++; //se compara  a[j] y a[j + 1]
            if ( a[j] > a[j + 1]) { 
                Utilerias.swap(a, j, j + 1); 
                verificar = true;
                count ++; //Intercambiamos a[j] y a[j + 1]
            }
            count ++;
        }
       if (!verificar) 
           return count;
    }
    return count;
    
    }
}
