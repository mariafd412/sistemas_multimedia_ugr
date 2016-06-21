/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaFinal;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.image.BufferedImage;
import sm.avj.ui.Lienzo2DImagen;

/**
 *
 * @author antoniovj1
 */
public class VentanaInternaLienzo extends javax.swing.JInternalFrame {

    private final VentanaPrincipal ventanaPadre;

    public VentanaInternaLienzo(VentanaPrincipal ventanaPadre) {
        this.ventanaPadre = ventanaPadre;
        initComponents();
        /**
         * @TODO Consultar si es la solución correcta
         */
        BufferedImage img;
        img = new BufferedImage(300, 300, BufferedImage.TYPE_INT_RGB);

        Graphics2D g = img.createGraphics();
        g.setPaint(Color.WHITE);

        g.fillRect(0, 0, img.getWidth(), img.getHeight());

        lienzo.setImage(img);

        this.getContentPane().addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent evt) {
                    updateParent();     
            }
        });

    }

    public Lienzo2DImagen getLienzo() {
        return lienzo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPaneImg = new javax.swing.JScrollPane();
        lienzo = new sm.avj.ui.Lienzo2DImagen();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lienzo");
        setPreferredSize(new java.awt.Dimension(250, 250));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        lienzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lienzoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout lienzoLayout = new javax.swing.GroupLayout(lienzo);
        lienzo.setLayout(lienzoLayout);
        lienzoLayout.setHorizontalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );
        lienzoLayout.setVerticalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );

        scrollPaneImg.setViewportView(lienzo);

        getContentPane().add(scrollPaneImg, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateParent() {
        if (lienzo.isFigSelected() && lienzo.isEditar()) {
            if (lienzo.isRelleno() && !lienzo.isGradiente()) {
                this.ventanaPadre.opcionesRelleno.setSelectedIndex(1);
            } else if (!lienzo.isRelleno()) {
                this.ventanaPadre.opcionesRelleno.setSelectedIndex(0);
            }
            if (lienzo.isGradiente()) {
                switch (lienzo.getTipoGradiente()) {
                    case 1:
                        this.ventanaPadre.opcionesRelleno.setSelectedIndex(3);
                        break;
                    case 2:
                        this.ventanaPadre.opcionesRelleno.setSelectedIndex(2);
                        break;
                    case 3:
                        this.ventanaPadre.opcionesRelleno.setSelectedIndex(4);
                        break;
                }
            }

            this.ventanaPadre.botonAlisar.setSelected(lienzo.isAlisado());
            this.ventanaPadre.botonTransparencia.setSelected(lienzo.isTransparencia());
            this.ventanaPadre.spinnerGrosor.setValue(lienzo.getStrokeWidth().intValue());
            this.ventanaPadre.setStrokeDash(((BasicStroke) lienzo.getStroke()).getDashArray());
            this.ventanaPadre.menuColores.setBackground(lienzo.getColorFrente());
        }

        /**
         * ¿ Siempre activados o solo activarlos al seleccionar una figura ?
         *
         */
        boolean actv = (lienzo.isFigSelected() && lienzo.isEditar()) == true;

        this.ventanaPadre.botonAlisar.setEnabled(actv);
        this.ventanaPadre.botonTransparencia.setEnabled(actv);
        this.ventanaPadre.spinnerGrosor.setEnabled(actv);
        this.ventanaPadre.menuColores.setEnabled(actv);
        this.ventanaPadre.sliderTransparencia.setVisible(actv);
        this.ventanaPadre.menuStroke.setEnabled(actv);
        this.ventanaPadre.opcionesRelleno.setEnabled(actv);

        switch (lienzo.getForma()) {
            case PUNTO:
                this.ventanaPadre.botonPunto.setSelected(true);
                break;
            case ELIPSE:
                this.ventanaPadre.botonElipse.setSelected(true);
                break;
            case RECTANGULO:
                this.ventanaPadre.botonRectangulo.setSelected(true);
                break;
            case LINEA:
                this.ventanaPadre.botonLinea.setSelected(true);
                break;
            case POLIGONO:
                this.ventanaPadre.botonPoligono.setSelected(true);
                break;
            case CURVAQ:
                this.ventanaPadre.botonCurvaQ.setSelected(true);
                break;
        }

        if (lienzo.isEditar()) {
            this.ventanaPadre.botonEditar.setSelected(true);
        }

        if (lienzo.isTransparencia()) {
            this.ventanaPadre.sliderTransparencia.setVisible(true);
            this.ventanaPadre.sliderTransparencia.setValue((int) (lienzo.getTransparenciaValue() * 100));
        } else {
            this.ventanaPadre.sliderTransparencia.setVisible(false);
        }

        repaint();
    }


    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        this.updateParent();
    }//GEN-LAST:event_formInternalFrameActivated

    private void lienzoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMousePressed
        this.updateParent();
    }//GEN-LAST:event_lienzoMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sm.avj.ui.Lienzo2DImagen lienzo;
    private javax.swing.JScrollPane scrollPaneImg;
    // End of variables declaration//GEN-END:variables

}
