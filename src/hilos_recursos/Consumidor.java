
package hilos_recursos;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import vistas.Clase10Control;

/**
 * Clase que contiene el Hilo Consumidor
 * 
 * @author José Francisco Sánchez Portillo
 */
public class Consumidor extends Thread {
    
    private GestorArray_Semaforo gas;
    private int iter;
    
    private int sumaValores = 0;
    
    // Se inicia la variable con todos los elementos gráficos:
    private Clase10Control clase10Control;
    // Elementos gráficos:
    private JTextField jTextField_ValorMax;
    private JLabel[] jLabel_CampoMensaje = new JLabel[2];
    private JLabel jLabel_ValorAcumulado;
    private JButton jButton_Log;
    
    /**
     * 
     * @param gas Recibe la instancia de {@link GestorArray_Semaforo}
     * @param clase10Control Recibe la instancia de {@link Clase10Control}
     */
    public Consumidor(GestorArray_Semaforo gas, Clase10Control clase10Control) {
        this.clase10Control = clase10Control;
        this.gas = gas;
        
        this.jTextField_ValorMax = clase10Control.getjTextField_ValorMax();
        this.jLabel_CampoMensaje = clase10Control.getjLabel_CampoMensaje();
        this.jLabel_ValorAcumulado = clase10Control.getjLabel_ValorAcumulado();
        // Valor que se introduce en la interface con el valor máximo que debe ir sumando el consumidor:
        this.iter = Integer.parseInt(this.jTextField_ValorMax.getText());
        System.out.println();
        System.out.println("\n ******************************************************* \n");
        System.out.println("\n El valor máximo es: " + iter + "\n");
        System.out.println("\n ******************************************************* \n");
        System.out.println("\n Comienza la ejecución: \n");
        System.out.println("\n ******************************************************* \n");
        System.out.println();
        // Botón para 
        this.jButton_Log = clase10Control.getjButton_Log();
        
    }

    /**
     * Establece una ejecución constante mientras la suma de valores consumidos sea menor al
     * número introducido en la interface gráfica.
     */
    @Override
    public void run() {
         do {
            try {
                // Llamada al método para consumir:
                int valor = gas.get_Valor();
                //System.out.println("Consumidor ha consumido: " + valor);
                sumaValores = sumaValores + valor;
                //**********************************
                this.jLabel_ValorAcumulado.setText(""+sumaValores);
                //**********************************
            } catch (InterruptedException ex) {
                ex.printStackTrace();
                System.err.println("Ha ocurrido un error. Descripción: " + ex.toString());
            }
        } while (iter > sumaValores); // Se ejecuta mientra se va sumando hasta que supere la cantidad especificada
         
        // Código para la finalización del Hilo
        //***********************************
        this.jLabel_CampoMensaje[0].setText("Hilo Consumidor ha superado su valor máximo " + iter + ", haciendo un total de: " + sumaValores);
        //***********************************
        System.out.println();
        System.out.println("\n\n ********** Hilo Consumidor ha superado su valor máximo " + iter + ", haciendo un total de: " + sumaValores + " ********** \n\n");
        System.out.println();
        // Botón que se activa y que permite ver el Archivo Log
        this.jButton_Log.setEnabled(true);
    }
    
    
    
}
