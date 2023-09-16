package ordenamiento;
public class Quick {
    public static int count;
    public static int quickSort(int array[], int low, int high){
        count = 0;
        if(low < high) {
            int piv = partition(array, low, high);
            count += quickSort(array, low, (piv-1));
            count +=quickSort(array, (piv+1), high);
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
                count+=2;
            }
        }
        Utilerias.swap(array, (i+1), high);
        count++;
        return (i+1);
    }   
}
