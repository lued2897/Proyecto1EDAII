
package ordenamiento;

import java.util.Random;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**Contiene metodos estaticos auxiliares al funcionamiento del programa. 
 * 
 <p>Autor: Perez Osorio Luis Eduardo</p>
 * 
 <p>Ultima modificacion 16/09/2023</p>
 */
public class Utilerias {
    
    /**Imprime en una linea el contenido de un arreglo
     * 
     * @param arr Lista a imprimir.
     * 
     */
    static void printArray(int arr[]){
        int n = arr.length;
        for (int i=0; i<n ; ++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
     /**Intercambia los valores de dos elementos de un arreglo.
      * 
      * @param arr Arreglo que contiene los numeros a intercambiar.
      * @param i Indice del primer numero.
      * @param j Indice del segundo numero.
      * 
      */
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
     /**Crea un arreglo con numeros enteros generados de manera aleatoria.
      * 
      * @param size Tamaño del arreglo deseado.
      * @param min Valor minimo del rango.
      * @param max Valor maximo del rango.
      * @return Arreglo de enteros con el tamaño y rango especificados.
      * 
      */
    static int[] randArray(int size, int min, int max){
        Random rand = new Random(); 
        int[] array = rand.ints(size, min,max).toArray();
        return array;
    }
    /**Crea un arreglo de arreglos donde cada uno tiene un tamaño definido por la lista de tamaños. 
     Utiliza el metodo {@link #randArray(int, int, int) } para inicializar los valores de los arreglos
     * 
     * @param sizes arreglo que contiene la lista de tamaños de los arreglos a crear.
     * @return Arreglo de arreglos con los tamaños especificados.
     
     */
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
    
    /**Guarda una cadena de caracteres en un archivo.
     <p>Crea el archivo si no existe, si existe añade la cadena al final del archivo.</p>
     * @param f Objeto File.
     * @param data Cadena de caracteres que escribira.
     * 
     * 
     */
    public static void writeToFile(File f,String data) {
        FileWriter fr = null;
        try {
            fr = new FileWriter(f,true); //abre el archivo sin sobreescribir datos
            fr.write(data);
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo " + f.getName());
            e.printStackTrace();
        }finally{
            try {
                fr.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo "+ f.getName());
                e.printStackTrace();
            }
        }
    }
}
