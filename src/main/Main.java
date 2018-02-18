
package main;

import hilos_recursos.Consumidor;
import hilos_recursos.GestorArray_Semaforo;
import hilos_recursos.Productor;
import utilidades.Log;
import vistas.Vista10Control;

/**
 * Programa 1 de la tarea 02 de PSP de DAM, se crean 3 hilos (2 productores y 1 consumidor),
 * Los hilos productores almacenan valores en un array de 10 números enteros, El hilo consumidor
 * sacará del array estos valores de uno en uno y los sumará cuando llegue al valor preestablecido
 * se detendrá la ejecución de los hilos, Un productor producirá número pares y el otro números pares.
 * 
 * El programa ejecuta los hilos de forma concurrente mediante semáforos.
 * 
 * Paquete: {@link vistas} contiene todas las interfaces gráficas y sus clases relacionadas con la interface.
 * Paquete: {@link utilidades} contiene todas las clases que aportan utilidad a la ejecución del programa.
 * Paquete: {@link logica} contiene todas las clases que tiene la estructura principal del programa.
 * Paquete: {@link hilos_recursos} contiene todas las clases realcionadas con los hilos ({@link Productor} y {@link Consumidor})
 * y con el recurso pasivo que comparten {@link GestorArray_Semaforo}.
 * Paquete: images contiene todas las imágenes del programa.
 * 
 * 
 * @author José Francisco Sánchez Portillo
 */
public class Main {

    /**
     * @param args No contempla argumentos
     */
    public static void main(String[] args) {
        /**
         * Clase que crea el archivo log.txt 
         * Esta clase reedirige la salida estandar del programa al archivo log.txt
         */
        // Atemción: Se puede comentar la siguiente línea para ver la salida en la consola de NetBeans:
        Log log = new Log();
        
        /**
         * Clase que crea la interface gráfica del programa y el arranque del mismo:
         */
        Vista10Control vista10Control = new Vista10Control();
    }
    
}
