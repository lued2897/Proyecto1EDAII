package ordenamientos; 

public class ShellSort {

    public static int countShellSort(int[] array) {
        int n = array.length;
        int count = 0;

        for (int h = n / 2; h > 0; h /= 2) {
            for (int i = h; i < n; i++) {
                int key = array[i];
                int j = i;
                count++;

                while (j >= h && array[j - h] > key) {
                    array[j] = array[j - h];
                    j -= h;
                    count += 2; // Contar comparación e intercambio
                }
                if (j >= h) {
                    count++; // Contar comparación
                }

                array[j] = key;
                count++; // Contar inserción
            }
        }
        return count;
    }
}