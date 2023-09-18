/**La clase BubbleSort proporciona una implementación del algoritmo de ordenamiento BubbleSort.
  Este algoritmo divide una lista en sublistas más pequeñas, ordena cada lista y luego
  las combina para obtener una lista ordenada.
  
 <p>Autor: Hernández Sánchez Karla
 *
 <p>Ultima modificacion 17/09/2023</p>
 */
package ordenamiento; 
public class BubbleSort {

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
