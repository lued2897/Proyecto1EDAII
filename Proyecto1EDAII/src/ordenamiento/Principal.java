package ordenamiento;

/**
 *
 * @author lalo
 */
public class Principal {
    
    public static void main(String[] args) {
        
        int count,array[] = Utilerias.randArray(40,1,1000);
        System.out.println("Arreglo original: ");
        Utilerias.printArray(array);
        
        System.out.println("\nEjecutando HeapSort");
        //count=MergeSort.mergeSort(array);
        count = HeapSort.heapSort(array);
        System.out.println("Operaciones ejecutadas: "+count+"\n");
        
        System.out.println("Arreglo ordenado: ");
        Utilerias.printArray(array);
    }
    
}
