package ordenamiento;
/**Algoritmo de ordenamiento HeapSort.
* Ordena un arreglo y cuenta el numero de operacones realizadas.
* @author Perez Osorio Luis Eduardo
* 
* 
*/
public class HeapSort {
    
    /**
     * 
     */
    private static int heapSize;
    private static int count; 
    
     /**
      * 
      * @param arr Lista a ordenar.
      * @param i Indice del nodo padre.
      * Construye un Heap empezando por el nodo i y ejecutandose
      * recursivamente.
      */
    private static void heapify(int arr[],int i){
        int l = (2*i) + 1;
        int r = (2*i) + 2;
        count+=2;
        int largest;
        
        if(l <= heapSize && arr[l] > arr[i]){
            largest = l;
            count++;
        }else{
            largest = i;
            count++;
        }
        count +=2;
        if(r <= heapSize && arr[r] > arr[largest]){
            largest =  r;
            count +=1;
        }
        count +=2;
        if(largest != i){
            Utilerias.swap(arr, i, largest);
            count++;
            //print
            heapify(arr,largest);
        }
        count ++;
    }
    /**
     * 
     * @param arr Lista a ordenar.
     * Construye el Heap inicial, utiliza el metodo {@link #heapify(int[], int) }
     * empezando con el ultimo nodo padre hasta llegar a la raiz.
     */
    private static void buildHeap(int arr[]){
        heapSize = arr.length - 1;
        for(int i = (arr.length-1)/2; i >= 0; i--){
            heapify(arr, i);
            count++; //contar comparaciones del for?
        }
    }
    
    /**Metodo principal del algoritmo HeapSort. Ordena un arreglo en orden ascendente,
     * 
     * @param arr Lista a ordenar.
     * @return Numero de operaciones realizadas por el algoritmo.
     * 
     */
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
