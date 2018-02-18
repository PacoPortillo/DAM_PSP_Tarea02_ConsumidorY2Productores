
package vistas;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Esta clase contiene todos los elementos de la Interface Gráfica para que
 * puedan ser manejados desde las otras clases del programa.
 * 
 * @author José Francisco Sánchez Portillo
 */
public class Clase10Control {
    // Se crean los arrays de elementos y los elementos:
    private JLabel[] jLabel_Espac = new JLabel[10];
    private JLabel[] jLabel_Valor = new JLabel[10];
    private JLabel[] jLabel_Prod = new JLabel[10];
    private JLabel[] jLabel_Cons = new JLabel[10];
    private JButton jButton_Log;
    private JLabel[] jLabel_CampoMensaje = new JLabel[2];
    private JLabel jLabel_ValorAcumulado;
    private JTextField jTextField_ValorMax;
    /**
     * 
     * @param jLabel_Espac01 Elemento de la consola de Array
     * @param jLabel_Espac02 Elemento de la consola de Array
     * @param jLabel_Espac03 Elemento de la consola de Array
     * @param jLabel_Espac04 Elemento de la consola de Array
     * @param jLabel_Espac05 Elemento de la consola de Array
     * @param jLabel_Espac06 Elemento de la consola de Array
     * @param jLabel_Espac07 Elemento de la consola de Array
     * @param jLabel_Espac08 Elemento de la consola de Array
     * @param jLabel_Espac09 Elemento de la consola de Array
     * @param jLabel_Espac10 Elemento de la consola de Array
     * @param jLabel_Valor01 Elemento de la consola de Array
     * @param jLabel_Valor02 Elemento de la consola de Array
     * @param jLabel_Valor03 Elemento de la consola de Array
     * @param jLabel_Valor04 Elemento de la consola de Array
     * @param jLabel_Valor05 Elemento de la consola de Array
     * @param jLabel_Valor06 Elemento de la consola de Array
     * @param jLabel_Valor07 Elemento de la consola de Array
     * @param jLabel_Valor08 Elemento de la consola de Array
     * @param jLabel_Valor09 Elemento de la consola de Array
     * @param jLabel_Valor10 Elemento de la consola de Array
     * @param jLabel_Prod01 Elemento de la consola de Array
     * @param jLabel_Prod02 Elemento de la consola de Array
     * @param jLabel_Prod03 Elemento de la consola de Array
     * @param jLabel_Prod04 Elemento de la consola de Array
     * @param jLabel_Prod05 Elemento de la consola de Array
     * @param jLabel_Prod06 Elemento de la consola de Array
     * @param jLabel_Prod07 Elemento de la consola de Array
     * @param jLabel_Prod08 Elemento de la consola de Array
     * @param jLabel_Prod09 Elemento de la consola de Array
     * @param jLabel_Prod10 Elemento de la consola de Array
     * @param jLabel_Cons01 Elemento de la consola de Array
     * @param jLabel_Cons02 Elemento de la consola de Array
     * @param jLabel_Cons03 Elemento de la consola de Array
     * @param jLabel_Cons04 Elemento de la consola de Array
     * @param jLabel_Cons05 Elemento de la consola de Array
     * @param jLabel_Cons06 Elemento de la consola de Array
     * @param jLabel_Cons07 Elemento de la consola de Array
     * @param jLabel_Cons08 Elemento de la consola de Array
     * @param jLabel_Cons09 Elemento de la consola de Array
     * @param jLabel_Cons10 Elemento de la consola de Array
     * @param jButton_Log Elemento de la consola de Array
     * @param jLabel_CampoMensaje01 Elemento de la consola para el texto
     * @param jLabel_CampoMensaje02 Elemento de la consola para el texto
     * @param jLabel_ValorAcumulado Elemento de la consola para el valor que va acumulando
     * @param jTextField_ValorMax  Elemento de la consola para el valor máximo
     */
    public Clase10Control(JLabel jLabel_Espac01, JLabel jLabel_Espac02, JLabel jLabel_Espac03, JLabel jLabel_Espac04, JLabel jLabel_Espac05, JLabel jLabel_Espac06, JLabel jLabel_Espac07, JLabel jLabel_Espac08, JLabel jLabel_Espac09, JLabel jLabel_Espac10,
                          JLabel jLabel_Valor01, JLabel jLabel_Valor02, JLabel jLabel_Valor03, JLabel jLabel_Valor04, JLabel jLabel_Valor05, JLabel jLabel_Valor06, JLabel jLabel_Valor07, JLabel jLabel_Valor08, JLabel jLabel_Valor09, JLabel jLabel_Valor10,
                          JLabel jLabel_Prod01, JLabel jLabel_Prod02, JLabel jLabel_Prod03, JLabel jLabel_Prod04, JLabel jLabel_Prod05, JLabel jLabel_Prod06, JLabel jLabel_Prod07, JLabel jLabel_Prod08, JLabel jLabel_Prod09, JLabel jLabel_Prod10,
                          JLabel jLabel_Cons01, JLabel jLabel_Cons02, JLabel jLabel_Cons03, JLabel jLabel_Cons04, JLabel jLabel_Cons05, JLabel jLabel_Cons06, JLabel jLabel_Cons07, JLabel jLabel_Cons08, JLabel jLabel_Cons09, JLabel jLabel_Cons10,
                          JButton jButton_Log,
                          JLabel jLabel_CampoMensaje01, JLabel jLabel_CampoMensaje02,
                          JLabel jLabel_ValorAcumulado,
                          JTextField jTextField_ValorMax) {
        
        // Se asignan los valores a las variables:
        this.jLabel_Espac[0] = jLabel_Espac01;
        this.jLabel_Espac[1] = jLabel_Espac02;
        this.jLabel_Espac[2] = jLabel_Espac03;
        this.jLabel_Espac[3] = jLabel_Espac04;
        this.jLabel_Espac[4] = jLabel_Espac05;
        this.jLabel_Espac[5] = jLabel_Espac06;
        this.jLabel_Espac[6] = jLabel_Espac07;
        this.jLabel_Espac[7] = jLabel_Espac08;
        this.jLabel_Espac[8] = jLabel_Espac09;
        this.jLabel_Espac[9] = jLabel_Espac10;
        
        this.jLabel_Valor[0] = jLabel_Valor01;
        this.jLabel_Valor[1] = jLabel_Valor02;
        this.jLabel_Valor[2] = jLabel_Valor03;
        this.jLabel_Valor[3] = jLabel_Valor04;
        this.jLabel_Valor[4] = jLabel_Valor05;
        this.jLabel_Valor[5] = jLabel_Valor06;
        this.jLabel_Valor[6] = jLabel_Valor07;
        this.jLabel_Valor[7] = jLabel_Valor08;
        this.jLabel_Valor[8] = jLabel_Valor09;
        this.jLabel_Valor[9] = jLabel_Valor10;
        
        this.jLabel_Prod[0] = jLabel_Prod01;
        this.jLabel_Prod[1] = jLabel_Prod02;
        this.jLabel_Prod[2] = jLabel_Prod03;
        this.jLabel_Prod[3] = jLabel_Prod04;
        this.jLabel_Prod[4] = jLabel_Prod05;
        this.jLabel_Prod[5] = jLabel_Prod06;
        this.jLabel_Prod[6] = jLabel_Prod07;
        this.jLabel_Prod[7] = jLabel_Prod08;
        this.jLabel_Prod[8] = jLabel_Prod09;
        this.jLabel_Prod[9] = jLabel_Prod10;
        
        this.jLabel_Cons[0] = jLabel_Cons01;
        this.jLabel_Cons[1] = jLabel_Cons02;
        this.jLabel_Cons[2] = jLabel_Cons03;
        this.jLabel_Cons[3] = jLabel_Cons04;
        this.jLabel_Cons[4] = jLabel_Cons05;
        this.jLabel_Cons[5] = jLabel_Cons06;
        this.jLabel_Cons[6] = jLabel_Cons07;
        this.jLabel_Cons[7] = jLabel_Cons08;
        this.jLabel_Cons[8] = jLabel_Cons09;
        this.jLabel_Cons[9] = jLabel_Cons10;
        
        this.jButton_Log = jButton_Log;
        
        this.jLabel_CampoMensaje[0] = jLabel_CampoMensaje01;
        this.jLabel_CampoMensaje[1] = jLabel_CampoMensaje02;
        
        this.jLabel_ValorAcumulado = jLabel_ValorAcumulado;
        
        this.jTextField_ValorMax = jTextField_ValorMax;
    }

    
    // Getters: Se establecen los Getters para que puedan ser llamados desde el programa
    public JLabel[] getjLabel_Espac() {
        return jLabel_Espac;
    }

    public JLabel[] getjLabel_Valor() {
        return jLabel_Valor;
    }

    public JLabel[] getjLabel_Prod() {
        return jLabel_Prod;
    }

    public JLabel[] getjLabel_Cons() {
        return jLabel_Cons;
    }

    public JButton getjButton_Log() {
        return jButton_Log;
    }
    

    public JLabel[] getjLabel_CampoMensaje() {    
        return jLabel_CampoMensaje;
    }

    public JLabel getjLabel_ValorAcumulado() {
        return jLabel_ValorAcumulado;
    }
    
    
    public JTextField getjTextField_ValorMax() {
        return jTextField_ValorMax;
    }
    
}
