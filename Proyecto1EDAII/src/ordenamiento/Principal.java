package ordenamiento;

/**
 *
 * @author lalo
 */
public class Principal {
    
    public static void main(String[] args) {
        
        int count,array[] = Utilerias.randArray(262144,1,1000);
        System.out.println("Arreglo original: ");
        Utilerias.printArray(array);
        
        System.out.println("\nEjecutando MergeSort");
        count=MergeSort.mergeSort(array);
        System.out.println("Operaciones ejecutadas: "+count+"\n");
        
        System.out.println("Arreglo ordenado: ");
        Utilerias.printArray(array);
    }
    
}
