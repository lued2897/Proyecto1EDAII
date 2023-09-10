package ordenamiento;

/**
 *
 * @author lalo
 */
public class Principal {
    
    public static void main(String[] args) {
        
        int array[] = Utilerias.randArray(20,1,200);
        System.out.println("Arreglo original: ");
        Utilerias.printArray(array);
        
        System.out.println("\nEjecutando MergeSort\n");
        MergeSort.mergeSort(array);
        
        System.out.println("Arreglo ordenado: ");
        Utilerias.printArray(array);
    }
    
}
