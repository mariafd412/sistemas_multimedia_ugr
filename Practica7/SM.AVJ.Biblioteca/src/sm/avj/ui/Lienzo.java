/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.avj.ui;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.List;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import sm.avj.graficos.miShape;

/**
 *
 * @author antoniovj1
 */
public class Lienzo extends javax.swing.JPanel {

    private Forma forma;
    private Color color;
    private Stroke stroke;
    private final RenderingHints antialiasing;
    private final Composite comp;
    private miShape sh;

    private Point2D puntoClick, puntoActual;

    private final List<miShape> vShape;

    private boolean relleno;
    private boolean alisado;
    private boolean transparencia;
    private boolean editar;

    public Lienzo() {
        this.vShape = new ArrayList<>();
        this.forma = Forma.PUNTO;
        this.color = Color.BLACK;
        this.stroke = new BasicStroke(1.0f);
        this.comp = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f);
        this.antialiasing = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        initComponents();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(color);
        g2d.setStroke(stroke);

        if (alisado) {
            g2d.setRenderingHints(this.antialiasing);
        }

        if (transparencia) {
            g2d.setComposite(comp);
        }

        for (miShape s : vShape) {
            if (relleno) {
                g2d.fill(s);
            }
            g2d.draw(s);
        }
    }

    private miShape createShape(Point2D p1, Point2D p2) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class c = Class.forName(forma.getNombreClase());
        miShape s = (miShape) c.newInstance();

        s.setPoints(p1, p2);

        return s;
    }

    private miShape getSelectedSape(Point2D p) {
        int i = vShape.size() - 1;

        while (i >= 0) {
            if ((vShape.get(i)).contains(p)) {
                return vShape.get(i);
            }
            i--;
        }
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(java.awt.Color.white);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        puntoClick = evt.getPoint();
        puntoActual = puntoClick;
        sh = null;

        if (editar) {
            sh = this.getSelectedSape(puntoClick);
        } else {
            try {
                sh = createShape(puntoClick, puntoClick);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
            }
            vShape.add(sh);
        }
        repaint();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        puntoActual = evt.getPoint();

        if (sh != null) {
            if (editar) {
                //En primer lugar calculo cuanto y hacia donde se ha movido el punto
                // respecto a donde si hizo click.
                Point2D p = new Point2D.Double(puntoActual.getX() - puntoClick.getX(), puntoActual.getY() - puntoClick.getY());
                Point2D esquina = sh.getPoint1();
                // Muevo la figura añadiendo el punto calculado anteriormente 
                // para evitar que se mueva desde la esquina.
                esquina.setLocation(esquina.getX() + p.getX(), esquina.getY() + p.getY());
                sh.setLocation(esquina);

                puntoClick = puntoActual;

            } else {
                sh.setPoint2(puntoActual);
            }
        }
        repaint();
    }//GEN-LAST:event_formMouseDragged

    // Creo que no es necesario... PREGUNTAR
    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        this.formMouseDragged(evt);
    }//GEN-LAST:event_formMouseReleased

    /* GETTERS y SETTERS */
    public Forma getForma() {
        return forma;
    }

    public void setForma(Forma forma) {
        this.forma = forma;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Stroke getStroke() {
        return stroke;
    }

    public Float getStrokeWidth() {
        return ((BasicStroke) stroke).getLineWidth();
    }

    public void setStroke(Stroke stroke) {
        this.stroke = stroke;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public boolean isAlisado() {
        return alisado;
    }

    public void setAlisado(boolean alisado) {
        this.alisado = alisado;
    }

    public boolean isTransparencia() {
        return transparencia;
    }

    public void setTransparencia(boolean transparencia) {
        this.transparencia = transparencia;
    }

    public boolean isEditar() {
        return editar;
    }

    public void setEditar(boolean editar) {
        this.editar = editar;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}