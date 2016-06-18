/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4_paintbasico;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author antonio
 */
public class VentanaPincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPincipal
     */
    public VentanaPincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotonesFormas = new javax.swing.ButtonGroup();
        gurupoBotonesColores = new javax.swing.ButtonGroup();
        lienzo = new practica4_paintbasico.Lienzo();
        barraHerramientas = new javax.swing.JToolBar();
        botonPunto = new javax.swing.JToggleButton();
        botonLinea = new javax.swing.JToggleButton();
        botonRectangulo = new javax.swing.JToggleButton();
        botonElipse = new javax.swing.JToggleButton();
        panelInferior = new javax.swing.JPanel();
        barraEstado = new javax.swing.JLabel();
        panelOpcionesInferior = new javax.swing.JPanel();
        panelColores = new javax.swing.JPanel();
        bColor1 = new javax.swing.JToggleButton();
        bColor2 = new javax.swing.JToggleButton();
        bColor3 = new javax.swing.JToggleButton();
        bColor4 = new javax.swing.JToggleButton();
        bColor5 = new javax.swing.JToggleButton();
        bColor6 = new javax.swing.JToggleButton();
        botonRelleno = new javax.swing.JCheckBox();
        barraMenu = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        miNuevo = new javax.swing.JMenuItem();
        miAbrir = new javax.swing.JMenuItem();
        miGuardar = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        miVerBarraEstado = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Paint Básico");

        javax.swing.GroupLayout lienzoLayout = new javax.swing.GroupLayout(lienzo);
        lienzo.setLayout(lienzoLayout);
        lienzoLayout.setHorizontalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );
        lienzoLayout.setVerticalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 193, Short.MAX_VALUE)
        );

        getContentPane().add(lienzo, java.awt.BorderLayout.CENTER);

        barraHerramientas.setRollover(true);

        grupoBotonesFormas.add(botonPunto);
        botonPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Lapiz.gif"))); // NOI18N
        botonPunto.setSelected(true);
        botonPunto.setToolTipText("Punto");
        botonPunto.setFocusable(false);
        botonPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonPunto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoActionPerformed(evt);
            }
        });
        barraHerramientas.add(botonPunto);

        grupoBotonesFormas.add(botonLinea);
        botonLinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Linea.gif"))); // NOI18N
        botonLinea.setToolTipText("Línea");
        botonLinea.setFocusable(false);
        botonLinea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonLinea.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLineaActionPerformed(evt);
            }
        });
        barraHerramientas.add(botonLinea);

        grupoBotonesFormas.add(botonRectangulo);
        botonRectangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Rectangulo.gif"))); // NOI18N
        botonRectangulo.setToolTipText("Rectángulo");
        botonRectangulo.setFocusable(false);
        botonRectangulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonRectangulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRectanguloActionPerformed(evt);
            }
        });
        barraHerramientas.add(botonRectangulo);

        grupoBotonesFormas.add(botonElipse);
        botonElipse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Ovalo.gif"))); // NOI18N
        botonElipse.setToolTipText("Elipse");
        botonElipse.setFocusable(false);
        botonElipse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonElipse.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonElipse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonElipseActionPerformed(evt);
            }
        });
        barraHerramientas.add(botonElipse);

        getContentPane().add(barraHerramientas, java.awt.BorderLayout.PAGE_START);

        panelInferior.setLayout(new java.awt.BorderLayout());

        barraEstado.setText("Barra de estado");
        barraEstado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelInferior.add(barraEstado, java.awt.BorderLayout.PAGE_END);

        panelOpcionesInferior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelOpcionesInferior.setLayout(new java.awt.GridLayout(1, 0));

        panelColores.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        bColor1.setBackground(new java.awt.Color(0, 0, 0));
        gurupoBotonesColores.add(bColor1);
        bColor1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bColor1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bColor1.setPreferredSize(new java.awt.Dimension(25, 25));
        bColor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bColor1ActionPerformed(evt);
            }
        });
        panelColores.add(bColor1);

        bColor2.setBackground(new java.awt.Color(0, 255, 0));
        gurupoBotonesColores.add(bColor2);
        bColor2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bColor2.setPreferredSize(new java.awt.Dimension(25, 25));
        bColor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bColor2ActionPerformed(evt);
            }
        });
        panelColores.add(bColor2);

        bColor3.setBackground(new java.awt.Color(0, 0, 255));
        gurupoBotonesColores.add(bColor3);
        bColor3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bColor3.setPreferredSize(new java.awt.Dimension(25, 25));
        bColor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bColor3ActionPerformed(evt);
            }
        });
        panelColores.add(bColor3);

        bColor4.setBackground(new java.awt.Color(255, 255, 255));
        gurupoBotonesColores.add(bColor4);
        bColor4.setForeground(new java.awt.Color(255, 255, 255));
        bColor4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bColor4.setPreferredSize(new java.awt.Dimension(25, 25));
        bColor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bColor4ActionPerformed(evt);
            }
        });
        panelColores.add(bColor4);

        bColor5.setBackground(new java.awt.Color(255, 255, 0));
        gurupoBotonesColores.add(bColor5);
        bColor5.setForeground(new java.awt.Color(255, 255, 0));
        bColor5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bColor5.setPreferredSize(new java.awt.Dimension(25, 25));
        bColor5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bColor5ActionPerformed(evt);
            }
        });
        panelColores.add(bColor5);

        bColor6.setBackground(new java.awt.Color(255, 0, 0));
        gurupoBotonesColores.add(bColor6);
        bColor6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bColor6.setPreferredSize(new java.awt.Dimension(25, 25));
        bColor6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bColor6ActionPerformed(evt);
            }
        });
        panelColores.add(bColor6);

        panelOpcionesInferior.add(panelColores);

        botonRelleno.setText("Relleno");
        botonRelleno.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botonRelleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRellenoActionPerformed(evt);
            }
        });
        panelOpcionesInferior.add(botonRelleno);

        panelInferior.add(panelOpcionesInferior, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelInferior, java.awt.BorderLayout.PAGE_END);

        menuArchivo.setText("Archivo");

        miNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        miNuevo.setText("Nuevo");
        miNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNuevoActionPerformed(evt);
            }
        });
        menuArchivo.add(miNuevo);

        miAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        miAbrir.setText("Abrir");
        miAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAbrirActionPerformed(evt);
            }
        });
        menuArchivo.add(miAbrir);

        miGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        miGuardar.setText("Guardar");
        miGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGuardarActionPerformed(evt);
            }
        });
        menuArchivo.add(miGuardar);

        barraMenu.add(menuArchivo);

        menuEditar.setText("Editar");

        miVerBarraEstado.setSelected(true);
        miVerBarraEstado.setText("Barra de Estado");
        miVerBarraEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVerBarraEstadoActionPerformed(evt);
            }
        });
        menuEditar.add(miVerBarraEstado);

        barraMenu.add(menuEditar);

        setJMenuBar(barraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNuevoActionPerformed
        this.lienzo.limpiarPuntos();
        this.lienzo.repaint();
    }//GEN-LAST:event_miNuevoActionPerformed

    private void miAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAbrirActionPerformed
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showOpenDialog(this);
        if( resp == JFileChooser.APPROVE_OPTION) {
            File f = dlg.getSelectedFile();
            //TODO
         }
    }//GEN-LAST:event_miAbrirActionPerformed

    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoActionPerformed
        this.lienzo.setForma(Forma.PUNTO);
        this.barraEstado.setText("Punto seleccionado");
    }//GEN-LAST:event_botonPuntoActionPerformed

    private void botonLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLineaActionPerformed
        this.lienzo.setForma(Forma.LINEA);
        this.barraEstado.setText("Linea seleccionada");
    }//GEN-LAST:event_botonLineaActionPerformed

    private void botonRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRectanguloActionPerformed
        this.lienzo.setForma(Forma.RECTANGULO);
        this.barraEstado.setText("Rectangulo seleccionado");
    }//GEN-LAST:event_botonRectanguloActionPerformed

    private void botonElipseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonElipseActionPerformed
        this.lienzo.setForma(Forma.ELIPSE);
        this.barraEstado.setText("Elipse seleccionada");

    }//GEN-LAST:event_botonElipseActionPerformed

    private void botonRellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRellenoActionPerformed
        this.lienzo.setRelleno(this.botonRelleno.isSelected());
    }//GEN-LAST:event_botonRellenoActionPerformed

    private void bColor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bColor1ActionPerformed
        this.lienzo.setColor(this.bColor1.getBackground());
    }//GEN-LAST:event_bColor1ActionPerformed

    private void bColor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bColor2ActionPerformed
        this.lienzo.setColor(this.bColor2.getBackground());        
    }//GEN-LAST:event_bColor2ActionPerformed

    private void bColor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bColor3ActionPerformed
        this.lienzo.setColor(this.bColor3.getBackground());
    }//GEN-LAST:event_bColor3ActionPerformed

    private void bColor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bColor4ActionPerformed
        this.lienzo.setColor(this.bColor4.getBackground());
    }//GEN-LAST:event_bColor4ActionPerformed

    private void bColor5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bColor5ActionPerformed
        this.lienzo.setColor(this.bColor5.getBackground());
    }//GEN-LAST:event_bColor5ActionPerformed

    private void bColor6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bColor6ActionPerformed
        this.lienzo.setColor(this.bColor6.getBackground());
    }//GEN-LAST:event_bColor6ActionPerformed

    private void miVerBarraEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVerBarraEstadoActionPerformed
        this.barraEstado.setVisible(this.miVerBarraEstado.isSelected());
    }//GEN-LAST:event_miVerBarraEstadoActionPerformed

    private void miGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGuardarActionPerformed
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showSaveDialog(this);
        if( resp == JFileChooser.APPROVE_OPTION) {
            File f = dlg.getSelectedFile();
            //TODO
        }
    }//GEN-LAST:event_miGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bColor1;
    private javax.swing.JToggleButton bColor2;
    private javax.swing.JToggleButton bColor3;
    private javax.swing.JToggleButton bColor4;
    private javax.swing.JToggleButton bColor5;
    private javax.swing.JToggleButton bColor6;
    private javax.swing.JLabel barraEstado;
    private javax.swing.JToolBar barraHerramientas;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JToggleButton botonElipse;
    private javax.swing.JToggleButton botonLinea;
    private javax.swing.JToggleButton botonPunto;
    private javax.swing.JToggleButton botonRectangulo;
    private javax.swing.JCheckBox botonRelleno;
    private javax.swing.ButtonGroup grupoBotonesFormas;
    private javax.swing.ButtonGroup gurupoBotonesColores;
    private practica4_paintbasico.Lienzo lienzo;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenuItem miAbrir;
    private javax.swing.JMenuItem miGuardar;
    private javax.swing.JMenuItem miNuevo;
    private javax.swing.JCheckBoxMenuItem miVerBarraEstado;
    private javax.swing.JPanel panelColores;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel panelOpcionesInferior;
    // End of variables declaration//GEN-END:variables
}