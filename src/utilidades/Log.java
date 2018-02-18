
package utilidades;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;


/**
 * Esta clase aporta la utilidad de que un vez instanciada en el programa
 * toda la salida estandar del mismo se realiza en un archivo.
 * Se aconseja crear la instancia de este clase en el método Main para que 
 * se reedirija la salida del programa desde el principio.
 * 
 * @author José Francisco Sánchez Portillo
 */
public class Log {

    public Log() {
        // Se redirige la salida estandar a un archivo:
        // SisOperFileSeparator.rutaSisOper("log.txt"): sirve para que las rutas sean válidas en diferentes SO
        try {
            PrintStream ps = new PrintStream(
                                    new BufferedOutputStream(new FileOutputStream( 
                                                            new File(SisOperFileSeparator.rutaSisOper("log.txt"))
                                                                            , false)
                                                            )
                                      , true);
            System.setOut(ps);
            System.setErr(ps);
        } catch (Exception e) {
            System.err.println("Ha sucedido un error: Error de log. Descripción: " + e.toString());
        }
        
    }
       
    
}
