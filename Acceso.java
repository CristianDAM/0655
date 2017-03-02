
/**
 * Write a description of class Acceso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Acceso
{
    public int dia;
    public int mes;   
    public int anio;   
    public int hora;   
    public int minutos;
    
    /**
     * Constructor for objects of class Acceso
     */
    public Acceso(int anio, int mes, int dia, int hora, int minutos)
    {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.hora = hora;
        this.minutos = minutos;

    }
    
    /**
     * Metodo que devuelve la hora de los accesos
     */
    public int getHora()
    {
        return hora;        
    }
}
