
/**
 * Fecha: clase cuyos objetos representan fechas calendarias, para el 
 * calendario gregoriano. Esta clase implementa una variedad de 
 * funcionalidades sobre fechas, como comparaciones, cómputos de días,
 * etc.
 * 
 * @author N. Luna 
 * @version 0.1
 */
public class Fecha
{
    // dia de la fecha
    private int dia;
    
    // mes de la fecha
    private int mes;
    
    // año de la fecha
    private int anho;

    /**
     * Constructor por defecto, para la clase fecha.
     * Crea como fecha por defecto la fecha inicial del 
     * calendario gregoriano (15/10/1582)
     */
    public Fecha()
    {
        dia = 15;
        mes = 10;
        anho = 1582;
    }

    /**
     * Constructor de la clase Fecha, que recibe la fecha a 
     * crear como parámetro. La fecha no puede ser previa
     * al 15/10/1582. Debe tenerse en cuenta la creación de
     * fechas válidas, en relación a número de días en los
     * meses, años bisiestos, etc.
     */
    public Fecha(int nuevoDia, int nuevoMes, int nuevoAnho)
    {
        // Implementar este constructor
        dia = 1;
        mes = 1;
        cambiarAnho(nuevoAnho);
        cambiarMes(nuevoMes);
        cambiarDia(nuevoDia);
    }
    
    /**
     * Retorna el dia de la fecha
     */
    public int obtenerDia() {
        // Implementar este método, reemplazando la línea siguiente
        return dia;
    }
    
    /**
     * Retorna el mes de la fecha
     */
    public int obtenerMes() {
        // Implementar este método, reemplazando la línea siguiente
        return mes;
    }
    
    /**
     * Retorna el año de la fecha
     */
    public int obtenerAnho() {
        // Implementar este método, reemplazando la línea siguiente
        return anho;
    }
    
    /**
     * Cambia el día de la fecha. El nuevo día debe ser válido
     * para el mes y año actuales.
     */
    public void cambiarDia(int nuevoDia) {
        //Implementar este método
        assert nuevoDia >= 1 && nuevoDia <= cantDias(mes, anho) : "Dia incorrecto";
        dia = nuevoDia;
    }
    
    /**
     * Cambia el mes de la fecha. El nuevo mes debe ser válido
     * para el día y año actuales.
     */
    public void cambiarMes(int nuevoMes) {
        //Implementar este método
        assert nuevoMes >= 1 && nuevoMes <= 12 : "Mes incorrecto";
        assert dia <= cantDias(nuevoMes, anho): "Mes incorrecto (resp a los dias)";
        mes = nuevoMes;
    }
    
    /**
     * Cambia el año de la fecha. El nuevo año debe ser válido
     * para el día y mes aactuales.
     */
    public void cambiarAnho(int nuevoAnho) {
        //Implementar este método
        assert nuevoAnho >= 1582: "Año incorrecto";
        assert !(mes == 2 && dia == 29) || esBisiesto(nuevoAnho): "Año incorrecto";
        anho = nuevoAnho;
    }
    
    /**
     * Chequea si la fecha es igual a otra fecha dada
     */
    public boolean equals(Fecha otraFecha) {
        // Implementar este método, reemplazando la línea siguiente
        if (anho != otraFecha.obtenerAnho()){
            return false;
        } else if (mes != otraFecha.obtenerMes()){
            return false;
        }else if (dia != otraFecha.obtenerDia()){
            return false;
        }else{
            return true;
        }
    }
    
    /**
     * Chequea si la fecha es anterior a otra fecha dada
     */
    public boolean esAnterior(Fecha otraFecha) {
        // Implementar este método, reemplazando la línea siguiente
        if (anho < otraFecha.obtenerAnho()){
            return true;
        }else if (anho == otraFecha.obtenerAnho()){
            if (mes < otraFecha.obtenerMes()){
                return true;
            }else if (mes == otraFecha.obtenerMes()){
                return dia < otraFecha.obtenerDia();
            }
        }
        return false;
    }
    
    /**
     * Computa distancia en días entre dos fechas.
     * El parámetro otraFecha debe corresponder a una fecha igual o 
     * posterior a la fecha del objeto.
     */
    public int distancia(Fecha otraFecha) {
        // Implementar este método, reemplazando la línea siguiente
        assert this.equals(otraFecha) || this.esAnterior(otraFecha): "Fecha invalida";
        int dias = 0;
        Fecha corriente = new Fecha(anho, mes, dia);
        while(corriente.obtenerAnho() < otraFecha.obtenerAnho()){
            dias = dias + corriente.avanzarAnho();
        }
        assert corriente.obtenerAnho() == otraFecha.obtenerAnho():"Bug!";
        while(corriente.obtenerMes() < otraFecha.obtenerMes()){
            dias= dias + corriente.avanzarMes();
        }
        assert corriente.obtenerMes() == otraFecha.obtenerMes():"Bug!";
        while(corriente.obtenerDia() < otraFecha.obtenerDia()){
            dias= dias + corriente.avanzarDia();
        }
        return dias;
    }
    
    public int avanzarAnho(){
        int dias = 0;
        if(dia == 1 && mes == 1){
            if(esBisiesto(anho)){
                dias = 366;
            }else{
                dias = 365;
            }
            anho = anho + 1;
        }else{
            while(mes < 12){
                dias= dias + avanzarMes();
            }
            assert mes == 12:"Bug!";
            dia = 1;
            mes = 1;
            anho = anho + 1;
        }      
        return dias;
    }
    
    public int avanzarMes(){
        int dias = 0;
        while(dia < cantDias(mes, anho)){
            dias = dias + avanzarDia();
        }
        assert dia == cantDias(mes, anho): "Bug!";
        dia = 1;
        if (mes < 12){
            mes = mes + 1;
        }else{
            mes = 1;
            anho = anho + 1;
        }
        return dias;
    }
    
    public int avanzarDia(){
        if(dia < cantDias(mes, anho)){
            dia = dia + 1;
        }else{
            dia = 1;
            if(mes < 12){
                mes = mes + 1;
            }else{
                mes = 1;
                anho = anho + 1;
            }
        }
        return 1;
    }
    
    /**
     * Computa la cantidad de días de un mes dado. El parámetro
     * debe corresponder a un mes válido.
     */
    private int cantDias(int unMes, int unAnho) 
    {
        // Implementar este método, reemplazando la línea siguiente
        assert unMes > 0 && unMes <= 12 : "Bug!";
        assert unAnho >= 1582 : "Bug!";
        if(unMes == 2){
            if(esBisiesto(unAnho)){
                return 29;
            }else{
                return 28;
            }
        }else if(unMes == 4 || unMes == 6 || unMes == 9 || unMes == 11){
            return 30;
        }else{
            return 31;
        }
    }
    
    /**
     * Decide si un año dado es bisiesto o no. Un año es bisiesto
     * si es múltiplo de 4, salvo los múltiplos de 100 que no son 
     * múltiplos de 400.
     * El parámetro debe corresponder a un año válido.
     */
    private boolean esBisiesto(int unAnho) 
    {
        // Implementar este método, reemplazando la línea siguiente
        assert unAnho >= 1582 : "Bug!";
        if ((unAnho % 4 == 0) && (unAnho % 100 != 0) || (unAnho % 400 == 0)){
            return true;
        }else{
            return false;
        }
    }
}
