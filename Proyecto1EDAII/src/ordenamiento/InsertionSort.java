
package ordenamiento; 
public class InsertionSort {

    public static int insertionSort(int array[]) { 
        int count = 0; 
        int n = array.length;  
        for (int j = 1; j < n; j++) {
            int key = array[j]; 
            int i = j-1;  
            
            //para mover los elementos a la derecha 
            while ( (i > -1) && ( array [i] > key ) ) { 
                count++; //comp
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
