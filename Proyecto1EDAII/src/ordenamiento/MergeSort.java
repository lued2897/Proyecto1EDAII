package ordenamiento;

/**
 *
 * @author lalo
 */
public class MergeSort {
    
    private static int aux[]; //arreglo auxiliar para la funcion merge
    
    public static int merge(int arr[], int low,int mid, int high){
        int i =low,j = mid+1;
        
        for(int k = low; k<=high; k++){ //TODO replace wih clone
            aux[k] = arr[k];
        }
        
        for(int k = low ; k <= high; k++){
            if(i>mid){
                arr[k] = aux[j++]; 
                
            }else if(j>high){
                arr[k] = aux[i++];
                
            }else if(aux[j] < aux[i]){
                arr[k] = aux[j++];
                
            }else{
                arr[k] = aux[i++];
                
            }
        }
        
        return 0;
    }
    
    private static int sort(int arr[], int low, int high){
        if(high <= low){
            return 0;
        }
        int mid = low +(high - low)/2;
        sort(arr, low, mid);
        sort(arr, mid+1, high);
        merge(arr, low, mid, high);
        return 0;
    }
    
    public static int mergeSort(int arr[]){
        aux = new int[arr.length];
        sort(arr, 0, arr.length - 1);
        return 0;
    }
        
}
