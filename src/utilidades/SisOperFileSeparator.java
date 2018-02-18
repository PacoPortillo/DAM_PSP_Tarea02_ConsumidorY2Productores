
package utilidades;

import java.io.File;

/**
 * Esta clase aporta la utilidad de formatear las rutas a los archivos
 * en función del Sistema Operativo en el que la aplicación sea ejecutada.
 * 
 * @author José Francisco Sánchez Portillo
 */
public class SisOperFileSeparator {
      /**
     * Método estático que devuelve la ruta formateada si el Sistema Operativo
     * es Windows, si no lo es devuelve la ruta tal cual.
     * @param ruta Ruta al archivo exterior al proyecto.
     * @return la Ruta formateada en caso de que la ejecución se realice desde
     * Windows
     */
    public static String rutaSisOper(String ruta){
        String separador;
        
        try {
            if(File.separator.equals("\\")){
                separador = "\\"; // Es Windows
                return ruta.replace("/", separador);
            } else {
                // Es Linux
                return ruta;
            }
        } catch (Exception e) {
            System.err.println("Error de conversión de ruta. Descripción: " + e.toString());
            return ruta;
        }
    }  
}
