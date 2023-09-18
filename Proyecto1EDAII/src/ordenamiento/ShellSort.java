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
