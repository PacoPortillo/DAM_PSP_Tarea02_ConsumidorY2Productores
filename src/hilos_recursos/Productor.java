
package hilos_recursos;

import java.util.Random;


/**
 * Clase que contiene el Hilo Productor
 * 
 * @author José Francisco Sánchez Portillo
 */
public class Productor extends Thread {
    
    private Random random = new Random();
    private int id;
    private GestorArray_Semaforo gas;
    private Consumidor consumidor;


    public Productor(int id, GestorArray_Semaforo gas, Consumidor consumidor) {
        this.id = id;
        this.gas = gas;
        this.consumidor = consumidor;
    }

    /**
     * Establece una ejecución constante mientras el Hilo Consumidor se esté ejecutando
     */
    @Override
    public void run() {
        do {
            // Generar el valor:
            int valor = generarValor();
            //System.out.println("Iteración: " + ". Productor " + id + " ha producido: " + valor);
            try {
                // Introducir el valor:
                gas.set_Valor(id, valor);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
                System.err.println("Ha ocurrido un error. Descripción: " + ex.toString());
            }
        } while (consumidor.isAlive()); // Se ejecuta mientras el Hilo Hilo Consumidor se está ejecutando
    }
    
    /**
     * Genera el valor para insertar en el Array
     * @return El valor producido para insertar en el Array
     */
    public int generarValor(){
        int valor = random.nextInt(100);
        return valor;
    }
}
