

package logica;


/**
 * Esta clase maneja las excepciones que puedan ser provocadas por la ejecución de los hilos
 * 
 * @author IMCG
 */
//manejador de excepciones para toda la aplicación
public class ManejadorExcepciones implements Thread.UncaughtExceptionHandler {
    //implementa el método uncaughtException()
    @Override
    public void uncaughtException(Thread t, Throwable e){
        System.out.printf("Thread que lanzó la excepción: %s \n", t.getName());
        //muestra en consola el hilo que produce la exceción
        e.printStackTrace();
        //muestra en consola la pila de llamadas
        
    }
}
