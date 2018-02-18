
package logica;

import hilos_recursos.Consumidor;
import hilos_recursos.GestorArray_Semaforo;
import hilos_recursos.Productor;
import hilos_recursos.Productor_Impar;
import hilos_recursos.Productor_Par;
import vistas.Clase10Control;

/**
 * Esta clase genera las instancias de los 3 hilos:
 * 2 productores {@link Productor} y 1 consumidor {@link Consumidor},
 * Estos 3 hilos se ejecutan de manera concurrente gestionados por semáforos,
 * Tienen un recurso común al cual acceden {@link GestorArray_Semaforo} y todos reciben como
 * parámetro la instancia gas,
 * Y el Consumidor gestiona la interface de la aplicación recibiendo como parámetro
 * la instancia de la clase {@link Clase10Control},
 * Los Productores reciben además una instancia de Consumidor para poder finalizar cuando este 
 * finalice su ejecución.
 * 
 * @author José Francisco Sánchez Portillo
 */
public class Principal {
    // Variable para guardar los elementos de la interface:
    Clase10Control clase10Control;
    // Se crea una instancia del manejador de errores para los Thread:
    ManejadorExcepciones manejador = new ManejadorExcepciones();
    
    /**
     * Constructor que genera los hilos de ejecución del programa.
     * 
     * @param clase10Control Recibe como parámetro la clase {@link Clase10Control} que contiene todos los elementos de la interface {@link vistas.Vista10Control}
     */
    public Principal(Clase10Control clase10Control) {
        
        // Se inicia la variable con todos los elemntos gráficos:
        this.clase10Control = clase10Control;
        // Se crea una instancia de la clase que gestiona el Array por medio de Semáforos:
        GestorArray_Semaforo gas = new GestorArray_Semaforo(clase10Control);
        
        // Consumidor:
        Consumidor consumidor = new Consumidor(gas, clase10Control);
        consumidor.setUncaughtExceptionHandler(manejador);
        consumidor.start();
        
        // Productores:
        Productor[] productor = new Productor[2];
        
        productor[0] = new Productor_Impar(1, gas, consumidor);
        productor[1] = new Productor_Par(2, gas, consumidor);
       
        for (int i=0; i<productor.length; i++) {
            productor[i].setUncaughtExceptionHandler(manejador);
            productor[i].start();
        }
    }
    
    
    
}
