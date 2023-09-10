package ordenamiento;

import java.util.ArrayList;

/**
 *
 * @author lalo
 */
public class Principal {
    /*
    public static void main(String[] args) {
        
        int array[] = Utilerias.randArray(20,1,200);
        System.out.println("Arreglo original: ");
        Utilerias.printArray(array);
        
        System.out.println("\nEjecutando MergeSort\n");
        MergeSort.mergeSort(array);
        
        System.out.println("Arreglo ordenado: ");
        Utilerias.printArray(array);
    }
    */
    
    public static void main(String[] args) {
        int arraySizes[] = {0, 16, 32, 64, 128, 256, 512};
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        //array = (Utilerias.randArrayList(arraySizes[0], 0, 500));
        
        for(int i=1; i < arraySizes.length; i++){
            //array1 = Utilerias.randArrayList(arraySizes[i], 0, 500);
            array1.addAll(Utilerias.randArrayList(arraySizes[i] - arraySizes[i-1], 0, 500));
            //array2.addAll(array1);
            array2=(ArrayList)array1.clone();
            System.out.println("Arreglo original: "); 
            Utilerias.printArrayList(array2);
            
            System.out.println("\nEjecutando MergeSort\n");
            MergeSort.mergeSort(array2);
            
            System.out.println("Arreglo ordenado: ");
            Utilerias.printArrayList(array2);
            System.out.println();
        }

    }
}
