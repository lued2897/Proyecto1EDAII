package ordenamiento;
public class Selection {
    public static int selectionSort(int array[], int size){
        int indiceMenor;
        int count = 0;
        for(int i=0; i<size-1; i++) {
            indiceMenor=i;
            for(int j=(i+1); j<size; j++){
                count++;
                if(array[j] < array[indiceMenor]){
                    indiceMenor=j;
                }
            }
            if(i!=indiceMenor) {
                Utilerias.swap(array, i, indiceMenor);
                count++;
            }
        }
        return count;
    }
        
}
