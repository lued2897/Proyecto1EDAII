package ordenamiento;

import java.util.ArrayList;

public class MergeSort {
    
    private static ArrayList<Integer> aux; //arreglo auxiliar para la funcion merge
    
    public static int merge(ArrayList<Integer> arr, int low,int mid, int high){
        int i =low,j = mid+1;
        
        for(int k = low; k<=high; k++){ //TODO replace wih clone
            //aux.set(k, arr.get(k));
            aux.add(k,arr.get(k));
        }
        
        for(int k = low ; k <= high; k++){
            if(i>mid){
                arr.set(k, aux.get(j++)); 
                
            }else if(j>high){
                arr.set(k, aux.get(i++));
                
            }else if(aux.get(j) < aux.get(i)){
                arr.set(k, aux.get(j++));
                
            }else{
                arr.set(k, aux.get(i++));
                
            }
        }
        
        return 0;
    }
    
    private static int sort(ArrayList<Integer> arr, int low, int high){
        if(high <= low){
            return 0;
        }
        int mid = low +(high - low)/2;
        sort(arr, low, mid);
        sort(arr, mid+1, high);
        merge(arr, low, mid, high);
        return 0;
    }
    
    public static int mergeSort(ArrayList<Integer> arr){
        //aux = new int[arr.length];
        aux = new ArrayList<>(arr.size());
        sort(arr, 0, arr.size() - 1);
        return 0;
    }
        
}
