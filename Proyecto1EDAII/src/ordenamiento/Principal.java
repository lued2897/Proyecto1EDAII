package ordenamiento;


import java.io.File;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

/**Clase principal del proyecto 1 de la materia de Estructuras de datos y algoritmos II
 * 
 <p>Autor: Perez Osorio Luis Eduardo</p>
 * 
 <p>Ultima modificacion 17/09/2023</p>
 */

public class Principal {
    
    /**Metodo main 
    <p>No recibe argumentos de linea de comandos
     Ejecuta los algoritmos de ordenamiento incluidos en el paquete y cuenta 
     las operaciones realizadas.
     Cada algoritmo realiza una corrida por cada tamaño incluido en el arreglo sizes.
     Una corrida consiste en 5 ejecuciones del algorimto.
     
     Imprime el numero de operaciones de cada ejecucion el algoritmo, los resultados
     se guardan en un archivo .csv en la misma carpeta que contiene el proyecto</p>
     Autor: Perez Osorio Luis Eduardo
     @author 
     @author 
    * 
    */
    public static void main(String[] args) {
        int sizes[] = {50,100,500,800,1000,2000,5000,10000};
        int count=0;
        int[][] arrays;
        String operations = "";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd--HH;mm;ss");
        File f = new File("datos-"+dtf.format(LocalDateTime.now())+".csv");
        System.out.println("Resultados guardados en: ./"+ f.getName());
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
            }//for j
            System.out.println(operations);
            Utilerias.writeToFile(f, operations + "\n");
            operations = "";
            }//for k
            Utilerias.writeToFile(f,"\n\n");
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
