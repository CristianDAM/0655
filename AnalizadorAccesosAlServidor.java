import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Write a description of class AnalizadorAccesosAlServidor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnalizadorAccesosAlServidor
{

    private  ArrayList<Acceso> accesosServ;

    /**
     * Constructor for objects of class AnalizadorAccesosAlServidor
     */
    public AnalizadorAccesosAlServidor()
    {
        accesosServ = new ArrayList<Acceso>();

    }

    /**
    Metodo que permite analizar el archivo pasado por parametro
     */
    public void analizarArchivoDeLog (String nombreArchivo)
    {
   
        File archivo = new File(nombreArchivo);
        try{          
            Scanner sc = new Scanner(archivo);
            while (sc.hasNextLine()) {
                String lineaLeida = sc.nextLine();
                System.out.println(lineaLeida);
                String[] elementosLinea = lineaLeida.split(" ");

                Acceso acesoNuevo = new Acceso( Integer.parseInt(elementosLinea[0]),  
                        Integer.parseInt(elementosLinea[1]),  
                        Integer.parseInt(elementosLinea[2]),  
                        Integer.parseInt(elementosLinea[3]),  
                        Integer.parseInt(elementosLinea[4]));
                accesosServ.add(acesoNuevo);
            }
            sc.close();
        }
        catch  (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error al leer el archivo");
        }

    }

    public int obtenerHoraMasAccesos ()
    {
        int  valorADevolver = -1;
        //Esta parte no estaba hecha

        return valorADevolver;
    }
}
