package ordenamiento;

public class HeapSort {
    private static int heapSize;
    private static int count; 
    
    private static void heapify(int arr[],int i){
        int l = (2*i) + 1;
        int r = (2*i) + 2;
        count+=2;
        int largest;
        
        if(l <= heapSize && arr[l] > arr[i]){
            largest = l;
            count+=3;
        }else{
            largest = i;
            count+=3;
        }
        if(r <= heapSize && arr[r] > arr[largest]){
            largest =  r;
            count +=3;
        }
        if(largest != i){
            Utilerias.swap(arr, i, largest);
            count+=2;
            //print
            heapify(arr,largest);
        }
    }
    
    private static void buildHeap(int arr[]){
        heapSize = arr.length - 1;
        for(int i = (arr.length-1)/2; i >= 0; i--){
            heapify(arr, i);
            count++; //contar comparaciones del for?
        }
    }
    
    public static int heapSort(int arr[]){
        int size = arr.length; 
        count=0;
        buildHeap(arr);
        for(int i = size - 1; i > 0 ; i-- ){
            Utilerias.swap(arr,0 ,heapSize);
            count+=2;
            heapSize--;
            //print
            heapify(arr,0);
        }
        return count;
    }
    
}
