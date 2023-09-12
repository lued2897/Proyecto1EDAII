/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karla
 */
package ordenamiento; 
public class BubbleSort {
    private static int count;
    public static int bubbleSort(int a[], int n) {  
    int i, j;

    for (i = n - 1; i > 0; i--) {
        boolean verificar = false; 
        for (j = 0; j < i; j++) {
            count++;
            if ( a[j] > a[j + 1]) { 
                swap(a, j, j + 1); 
                verificar = true;
                count++;
            }
            count++;
        }
        count++;
       if (!verificar) 
           return count;
        }
    count++;
    return count;
    
    }
}
