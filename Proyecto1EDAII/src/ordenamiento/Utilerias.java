
package ordenamiento;

import java.util.Random;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Utilerias {
    static void printArray(int arr[]){
        int n = arr.length;
        for (int i=0; i<n ; ++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static int[] randArray(int size, int min, int max){
        Random rand = new Random(); 
        int[] array = rand.ints(size, min,max).toArray();
        return array;
    }
    
    static int[][] initArrays(int[] sizes){
        //int arrays[][];
        int[][] arrays = new int [sizes.length][]; 
        for(int i = 0; i<sizes.length;i++){
            arrays[i] = randArray(sizes[i], 1, 100000);
            //System.out.println(arrays[i].length);
            //Utilerias.printArray(arrays[i]);
        }
        return arrays;
    }
    
    public static void writeToFile(File f,String data) {
        FileWriter fr = null;
        try {
            fr = new FileWriter(f,true);
            for (int i = 0; i < data.length(); i++)
                fr.write(data.charAt(i));
            //fr.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            //close resources
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
