import java.util.ArrayList;

/**
 * Clase NumberUtils: contiene implementaciones de rutinas fundamentales
 * sobre números.
 * 
 * @author N. Luna
 * @version 0.1
 */
public class NumberUtils
{
    
    /**
     * Comprueba si un número es primo.
     */
    public boolean esPrimo(int n) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        if (n < 2) {
            return false;  // Los números menores que 2 no son primos
        }
        
        if (n == 2) {
            return true;   // 2 es el único número primo par
        }
        
        if (n % 2 == 0) {
            return false;  // Los números pares mayores que 2 no son primos
        }
        
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;  // Si se encuentra un divisor, el número no es primo
            }
        }
        return true;  // Si no se encuentran divisores, el número es primo
    }
    
    /**
     * Comprueba si un número es compuesto.
     */
    public boolean esCompuesto(int n) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return false;
    }

    /**
     * Calcula el máximo común divisor de dos números.
     */
    public int maximoComunDivisor(int n, int m) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return 0;
    }

    /**
     * Calcula el mínimo común múltiplo de dos números.
     */
    public int minimoComunMultiplo(int n, int m) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return 0;
    }
    
    /**
     * Calcula los divisores de un número.
     */
    public ArrayList<Integer> divisores(int n) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        // Inicializar una lista para almacenar los divisores
        ArrayList<Integer> listaDivisores = new ArrayList<>();
    
        // Iterar desde 1 hasta la mitad del número
        for (int i = 1; i <= n / 2; i++) {
            // Si el número es divisible por i, agregar i a la lista de divisores
            if (n % i == 0) {
                listaDivisores.add(i);
            }
        }
    
        // Agregar el propio número a la lista de divisores
        listaDivisores.add(n);
    
        // Devolver la lista de divisores
        return listaDivisores;
    }
    
    /**
     * Calcula los primeros n números primos
     */
    public int[] primos(int n) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return null;
    }
    
    /**
     * Calcula el n-ésimo número de Fibonacci
     */
    public int nthFib(int n) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return 0;
    }
    
    /**
     * Calcula los dígitos de un número entero positivo.
     */
    public ArrayList<Integer> digitos(int n) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return null;
    }
}
