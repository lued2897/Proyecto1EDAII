package ordenamiento;

/** Ordena un arreglo utilizando Merge Sort y cuenta las operaciones realizadas
 <p>Autor: Perez Osorio Luis Eduardo</p>
 * 
 <p>Ultima modificacion 16/09/2023</p>
 */
public class MergeSort {
    
    private static int aux[]; //arreglo auxiliar para la funcion merge
    private static int count;
    
    private static void merge(int arr[], int low,int mid, int high){
        int i =low,j = mid+1;
        count+=2;
        
        for(int k = low; k<=high; k++){ 
            aux[k] = arr[k];
            count+=2;
        }
        
        for(int k = low ; k <= high; k++){
            if(i>mid){
                arr[k] = aux[j++]; 
                count+=2;
                
            }else if(j>high){
                arr[k] = aux[i++];
                count+=3;//3
                
            }else if(aux[j] < aux[i]){
                arr[k] = aux[j++];
                count+=4; //4
                
            }else{
                arr[k] = aux[i++];
                count+=4; //4
            }
            count++;
        }
    }
    
    private static void sort(int arr[], int low, int high){
        if(high <= low){
            count++;
            return;
        }else count++;
        int mid = low +(high - low)/2;
        sort(arr, low, mid);
        sort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    
    public static int mergeSort(int arr[]){
        aux = new int[arr.length];
        count=0;
        sort(arr, 0, arr.length - 1);
        return count;
    }
        
}
