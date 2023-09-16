package ordenamiento;

import java.io.File;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

public class Principal {
    
    public static void main(String[] args) {
        int sizes[] = {50,100,500,800,1000,2000,5000,10000};
        int count=0;
        int[][] arrays;
        String operations = "";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd--HH;mm;ss");
        File f = new File("datos-"+dtf.format(LocalDateTime.now())+".csv");
        
        for(int i=1; i<=7; i++){
            
            for(int k=0; k<5; k++){
                arrays = Utilerias.initArrays(sizes);
            for(int j=0; j<sizes.length; j++){
                switch(i){
                    case 1:
                        if(j==0 & k==0) System.out.println("Bubble");
                        count = BubbleSort.bubbleSort(arrays[j], arrays[j].length);
                        break;
                        
                    case 2:
                        if(j==0 & k==0) System.out.println("Insertion");
                        count = InsertionSort.insertionSort(arrays[j]);
                        break;
                    
                    case 3:
                        if(j==0 & k==0) System.out.println("Selection");
                        count = Selection.selectionSort(arrays[j], arrays[j].length);
                        break;
                    
                    case 4:
                        if(j==0 & k==0) System.out.println("Quick");
                        count =Quick.quickSort(arrays[j], 0, arrays[j].length-1);
                        break;
                        
                    case 5:
                        if(j==0 & k==0) System.out.println("Heap");
                        count = HeapSort.heapSort(arrays[j]);
                        break;
                        
                    case 6:
                        if(j==0 & k==0) System.out.println("Merge");
                        count = MergeSort.mergeSort(arrays[j]);
                        break;
                        
                    case 7:
                        if(j==0 & k==0) System.out.println("Otro");
                        break;
                }
                //Utilerias.printArray(arrays[j]);
                operations += Integer.toString(count);
                if(j != sizes.length-1) operations +=", ";
                count = 0;
            }
            System.out.println(operations);
            //Utilerias.writeToFile(f, operations + "\n");
            operations = "";
            }
            //Utilerias.writeToFile(f,"\n\n");
        }
        
        /*
        int count,array[] = Utilerias.randArray(40,1,1000);
        System.out.println("Arreglo original: ");
        Utilerias.printArray(array);
        
        System.out.println("\nEjecutando HeapSort");
        //count=MergeSort.mergeSort(array);
        count = HeapSort.heapSort(array);
        System.out.println("Operaciones ejecutadas: "+count+"\n");
        
        System.out.println("Arreglo ordenado: ");
        Utilerias.printArray(array);
        */
    }
    
    
    
}
