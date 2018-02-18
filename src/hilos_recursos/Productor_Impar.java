
package hilos_recursos;


/**
 * Clase que contiene al Productor que genera números Impares y que hereda de {@link Productor}
 * 
 * @author José Francisco Sánchez Portillo
 */
public class Productor_Impar extends Productor {
    /**
     * El método constructor llama por defecto al constructor padre
     * @param id Identeificador del Productor
     * @param gas Instacia de {@link GestorArray_Semaforo}
     * @param consumidor Instacia de {@link Consumidor}
     */
    public Productor_Impar(int id, GestorArray_Semaforo gas, Consumidor consumidor) {
        super(id, gas, consumidor);
    }

    /**
     * Es identica al método de la clase padre sólo que este genera un número impar
     * @return El valor numero impar
     */
    @Override
    public int generarValor() {
        int valor;
        do {    
            // Realizo una llamada a generarValor() de la clase padre:
            valor = super.generarValor(); //To change body of generated methods, choose Tools | Templates.
        } while (valor % 2 == 0); //Repito hasta que sea un número impar 
        return  valor;
    }
}
