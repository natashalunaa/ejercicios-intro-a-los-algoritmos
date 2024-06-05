import java.util.ArrayList;

/**
 * MedicionesTemperaturas representa una lista de mediciones de temperaturas
 * de una estación meteorológica. Las temperaturas están en grados centígrados
 * 
 * @author N. Luna
 * @version 0.1
 */

import java.util.ArrayList;

public class MedicionesTemperaturas
{
    
    // lista de mediciones tomadas en la estacion meteorologica.
    private ArrayList<Float> mediciones;
    
    /**
     * Constructor de MedicionesTemperaturas. Crea la lista de mediciones vacía.
     */
    public MedicionesTemperaturas()
    {
        mediciones = new ArrayList<Float>();
    }
    
    /**
     * Agrega una nueva medicion de temperatura
     */
    public void agregarMedicion(float nuevaTemperatura) {
        assert nuevaTemperatura <= -273.15 : "no valido";
        mediciones.add(nuevaTemperatura);
    }
    
    /**
     * Imprime la lista de temperaturas/mediciones
     */
    public void imprimirTemperaturas()
    {
        System.out.println("Temperaturas Registradas:");
        for (Float temp: mediciones) {
            System.out.println(temp + "C");
        }
    }
    
    /**
     * Imprime la lista de temperaturas/mediciones en Fahrenheit.
     */
    public void imprimirTemperaturasF() {
        System.out.println("Temperaturas Fahrenheit Registradas:");
        for (Float temp: mediciones) {
            float tempF = (temp * 9f/5f) + 32;
            System.out.println(tempF + "F");
        }
    }
    
    /**
     * Calcula el promedio de temperaturas. 
     * Precondicion: debe haber al menos una temperatura cargada para que el promedio tenga sentido.
     */
    public float promedioTemperaturas()
    {
        assert mediciones.size() > 0: "debe haber al menos una temperatura cargada para calcular el promedio";
        float suma = 0;
        for (Float temp: mediciones) {
            suma = suma + temp;
        }
        return suma / mediciones.size();
    }
    
    /**
     * Calcula cantidad de registros de temperaturas negativas (sub cero)
     */
    public int cantidadRegistrosSubCero() {
        int negativas = 0;
        for (Float temp: mediciones) {
            if (temp < 0) {
                negativas = negativas + 1;
            }
        }
        return negativas;
    }
    
    public int cantTemperaturasExtremas(){
        int extremas = 0;
        for (Float temp: mediciones){
            if(temp > 35 || temp < -15){
                extremas = extremas + 1;
            }
        }
        return extremas;
    }
    
    public int cantTempConsecutivas(){
        int cant = 0;
        float tempAnterior = -300; // temp invalida para fallar en la primera iteracion
        for (Float temp: mediciones){
            if (temp == tempAnterior){
                cant = cant + 1;
            }
            tempAnterior = temp;
        }
        return cant;
    }
}
