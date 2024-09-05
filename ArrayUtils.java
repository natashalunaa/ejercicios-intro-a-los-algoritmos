import java.util.Random;
/**
 * Clase ArrayUtils: contiene implementaciones de rutinas fundamentales
 * sobre arreglos.
 * 
 * @author N. Luna
 * @version 0.1
 */
public class ArrayUtils
{
    /**
     * Comprueba si un elemento (entero) pertenece a un arreglo.
     */
    public boolean pertenece(int elem, int[] arreglo) {
        if (arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
        //TODO: Completar la implementación, reemplazando la línea siguiente
        int i = 0;
        boolean found = false;
        while (i < arreglo.length && !found){
            if (elem == arreglo[i]){
                found = true;
            }  
            i = i + 1;
        }
        return found;
    }
    
    /**
     * Calcula la suma de los elementos de un arreglo de enteros
     */
    public int suma(int[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        if (arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
        int sumaValores = 0;
        for (int i = 0; i < arreglo.length; i++){
            sumaValores = sumaValores + arreglo[i];
        }
        return sumaValores;
    }
    
    /**
     * Calcula el valor mínimo de un arreglo de reales
     */
    public float minimo(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        if (arreglo == null || arreglo.length == 0)
        throw new IllegalArgumentException("Arreglo nulo o vacío");
        float valorMinimo = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < valorMinimo) {
                valorMinimo = arreglo[i];
            }
        }
        return valorMinimo;
    }
    
    /**
     * Calcula el valor máximo de un arreglo de reales
     */
    public float maximo(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        if (arreglo == null || arreglo.length == 0)
        throw new IllegalArgumentException("Arreglo nulo o vacío");
        float valorMaximo = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > valorMaximo) {
                valorMaximo = arreglo[i];
            }
        }
        return valorMaximo;
    }
    
    /**
     * Calcula el valor promedio de un arreglo de reales
     */
    public float promedio(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        if (arreglo == null || arreglo.length == 0)
        throw new IllegalArgumentException("Arreglo nulo o vacío");
        float suma = 0;
        for(int i = 0; i < arreglo.length; i++){
            suma = suma + arreglo[i];
        }
        return suma / arreglo.length;
    }
    
    /**
     * Retorna un arreglo con los primeros n números de Fibonacci
     */
    public int[] fibSequence(int n) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return null;
    }
    
    /**
     * Calcula la mediana de un arreglo de reales
     */
    public float mediana(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return 0;
    }
    
    /**
     * Comprueba si dos arreglos de enteros son iguales
     */
    public boolean iguales(int[] arr1, int[] arr2) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        if (arr1 == null || arr2 == null)
        throw new IllegalArgumentException("Uno o ambos arreglos son nulos");
        int i = 0;
        boolean distintos = false;
        if (arr1.length == arr2.length){
            while(i < arr1.length && !distintos){
                if (arr1[i] != arr2[i]){
                    distintos = true;
                }else{
                    i++;
                }
            }
            return !distintos;
        }else{
            return distintos;
        }
    }
    
    /**
     * Comprueba si un arreglo tiene valores repetidos
     */
    public boolean tieneRepetidos(int[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return false;
    }
    
    /**
     * Comprueba si un arreglo tiene dos valores cuya suma dé cero.
     */
    public boolean tieneOpuestos(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return false;
    }
    
    /**
     * Búsqueda lineal en arreglo de enteros
     * Retorna el índice donde se encuentra el elemento, o -1 si no está presente
     */
    public int linealSearch(int elem, int[] arreglo){
        if (arreglo == null || arreglo.length == 0){
            throw new IllegalArgumentException("el arreglo no debe ser nulo o vacío");
        }
        for(int i=0; i < arreglo.length; i++){
            if(arreglo[i] == elem){
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Búsqueda dicotómica en arreglo de enteros
     * Retorna el índice donde se encuentra el elemento, o -1 si no está presente
     */
    public int binarySearch(int elem, int[] arreglo){
        if (arreglo == null || arreglo.length == 0){
            throw new IllegalArgumentException("el arreglo no debe ser nulo o vacío");
        }
        if (!estaOrdenado(arreglo)){
           throw new IllegalArgumentException("El arreglo debe estar ordenado en orden ascendente");
        }
        int low = 0;
        int high = arreglo.length - 1;
        while(low <= high){
            int medio = low + (high - low) / 2;
            if (arreglo[medio] == elem){
                return medio; //retorna el índice del elemento encontrado
            }
            
            if (arreglo[medio] < elem){
                low = medio + 1; //el elemento está en la mitad derecha
            }else{
                high = medio - 1; //el elemento está en la mitad izquierda
            }
        }
        return -1;
    }
    
    private boolean estaOrdenado(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            if (arreglo[i] > arreglo[i + 1]) {
                return false; //retorna false si encuentra un par de elementos desordenados
            }
        }
        return true; //retorna true si no se encuentran elementos desordenados
    }
    
    /**
     * Ordenamiento por inserción
     */
    public void insertionSort(int[] arreglo){
        if (arreglo == null || arreglo.length == 0){
            throw new IllegalArgumentException("el arreglo no debe ser nulo o vacío");
        }
        
        for(int i = 1; i < arreglo.length; i++){
            int j = i;
            while(j > 0 && arreglo[j-1] > arreglo[j]){
                int aux = arreglo[j];
                arreglo[j] = arreglo[j-1];
                arreglo[j-1] = aux;
                
                j = j-1;
            }
        }
    }
    
    /**
     * Ordenamiento por selección
     */
    public void selectionSort(int[] arreglo){
        if (arreglo == null || arreglo.length == 0){
            throw new IllegalArgumentException("el arreglo no debe ser nulo o vacío");
        }
        
        for(int i = 0; i < arreglo.length; i++){
            int minIndex = i;
            
            for(int j = i+1; j < arreglo.length; j++){
                if( arreglo[j] < arreglo[minIndex]){
                    minIndex = j;
                }
            }
            int aux = arreglo[i];
            arreglo[i] = arreglo[minIndex];
            arreglo[minIndex] = aux;
        }
    }
    
    /**
     * Permutación aleatoria
     */
    public void shuffle(int[] arreglo){
        if (arreglo == null || arreglo.length == 0){
            throw new IllegalArgumentException("el arreglo no debe ser nulo o vacío");
        }
        Random generador = new Random();
        for(int i = 0; i < arreglo.length; i++){
            int j = generador.nextInt(arreglo.length - i) + i;
            int aux = arreglo[i];
            arreglo[i] = arreglo[j];
            arreglo[j] = aux;
        }
    }
    
    /**
     * Permutación en secuencias ordenadas.
     */
    public int[] mergeLineal(int[] arr1, int[] arr2){
        if (arr1 == null || arr2 == null) {
            throw new IllegalArgumentException("Los arreglos no deben ser nulos");
        }    
        if (!estaOrdenado(arr1) || (!estaOrdenado(arr2))){
            throw new IllegalArgumentException("Los arreglos deben estar ordenados");
        }
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) { //mezclar ambos arreglos en uno solo, en orden
            if (arr1[i] <= arr2[j]) {
                arr3[k+1] = arr1[i+1];
            } else {
                arr3[k+1] = arr2[j+1];
            }
        }
        
        while (i < arr1.length) { //copiar los elementos restantes de arr1 si quedan
            arr3[k+1] = arr1[i+1];
        }

        while (j < arr2.length) { //copiar los elementos restantes de arr2 si quedan
            arr3[k+1] = arr2[j+1];
        }
        assert estaOrdenado(arr3): "el arreglo no está ordenado";
        return arr3;
    }
}
