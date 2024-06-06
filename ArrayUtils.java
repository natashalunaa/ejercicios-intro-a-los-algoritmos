
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
    
}