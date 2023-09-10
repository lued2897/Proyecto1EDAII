
package ordenamiento;

import java.util.ArrayList;
import java.util.Random;

public class Utilerias {
    static void printArray(int arr[]){
        int n = arr.length;
        for (int i=0; i<n ; ++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    static void printArrayList(ArrayList<Integer> arr){
        int n = arr.size();
        for (int i=0; i<n ; ++i){
            System.out.print(arr.get(i)+" ");
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
    
    static ArrayList<Integer> randArrayList(int size, int min, int max){
        ArrayList<Integer> array = new ArrayList<>(size);
        Random rand = new Random(); 
        for(int i=0; i<size; i++){
            array.add(rand.nextInt(min, max));
        }
        //int[] array = rand.ints(size, min,max).toArray();
        return array;
    }
}
