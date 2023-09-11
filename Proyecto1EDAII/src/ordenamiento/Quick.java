package ordenamiento;
public class Quick {
    private static int count;
    public static int quickSort(int array[], int low, int high){
        if(low < high) {
            int piv = partition(array, low, high);
            quickSort(array, low, (piv-1));
            quickSort(array, (piv+1), high);
            count +=2;
        }
        return count;
    }

    public static int partition (int array[], int low, int high) {
        int pivot = array[high];
        int i=(low-1);
        for(int j=low; j<=(high-1); j++) {
            if (array[j] <= pivot) {
                i++;
                Utilerias.swap(array, i, j);
                count++;
            }
        }
        Utilerias.swap(array, (i+1), high);
        count++;
        return (i+1);
    }   
}
