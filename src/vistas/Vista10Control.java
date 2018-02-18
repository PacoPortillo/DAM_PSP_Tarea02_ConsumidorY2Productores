
package vistas;

import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import javax.swing.JFrame;
import logica.Principal;
import utilidades.SisOperFileSeparator;

/**
 * Esta clase contiene la interface gráfica de la aplicación
 * Hereda de {@link Vista00Generica}
 * Contiene todos los elementos gráficos del programa y los botones
 * que ejecutan el programa,
 * También crea los mecanismos de control e introducción de datos.
 * 
 * @author José Francisco Sánchez Portillo
 */
public class Vista10Control extends Vista00Generica {

    /**
     * Constructor: realiza una llamada al constructor de la clase padre {@link Vista00Generica}
     */
    public Vista10Control() {
        //realiza una llamada al constructor de la clase padre Vista00Generica y le pasa como parámetro el título y el icono
        super("1 Consumidor y 2 Productores", "icono.png");
        initComponents();
        
        // Configuración inicial:
        // Botones:
        this.jButtonReiniciar.setEnabled(false);
        this.jButton_Log.setEnabled(false);
        
        // Introducción de datos:
        this.jTextField_ValorMax.requestFocus();
        this.jTextField_ValorMax.selectAll();
        
        // Codigos de colores:
        this.jLabel_Cod01.setOpaque(true);
        this.jLabel_Cod01.setBackground(Color.YELLOW);
        this.jLabel_Cod01.setText(" ");
        this.jLabel_Cod02.setOpaque(true);
        this.jLabel_Cod02.setBackground(Color.WHITE);
        this.jLabel_Cod02.setText(" ");
        this.jLabel_Cod03.setOpaque(true);
        this.jLabel_Cod03.setBackground(Color.GREEN);
        this.jLabel_Cod03.setText(" ");
        this.jLabel_Cod04.setOpaque(true);
        this.jLabel_Cod04.setBackground(Color.CYAN);
        this.jLabel_Cod04.setText(" ");
        this.jLabel_Cod05.setOpaque(true);
        this.jLabel_Cod05.setBackground(Color.ORANGE);
        this.jLabel_Cod05.setText(" ");
        
        // Casillas Espacios del Array:
        this.jLabel_Espac01.setOpaque(true);
        this.jLabel_Espac01.setBackground(Color.WHITE);
        this.jLabel_Espac02.setOpaque(true);
        this.jLabel_Espac02.setBackground(Color.WHITE);
        this.jLabel_Espac03.setOpaque(true);
        this.jLabel_Espac03.setBackground(Color.WHITE);
        this.jLabel_Espac04.setOpaque(true);
        this.jLabel_Espac04.setBackground(Color.WHITE);
        this.jLabel_Espac05.setOpaque(true);
        this.jLabel_Espac05.setBackground(Color.WHITE);
        this.jLabel_Espac06.setOpaque(true);
        this.jLabel_Espac06.setBackground(Color.WHITE);
        this.jLabel_Espac07.setOpaque(true);
        this.jLabel_Espac07.setBackground(Color.WHITE);
        this.jLabel_Espac08.setOpaque(true);
        this.jLabel_Espac08.setBackground(Color.WHITE);
        this.jLabel_Espac09.setOpaque(true);
        this.jLabel_Espac09.setBackground(Color.WHITE);
        this.jLabel_Espac10.setOpaque(true);
        this.jLabel_Espac10.setBackground(Color.WHITE);
        
        // Casillas de los valores:
        this.jLabel_Valor01.setOpaque(true);
        this.jLabel_Valor01.setBackground(Color.WHITE);
        this.jLabel_Valor01.setText(" ");
        this.jLabel_Valor02.setOpaque(true);
        this.jLabel_Valor02.setBackground(Color.WHITE);
        this.jLabel_Valor02.setText(" ");
        this.jLabel_Valor03.setOpaque(true);
        this.jLabel_Valor03.setBackground(Color.WHITE);
        this.jLabel_Valor03.setText(" ");
        this.jLabel_Valor04.setOpaque(true);
        this.jLabel_Valor04.setBackground(Color.WHITE);
        this.jLabel_Valor04.setText(" ");
        this.jLabel_Valor05.setOpaque(true);
        this.jLabel_Valor05.setBackground(Color.WHITE);
        this.jLabel_Valor05.setText(" ");
        this.jLabel_Valor06.setOpaque(true);
        this.jLabel_Valor06.setBackground(Color.WHITE);
        this.jLabel_Valor06.setText(" ");
        this.jLabel_Valor07.setOpaque(true);
        this.jLabel_Valor07.setBackground(Color.WHITE);
        this.jLabel_Valor07.setText(" ");
        this.jLabel_Valor08.setOpaque(true);
        this.jLabel_Valor08.setBackground(Color.WHITE);
        this.jLabel_Valor08.setText(" ");
        this.jLabel_Valor09.setOpaque(true);
        this.jLabel_Valor09.setBackground(Color.WHITE);
        this.jLabel_Valor09.setText(" ");
        this.jLabel_Valor10.setOpaque(true);
        this.jLabel_Valor10.setBackground(Color.WHITE);
        this.jLabel_Valor10.setText(" ");
        
        // Casillas de los Productores:
        this.jLabel_Prod01.setOpaque(true);
        this.jLabel_Prod01.setBackground(Color.WHITE);
        this.jLabel_Prod01.setText(" ");
        this.jLabel_Prod02.setOpaque(true);
        this.jLabel_Prod02.setBackground(Color.WHITE);
        this.jLabel_Prod02.setText(" ");
        this.jLabel_Prod03.setOpaque(true);
        this.jLabel_Prod03.setBackground(Color.WHITE);
        this.jLabel_Prod03.setText(" ");
        this.jLabel_Prod04.setOpaque(true);
        this.jLabel_Prod04.setBackground(Color.WHITE);
        this.jLabel_Prod04.setText(" ");
        this.jLabel_Prod05.setOpaque(true);
        this.jLabel_Prod05.setBackground(Color.WHITE);
        this.jLabel_Prod05.setText(" ");
        this.jLabel_Prod06.setOpaque(true);
        this.jLabel_Prod06.setBackground(Color.WHITE);
        this.jLabel_Prod06.setText(" ");
        this.jLabel_Prod07.setOpaque(true);
        this.jLabel_Prod07.setBackground(Color.WHITE);
        this.jLabel_Prod07.setText(" ");
        this.jLabel_Prod08.setOpaque(true);
        this.jLabel_Prod08.setBackground(Color.WHITE);
        this.jLabel_Prod08.setText(" ");
        this.jLabel_Prod09.setOpaque(true);
        this.jLabel_Prod09.setBackground(Color.WHITE);
        this.jLabel_Prod09.setText(" ");
        this.jLabel_Prod10.setOpaque(true);
        this.jLabel_Prod10.setBackground(Color.WHITE);
        this.jLabel_Prod10.setText(" ");
        
        // Casillas del Cosumidor:
        this.jLabel_Cons01.setOpaque(true);
        this.jLabel_Cons01.setBackground(Color.WHITE);
        this.jLabel_Cons01.setText(" ");
        this.jLabel_Cons02.setOpaque(true);
        this.jLabel_Cons02.setBackground(Color.WHITE);
        this.jLabel_Cons02.setText(" ");
        this.jLabel_Cons03.setOpaque(true);
        this.jLabel_Cons03.setBackground(Color.WHITE);
        this.jLabel_Cons03.setText(" ");
        this.jLabel_Cons04.setOpaque(true);
        this.jLabel_Cons04.setBackground(Color.WHITE);
        this.jLabel_Cons04.setText(" ");
        this.jLabel_Cons05.setOpaque(true);
        this.jLabel_Cons05.setBackground(Color.WHITE);
        this.jLabel_Cons05.setText(" ");
        this.jLabel_Cons06.setOpaque(true);
        this.jLabel_Cons06.setBackground(Color.WHITE);
        this.jLabel_Cons06.setText(" ");
        this.jLabel_Cons07.setOpaque(true);
        this.jLabel_Cons07.setBackground(Color.WHITE);
        this.jLabel_Cons07.setText(" ");
        this.jLabel_Cons08.setOpaque(true);
        this.jLabel_Cons08.setBackground(Color.WHITE);
        this.jLabel_Cons08.setText(" ");
        this.jLabel_Cons09.setOpaque(true);
        this.jLabel_Cons09.setBackground(Color.WHITE);
        this.jLabel_Cons09.setText(" ");
        this.jLabel_Cons10.setOpaque(true);
        this.jLabel_Cons10.setBackground(Color.WHITE);
        this.jLabel_Cons10.setText(" ");
        
        // Campos de Mensajes de la aplicación:
        this.jLabel_CampoMensaje01.setText("");
        this.jLabel_CampoMensaje02.setText("");
        
        // Paneles Informativos:
        this.jTextPane_01.setText(" Información:"
                + "\n Programa con dos hilos Productores y un hilo Consumidor."
                + "\n Los hilos productores almacenarán valores numéricos en un Array."
                + "\n El hilo Consumidor sacará los elementos del Array para ir sumándolos, cuando alcance el Valor máximo finalizarán la ejecución de los hilos."
                + "\n Un Productor genera números impares (Productor 1) y el otro números pares (Productor 2)."
                + "\n El Array almacena 10 números enteros de 0 a 99."
                + "\n Se creará un archivo Log con los registros de la ejecución.");
        this.jTextPane_02.setText(" Instrucciones:"
                + "\n Introduce el Valor máximo para la suma del Consumidor. Te recomiendo para empezar un valor entre 500 y 2000."
                + "\n Después pulsa en el botón Iniciar."
                + "\n Cuando finalice podrás consultar el Archivo de Log, para ello pulsa el botón.");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane_01 = new javax.swing.JTextPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel_CampoMensaje01 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel_Espac01 = new javax.swing.JLabel();
        jLabel_Valor01 = new javax.swing.JLabel();
        jLabel_Prod01 = new javax.swing.JLabel();
        jLabel_Cons01 = new javax.swing.JLabel();
        jLabel_Espac02 = new javax.swing.JLabel();
        jLabel_Valor02 = new javax.swing.JLabel();
        jLabel_Prod02 = new javax.swing.JLabel();
        jLabel_Cons02 = new javax.swing.JLabel();
        jLabel_Espac03 = new javax.swing.JLabel();
        jLabel_Valor03 = new javax.swing.JLabel();
        jLabel_Prod03 = new javax.swing.JLabel();
        jLabel_Cons03 = new javax.swing.JLabel();
        jLabel_Espac04 = new javax.swing.JLabel();
        jLabel_Valor04 = new javax.swing.JLabel();
        jLabel_Prod04 = new javax.swing.JLabel();
        jLabel_Cons04 = new javax.swing.JLabel();
        jLabel_Espac05 = new javax.swing.JLabel();
        jLabel_Valor05 = new javax.swing.JLabel();
        jLabel_Prod05 = new javax.swing.JLabel();
        jLabel_Cons05 = new javax.swing.JLabel();
        jLabel_Espac06 = new javax.swing.JLabel();
        jLabel_Valor06 = new javax.swing.JLabel();
        jLabel_Prod06 = new javax.swing.JLabel();
        jLabel_Cons06 = new javax.swing.JLabel();
        jLabel_Espac07 = new javax.swing.JLabel();
        jLabel_Valor07 = new javax.swing.JLabel();
        jLabel_Prod07 = new javax.swing.JLabel();
        jLabel_Cons07 = new javax.swing.JLabel();
        jLabel_Espac08 = new javax.swing.JLabel();
        jLabel_Valor08 = new javax.swing.JLabel();
        jLabel_Prod08 = new javax.swing.JLabel();
        jLabel_Cons08 = new javax.swing.JLabel();
        jLabel_Espac09 = new javax.swing.JLabel();
        jLabel_Valor09 = new javax.swing.JLabel();
        jLabel_Prod09 = new javax.swing.JLabel();
        jLabel_Cons09 = new javax.swing.JLabel();
        jLabel_Espac10 = new javax.swing.JLabel();
        jLabel_Valor10 = new javax.swing.JLabel();
        jLabel_Prod10 = new javax.swing.JLabel();
        jLabel_Cons10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel_Cod01 = new javax.swing.JLabel();
        jLabel_Cod02 = new javax.swing.JLabel();
        jLabel_Cod03 = new javax.swing.JLabel();
        jLabel_Cod05 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel_Cod04 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel_CampoMensaje02 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel_ValorAcumulado = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jTextField_ValorMax = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jButton_Iniciar = new javax.swing.JButton();
        jButton_Log = new javax.swing.JButton();
        jButtonReiniciar = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jButton_Salir = new javax.swing.JButton();
        jButton_Creditos = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane_02 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(946, 757));
        setMinimumSize(new java.awt.Dimension(946, 757));

        jScrollPane2.setViewportView(jTextPane_01);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel_CampoMensaje01.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_CampoMensaje01.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_CampoMensaje01.setText("Campo para el mensaje de final de ejecución");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_CampoMensaje01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_CampoMensaje01, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(" Un Consumidor y dos Productores "));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(" Array "));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Espacios:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Valores:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Productor:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Consumidor:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel_Espac01.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Espac01.setText("  1");
        jLabel_Espac01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Espac01.setFocusable(false);

        jLabel_Valor01.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Valor01.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_Valor01.setText(" 99");
        jLabel_Valor01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Valor01.setFocusable(false);

        jLabel_Prod01.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Prod01.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_Prod01.setText(" 99");
        jLabel_Prod01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Prod01.setFocusable(false);

        jLabel_Cons01.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Cons01.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_Cons01.setText(" 99");
        jLabel_Cons01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Cons01.setFocusable(false);

        jLabel_Espac02.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Espac02.setText("  2");
        jLabel_Espac02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Espac02.setFocusable(false);

        jLabel_Valor02.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Valor02.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_Valor02.setText(" 99");
        jLabel_Valor02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Valor02.setFocusable(false);

        jLabel_Prod02.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Prod02.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_Prod02.setText(" 99");
        jLabel_Prod02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Prod02.setFocusable(false);

        jLabel_Cons02.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Cons02.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_Cons02.setText(" 99");
        jLabel_Cons02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Cons02.setFocusable(false);

        jLabel_Espac03.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Espac03.setText("  3");
        jLabel_Espac03.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Espac03.setFocusable(false);

        jLabel_Valor03.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Valor03.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_Valor03.setText(" 99");
        jLabel_Valor03.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Valor03.setFocusable(false);

        jLabel_Prod03.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Prod03.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_Prod03.setText(" 99");
        jLabel_Prod03.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Prod03.setFocusable(false);

        jLabel_Cons03.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Cons03.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_Cons03.setText(" 99");
        jLabel_Cons03.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Cons03.setFocusable(false);

        jLabel_Espac04.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Espac04.setText("  4");
        jLabel_Espac04.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Espac04.setFocusable(false);

        jLabel_Valor04.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Valor04.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_Valor04.setText(" 99");
        jLabel_Valor04.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Valor04.setFocusable(false);

        jLabel_Prod04.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Prod04.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_Prod04.setText(" 99");
        jLabel_Prod04.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Prod04.setFocusable(false);

        jLabel_Cons04.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Cons04.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_Cons04.setText(" 99");
        jLabel_Cons04.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Cons04.setFocusable(false);

        jLabel_Espac05.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Espac05.setText("  5");
        jLabel_Espac05.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Espac05.setFocusable(false);

        jLabel_Valor05.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Valor05.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_Valor05.setText(" 99");
        jLabel_Valor05.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Valor05.setFocusable(false);

        jLabel_Prod05.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Prod05.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_Prod05.setText(" 99");
        jLabel_Prod05.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Prod05.setFocusable(false);

        jLabel_Cons05.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Cons05.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_Cons05.setText(" 99");
        jLabel_Cons05.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Cons05.setFocusable(false);

        jLabel_Espac06.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Espac06.setText("  6");
        jLabel_Espac06.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Espac06.setFocusable(false);

        jLabel_Valor06.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Valor06.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_Valor06.setText(" 99");
        jLabel_Valor06.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Valor06.setFocusable(false);

        jLabel_Prod06.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Prod06.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_Prod06.setText(" 99");
        jLabel_Prod06.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Prod06.setFocusable(false);

        jLabel_Cons06.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Cons06.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_Cons06.setText(" 99");
        jLabel_Cons06.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Cons06.setFocusable(false);

        jLabel_Espac07.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Espac07.setText("  7");
        jLabel_Espac07.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Espac07.setFocusable(false);

        jLabel_Valor07.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Valor07.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_Valor07.setText(" 99");
        jLabel_Valor07.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Valor07.setFocusable(false);

        jLabel_Prod07.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Prod07.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_Prod07.setText(" 99");
        jLabel_Prod07.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Prod07.setFocusable(false);

        jLabel_Cons07.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Cons07.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_Cons07.setText(" 99");
        jLabel_Cons07.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Cons07.setFocusable(false);

        jLabel_Espac08.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Espac08.setText("  8");
        jLabel_Espac08.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Espac08.setFocusable(false);

        jLabel_Valor08.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Valor08.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_Valor08.setText(" 99");
        jLabel_Valor08.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Valor08.setFocusable(false);

        jLabel_Prod08.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Prod08.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_Prod08.setText(" 99");
        jLabel_Prod08.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Prod08.setFocusable(false);

        jLabel_Cons08.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Cons08.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_Cons08.setText(" 99");
        jLabel_Cons08.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Cons08.setFocusable(false);

        jLabel_Espac09.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Espac09.setText("  9");
        jLabel_Espac09.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Espac09.setFocusable(false);

        jLabel_Valor09.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Valor09.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_Valor09.setText(" 99");
        jLabel_Valor09.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Valor09.setFocusable(false);

        jLabel_Prod09.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Prod09.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_Prod09.setText(" 99");
        jLabel_Prod09.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Prod09.setFocusable(false);

        jLabel_Cons09.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Cons09.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_Cons09.setText(" 99");
        jLabel_Cons09.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Cons09.setFocusable(false);

        jLabel_Espac10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Espac10.setText(" 10");
        jLabel_Espac10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Espac10.setFocusable(false);

        jLabel_Valor10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Valor10.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_Valor10.setText(" 99");
        jLabel_Valor10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Valor10.setFocusable(false);

        jLabel_Prod10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Prod10.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_Prod10.setText(" 99");
        jLabel_Prod10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Prod10.setFocusable(false);

        jLabel_Cons10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Cons10.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_Cons10.setText(" 99");
        jLabel_Cons10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Cons10.setFocusable(false);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Espac01, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Valor01, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Prod01, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Cons01, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Espac02, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Valor02, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Prod02, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Cons02, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Espac03, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Valor03, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Prod03, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Cons03, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Espac04, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Valor04, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Prod04, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Cons04, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Espac05, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Valor05, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Prod05, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Cons05, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Espac06, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Valor06, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Prod06, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Cons06, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Espac07, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Valor07, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Prod07, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Cons07, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Espac08, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Valor08, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Prod08, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Cons08, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Espac09, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Valor09, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Prod09, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Cons09, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Espac10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Valor10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Prod10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Cons10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel_Espac01, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Valor01, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Prod01, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Cons01, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Cons02, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel_Espac02, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Valor02, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Prod02, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel_Espac03, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Valor03, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Prod03, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel_Espac04, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Valor04, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Prod04, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel_Espac05, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Valor05, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Prod05, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel_Espac06, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Valor06, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Prod06, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel_Espac07, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Valor07, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Prod07, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel_Espac08, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Valor08, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Prod08, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel_Espac09, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Valor09, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Prod09, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel_Espac10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Valor10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Prod10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Cons03, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Cons04, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Cons05, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Cons06, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Cons07, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Cons08, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Cons09, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Cons10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(" Código de Colores: "));

        jLabel_Cod01.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Cod01.setText("1");
        jLabel_Cod01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Cod01.setFocusable(false);

        jLabel_Cod02.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Cod02.setText("1");
        jLabel_Cod02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Cod02.setFocusable(false);

        jLabel_Cod03.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Cod03.setText("1");
        jLabel_Cod03.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Cod03.setFocusable(false);

        jLabel_Cod05.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Cod05.setText("1");
        jLabel_Cod05.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Cod05.setFocusable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Consumidor en activo");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Productor 1");

        jLabel_Cod04.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Cod04.setText("1");
        jLabel_Cod04.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_Cod04.setFocusable(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Productor 2");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Espacio ocupado");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("En blanco sin datos ni actividad");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_Cod05, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(jLabel_Cod03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Cod02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Cod01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel_Cod04, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Cod01, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_Cod02, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Cod03, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Cod04, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Cod05, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel_CampoMensaje02.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_CampoMensaje02.setForeground(javax.swing.UIManager.getDefaults().getColor("ToolBar.dockingForeground"));
        jLabel_CampoMensaje02.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_CampoMensaje02.setText("Campo para los mensajes de la Aplicación");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(java.awt.SystemColor.textHighlight);
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Valor acumulado:");

        jLabel_ValorAcumulado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_ValorAcumulado.setForeground(java.awt.SystemColor.textHighlight);
        jLabel_ValorAcumulado.setText("0");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_CampoMensaje02, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_ValorAcumulado, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_CampoMensaje02, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel_ValorAcumulado))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(" Controles "));

        jTextField_ValorMax.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField_ValorMax.setText("0");
        jTextField_ValorMax.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_ValorMaxFocusLost(evt);
            }
        });
        jTextField_ValorMax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ValorMaxKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Valor máximo:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_ValorMax, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_ValorMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap())
        );

        jButton_Iniciar.setText("Iniciar");
        jButton_Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IniciarActionPerformed(evt);
            }
        });

        jButton_Log.setText("Archivo de Log");
        jButton_Log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LogActionPerformed(evt);
            }
        });

        jButtonReiniciar.setText("Reiniciar");
        jButtonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Iniciar)
                .addGap(44, 44, 44)
                .addComponent(jButton_Log)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButtonReiniciar)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Iniciar)
                    .addComponent(jButton_Log)
                    .addComponent(jButtonReiniciar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton_Salir.setText("Salir");
        jButton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirActionPerformed(evt);
            }
        });

        jButton_Creditos.setText("Créditos");
        jButton_Creditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CreditosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jButton_Creditos)
                .addGap(18, 18, 18)
                .addComponent(jButton_Salir)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Salir)
                    .addComponent(jButton_Creditos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jTextPane_02);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Dispara la ejecución del programa
     * @param evt Recibe el evento de hacer click sobre el botón
     */
    private void jButton_IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IniciarActionPerformed
        // Clase que contiene todos los objetos de la interface y que sera pasada por parámetro a la clase principal
        Clase10Control clase10Control = new Clase10Control(jLabel_Espac01, jLabel_Espac02, jLabel_Espac03, jLabel_Espac04, jLabel_Espac05, jLabel_Espac06, jLabel_Espac07, jLabel_Espac08, jLabel_Espac09, jLabel_Espac10, 
                                                           jLabel_Valor01, jLabel_Valor02, jLabel_Valor03, jLabel_Valor04, jLabel_Valor05, jLabel_Valor06, jLabel_Valor07, jLabel_Valor08, jLabel_Valor09, jLabel_Valor10,
                                                           jLabel_Prod01, jLabel_Prod02, jLabel_Prod03, jLabel_Prod04, jLabel_Prod05, jLabel_Prod06, jLabel_Prod07, jLabel_Prod08, jLabel_Prod09, jLabel_Prod10,
                                                           jLabel_Cons01, jLabel_Cons02, jLabel_Cons03, jLabel_Cons04, jLabel_Cons05, jLabel_Cons06, jLabel_Cons07, jLabel_Cons08, jLabel_Cons09, jLabel_Cons10,
                                                           jButton_Log,
                                                           jLabel_CampoMensaje01, jLabel_CampoMensaje02,
                                                           jLabel_ValorAcumulado,
                                                           jTextField_ValorMax);
        // Clase Principal con la lógica del programa:
        // Recibe por parámetro la clase Clase10Control que contiene todos los elemntos de la interface
        Principal principal = new Principal(clase10Control);
        // El botón una vez pulsado se desabilita:
        this.jButton_Iniciar.setEnabled(false);
    }//GEN-LAST:event_jButton_IniciarActionPerformed
    /**
     * Dispara la apertura el archivo log.txt una vez que finalicen los hilos de ejecución
     * @param evt Recibe el evento de hacer click sobre el botón
     */
    private void jButton_LogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LogActionPerformed
        try {
            File path = new File (SisOperFileSeparator.rutaSisOper("log.txt"));
            Desktop.getDesktop().open(path);
        } catch (Exception e) {
            System.err.println("Error: " + e.toString());
        }
        this.jButtonReiniciar.setEnabled(true);
        this.jButton_Log.setEnabled(false);
    }//GEN-LAST:event_jButton_LogActionPerformed
    /**
     * Dispara el reiniciar el programa sin tener que cerrar y volver a abrir
     * permitiendo múltiples ejecucuiones. El archivo log.txt de esta maenra no se resetea y
     * y crea un log seguido de las ejecucuiones.
     * 
     * @param evt Recibe el evento de hacer click sobre el botón
     */
    private void jButtonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReiniciarActionPerformed
        this.dispose();
        JFrame v10control=new Vista10Control();
    }//GEN-LAST:event_jButtonReiniciarActionPerformed
    /**
     * Dispara los créditos del programa.
     * @param evt Recibe el evento de hacer click sobre el botón
     */ 
    private void jButton_CreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CreditosActionPerformed
        Dialog_AcercaDe dialog_AcercaDe = new Dialog_AcercaDe(this, true);
        dialog_AcercaDe.setVisible(true);
    }//GEN-LAST:event_jButton_CreditosActionPerformed
    /**
     * Dispara la salida del programa.
     * @param evt Recibe el evento de hacer click sobre el botón
     */
    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_SalirActionPerformed
    /**
     * Controla la entrada de texto para asegurarnos un número entero
     * @param evt Recibe el evento de marcar una tecla sobre el Campo de Texto
     */
    private void jTextField_ValorMaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ValorMaxKeyTyped
        this.jLabel_CampoMensaje02.setText("");
        char caracterIntro = evt.getKeyChar();
        if (!Character.isDigit(caracterIntro)){
            getToolkit().beep();
            evt.consume();
            this.jLabel_CampoMensaje02.setText("* Sólo puedes introducir números enteros.");
            this.jTextField_ValorMax.requestFocus();
        }
    }//GEN-LAST:event_jTextField_ValorMaxKeyTyped
    /**
     * Controla la entrada de texto para asegurarnos un número entero y válido
     * @param evt Recibe el evento de perder el foco sobre el Campo de Texto
     */
    private void jTextField_ValorMaxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_ValorMaxFocusLost
        this.jLabel_CampoMensaje02.setText("");
        try {
            int i = Integer.getInteger(this.jTextField_ValorMax.getText());
        } catch (Exception e) {
            //getToolkit().beep();
            this.jLabel_CampoMensaje02.setText("* Por favor, revisa el número entero.");
            this.jTextField_ValorMax.requestFocus();
            this.jTextField_ValorMax.selectAll();
        }
    }//GEN-LAST:event_jTextField_ValorMaxFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonReiniciar;
    private javax.swing.JButton jButton_Creditos;
    private javax.swing.JButton jButton_Iniciar;
    private javax.swing.JButton jButton_Log;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_CampoMensaje01;
    private javax.swing.JLabel jLabel_CampoMensaje02;
    private javax.swing.JLabel jLabel_Cod01;
    private javax.swing.JLabel jLabel_Cod02;
    private javax.swing.JLabel jLabel_Cod03;
    private javax.swing.JLabel jLabel_Cod04;
    private javax.swing.JLabel jLabel_Cod05;
    private javax.swing.JLabel jLabel_Cons01;
    private javax.swing.JLabel jLabel_Cons02;
    private javax.swing.JLabel jLabel_Cons03;
    private javax.swing.JLabel jLabel_Cons04;
    private javax.swing.JLabel jLabel_Cons05;
    private javax.swing.JLabel jLabel_Cons06;
    private javax.swing.JLabel jLabel_Cons07;
    private javax.swing.JLabel jLabel_Cons08;
    private javax.swing.JLabel jLabel_Cons09;
    private javax.swing.JLabel jLabel_Cons10;
    private javax.swing.JLabel jLabel_Espac01;
    private javax.swing.JLabel jLabel_Espac02;
    private javax.swing.JLabel jLabel_Espac03;
    private javax.swing.JLabel jLabel_Espac04;
    private javax.swing.JLabel jLabel_Espac05;
    private javax.swing.JLabel jLabel_Espac06;
    private javax.swing.JLabel jLabel_Espac07;
    private javax.swing.JLabel jLabel_Espac08;
    private javax.swing.JLabel jLabel_Espac09;
    private javax.swing.JLabel jLabel_Espac10;
    private javax.swing.JLabel jLabel_Prod01;
    private javax.swing.JLabel jLabel_Prod02;
    private javax.swing.JLabel jLabel_Prod03;
    private javax.swing.JLabel jLabel_Prod04;
    private javax.swing.JLabel jLabel_Prod05;
    private javax.swing.JLabel jLabel_Prod06;
    private javax.swing.JLabel jLabel_Prod07;
    private javax.swing.JLabel jLabel_Prod08;
    private javax.swing.JLabel jLabel_Prod09;
    private javax.swing.JLabel jLabel_Prod10;
    private javax.swing.JLabel jLabel_Valor01;
    private javax.swing.JLabel jLabel_Valor02;
    private javax.swing.JLabel jLabel_Valor03;
    private javax.swing.JLabel jLabel_Valor04;
    private javax.swing.JLabel jLabel_Valor05;
    private javax.swing.JLabel jLabel_Valor06;
    private javax.swing.JLabel jLabel_Valor07;
    private javax.swing.JLabel jLabel_Valor08;
    private javax.swing.JLabel jLabel_Valor09;
    private javax.swing.JLabel jLabel_Valor10;
    private javax.swing.JLabel jLabel_ValorAcumulado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField_ValorMax;
    private javax.swing.JTextPane jTextPane_01;
    private javax.swing.JTextPane jTextPane_02;
    // End of variables declaration//GEN-END:variables
}
