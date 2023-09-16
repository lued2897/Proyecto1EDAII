
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
                count+=2; //Intercambiamos a[j] y a[j + 1]
            }
        }
       if (!verificar) 
           return count;
    }
    return count;
    
    }
}
