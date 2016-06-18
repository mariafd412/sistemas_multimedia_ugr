/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.avj.ui;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sm.avj.graficos.CurvaQ2D;
import sm.avj.graficos.Forma;
import sm.avj.graficos.miShape;

/**
 *
 * @author antoniovj1
 */
public class Lienzo extends javax.swing.JPanel {

    private Forma forma;
    private miShape sh;
    miShape clip;
    private final List<miShape> vShape;
    private Point2D puntoClick, puntoActual;
    private boolean editar;
    private boolean poligono_empezado;
    private boolean curvaq_empezada, curvaq_ptc;

    public Lienzo() {
        this.poligono_empezado = false;
        this.curvaq_empezada = false;
        this.curvaq_ptc = false;

        this.vShape = new ArrayList<>();

        this.forma = Forma.PUNTO;

        initComponents();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        if (clip != null) {
            g2d.clip(clip);
        }

        AlphaComposite comp = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f);
        RenderingHints antialiasing = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);

        for (miShape s : vShape) {
            s.paint(g2d);

            //Restauro el objeto g2d
            g2d.setComposite(comp);
            g2d.setRenderingHints(antialiasing);
        }
    }

    private miShape createShape(Point2D p1) throws ClassNotFoundException, NoSuchMethodException,
            IllegalArgumentException, InvocationTargetException,
            InstantiationException, IllegalAccessException {

        Class c = Class.forName(forma.getNombreClase());
        Constructor constructor = c.getConstructor(new Class[]{Point2D.class});

        miShape s = (miShape) constructor.newInstance(p1);

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

    private void moveFront(miShape sh) {
        vShape.remove(sh);
        vShape.add(vShape.size(), sh);
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
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

        if (poligono_empezado == false && curvaq_empezada == false) {
            sh = null;
        }

        if (editar) {
            sh = this.getSelectedSape(puntoClick);

        } else if (poligono_empezado == false && curvaq_empezada == false) {
            try {
                sh = createShape(puntoClick);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | IllegalArgumentException | InvocationTargetException ex) {
                Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
            }
            vShape.add(sh);

            if (forma == Forma.POLIGONO) {
                poligono_empezado = true;
            } else if (forma == Forma.CURVAQ) {
                curvaq_empezada = true;
            }
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

                sh.setLocation(p);

                puntoClick = puntoActual;

            } else if (forma != Forma.POLIGONO && curvaq_ptc == false) {
                sh.setPointFin(puntoActual);
            } else if (forma == Forma.CURVAQ && curvaq_empezada && curvaq_ptc) {
                ((CurvaQ2D) sh).setPointCtrl(puntoActual);
            }
        }
        repaint();
    }//GEN-LAST:event_formMouseDragged

    // Creo que no es necesario... PREGUNTAR
    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        if (forma != Forma.POLIGONO) {
            this.formMouseDragged(evt);
        }
    }//GEN-LAST:event_formMouseReleased

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if (evt.getClickCount() == 2) {
            poligono_empezado = false;
            if (curvaq_empezada == true && curvaq_ptc == false) {
                curvaq_ptc = true;
            } else if (curvaq_empezada && curvaq_ptc) {
                curvaq_empezada = false;
                curvaq_ptc = false;
            }

        } else if (editar == false) {
            if (forma != Forma.POLIGONO) {
                this.formMouseDragged(evt);
            } else {
                sh.setPointFin(puntoClick);
                repaint();
            }
        } else if (evt.getButton() == MouseEvent.BUTTON2 && sh != null) {
            moveFront(sh);
        }

    }//GEN-LAST:event_formMouseClicked

    /* GETTERS y SETTERS */
    public Forma getForma() {
        return forma;
    }

    public void setForma(Forma forma) {
        this.forma = forma;
    }

    public Color getColor() {
        if (sh != null) {
            return sh.getColor();
        } else {
            return null;
        }
    }

    public void setColor(Color color) {
        if (sh != null) {
            sh.setColor(color);
        }
    }

    public Stroke getStroke() {
        if (sh != null) {
            return sh.getStroke();
        } else {
            return null;
        }
    }

    public Float getStrokeWidth() {
        if (sh != null) {
            return ((BasicStroke) sh.getStroke()).getLineWidth();
        } else {
            return 1.0f;
        }
    }

    public void setStroke(Stroke stroke) {
        if (sh != null) {
            sh.setStroke(stroke);
        }
    }

    public void setStrokeDash(float[] dash) {
        if (sh != null) {
            sh.setStrokeDash(dash);
        }
    }
    
    public void setStrokeWidth(float w) {
        if(sh != null){
            sh.setStrokeWidth(w);
        }
    }

    public boolean isRelleno() {
        if (sh != null) {
            return sh.isRelleno();
        } else {
            return false;
        }
    }

    public void setRelleno(boolean relleno) {
        if (sh != null) {
            sh.setRelleno(relleno);
        }
    }

    public boolean isAlisado() {
        if (sh != null) {
            return sh.isAlisado();
        } else {
            return false;
        }
    }

    public void setAlisado(boolean alisado) {
        if (sh != null) {
            sh.setAlisado(alisado);
        }
    }

    public boolean isTransparencia() {
        if (sh != null) {
            return sh.isTransparencia();
        } else {
            return false;
        }
    }

    public void setTransparencia(boolean transparencia) {
        if (sh != null) {
            sh.setTransparencia(transparencia);
        }
    }

    public void setTrasnsparenciaValue(float val) {
        if (sh != null) {
            sh.setTransparenciaValue(val);
        }
    }

    public float getTransparenciaValue() {
        if (sh != null) {
            return sh.getTransparenciaVlaue();
        } else {
            return 0.5f;
        }
    }

    public boolean isEditar() {
        return editar;
    }

    public void setEditar(boolean editar) {
        this.editar = editar;
    }

    public miShape getClip() {
        return clip;
    }

    public void setClip(miShape clip) {
        this.clip = clip;
    }

    public boolean isFigSelected() {
        return sh != null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
