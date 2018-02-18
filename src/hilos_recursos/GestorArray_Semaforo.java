
package hilos_recursos;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.concurrent.Semaphore;
import javax.swing.JLabel;
import vistas.Clase10Control;

/**
 * Esta clase gestiona el Array en el cual tienen que escribir los Productores y
 * leer y borrar los consumidores.
 * 
 * @author José Francisco Sánchez Portillo
 */
public class GestorArray_Semaforo {
    
    // Número de espacios en el buffer (Array):
    // Se establece un número constante de 10.
    private final int TAM = 10;
    // Array que servirà para producir y consumir (buffer):
    private int[] buffer = new int[TAM];
    // Posiciones dentro del Array buffer para meter o sacar Valores:
    private int setvalor = 0, getvalor = 0;
    
    // Creación de Semáforos:
    private Semaphore mutex = new Semaphore(1, true);
    private Semaphore valores = new Semaphore(0, true);
    private Semaphore espacios = new Semaphore(TAM, true);
    
    // Controles:
    private int cont_espacios = TAM;
    private int cont_valores = 0;
    
    // Instancia para crear números aleatorios:
    private Random random = new Random();
    
    // Variable para contener los objetos de la interface gráfica:
    private Clase10Control clase10Control;
    
    // Variables para contener los elemntos de Clase10Control
    private JLabel[] jLabel_Espac = new JLabel[10];
    private JLabel[] jLabel_Valor = new JLabel[10];
    private JLabel[] jLabel_Prod = new JLabel[10];
    private JLabel[] jLabel_Cons = new JLabel[10];
    
    private JLabel[] jLabel_CampoMensaje = new JLabel[2];

    /**
     * Cosntructor
     * @param clase10Control Recibe como parámetro la clase {@link Clase10Control} que contiene todos los elementos de la interface {@link vistas.Vista10Control}
     */
    public GestorArray_Semaforo(Clase10Control clase10Control) {
        this.clase10Control = clase10Control;
        
        this.jLabel_Espac = clase10Control.getjLabel_Espac();
        this.jLabel_Valor = clase10Control.getjLabel_Valor();
        this.jLabel_Prod = clase10Control.getjLabel_Prod();
        this.jLabel_Cons = clase10Control.getjLabel_Cons();
        
        this.jLabel_CampoMensaje = clase10Control.getjLabel_CampoMensaje();
    }
    
    


    // Sólo acceden los Productores
    /**
     * Método para almacenar números enteros en el Array, Sólo es usado por los productores {@link Productor}
     * Sólo pueden acceder si no hay nadie más usando el recurso.
     * 
     * @param id Identificador del Productor
     * @param valor Número entero que ha sido creado por Productor y que se va a almacenar en una posición del Array
     * @throws InterruptedException Errores con al gestión de los semáforos
     */
    public void set_Valor(int id, int valor) throws InterruptedException{
        if (cont_espacios<1){ // Si no hay espacios libres:
            //***********************************************
            this.jLabel_CampoMensaje[1].setText("Hilo Productor " + id + ". El Array está lleno.");
            this.wait();
            //**********************************
            System.out.println(" Hilo Productor " + id + ". El Array está lleno.**************************");
        } else { // Si hay espacios libres:
            this.jLabel_CampoMensaje[1].setText("");
            // Si el número de espacios libres es mayor o igual que 5, si es menor se facilita la entrada al Consumidor
            if (cont_espacios>=5){ 
                espacios.acquire(); // Compruevo si hay espacios
                mutex.acquire(); // Si hay espacios realizo un mutex
                buffer[setvalor] = valor;
                //********************** Valores para la interface gráfica:
                this.jLabel_Espac[setvalor].setBackground(Color.YELLOW);
                if (valor<10)this.jLabel_Valor[setvalor].setText("  "+valor);
                else this.jLabel_Valor[setvalor].setText(" "+valor);
                if (id==1) this.jLabel_Prod[setvalor].setBackground(Color.GREEN);
                else this.jLabel_Prod[setvalor].setBackground(Color.CYAN);
                this.jLabel_Cons[setvalor].setText(" ");
                this.jLabel_Cons[setvalor].setBackground(Color.WHITE);
                //********************* Fin  Valores para la interface gráfica
                System.out.println(" Hilo Productor " + id + ". Introduce el valor: " + valor + ", en la posición: " + (setvalor+1));
                /* Sube una posición en el array de forma que cuando llegue al último elemento 
                *  vuelve a empezar en la posición cero del array: */
                setvalor = (setvalor + 1) % TAM;
                try {
                    // Simular el tiempo que tarda,
                    // entre 0.5 y 1 segundos:
                    sleep(random.nextInt(1000) + 500);
                } catch (InterruptedException ex) {
                    System.out.println("Error. Descripción: " + ex.toString());
                }
                mutex.release();
                cont_valores++;
                cont_espacios--;
                valores.release();
            }// Fin de Si el número de espacios libres es mayor o igual que 5, si es menor se facilita la entrada al Consumidor
        }//***
    }
    
    // Solo accede el consumidor
    /**
     * Método para recuperar números enteros en el Array, Solo es usado por el consumidor {@link Consumidor}
     * Sólo puede acceder si no hay nadie más usando el recurso.
     * 
     * @return El valor leido y consumido del Array
     * @throws InterruptedException Errores con al gestión de los semáforos
     */
    public int get_Valor() throws InterruptedException {
        if (cont_valores<1){
            //***********************************************
            this.jLabel_CampoMensaje[1].setText("Hilo Consumidor. El Array está vacío.");
            //**********************************
            System.out.println(" Hilo Consumidor. El Array está vacío.**************************");
        } else {
            this.jLabel_CampoMensaje[1].setText("");
        }
        valores.acquire(); // Compruebo si hay valores
        mutex.acquire(); // Si hay valores realizo un mutex
        int aux = getvalor;
        /* Sube una posición en el array de forma que cuando llegue al último elemento 
        *  vueleve a empezar en la posición cero del array: */
        getvalor = (getvalor + 1) % TAM;
        //********************** Valores para la interface gráfica:
        this.jLabel_Espac[aux].setBackground(Color.WHITE);
        this.jLabel_Cons[aux].setText(this.jLabel_Valor[aux].getText().toString());
        this.jLabel_Valor[aux].setText(" ");
        this.jLabel_Prod[aux].setBackground(Color.WHITE);
        this.jLabel_Cons[aux].setBackground(Color.ORANGE);
        //********************** Fin Valores para la interface gráfica
        System.out.println(" Hilo Consumidor. Saca el valor: " + buffer[aux] + ", de la posición: " + (aux+1));
        try {
            // Simular el tiempo que tarda,
            // entre 0.5 y 1 segundos:
            sleep(random.nextInt(1000) + 500);
        } catch (InterruptedException ex) {
            System.out.println("Error. Descripción: " + ex.toString());
        }
        mutex.release();
        cont_valores--;
        cont_espacios++;
        espacios.release(); // Libero un ticket de que hayEspacio
        return buffer[aux]; // Devuelvo el dato al Consumidor
    }
    
    
}
