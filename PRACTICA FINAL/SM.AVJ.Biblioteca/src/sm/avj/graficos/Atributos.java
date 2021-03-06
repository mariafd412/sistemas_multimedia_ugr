package sm.avj.graficos;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author antonio
 */
public class Atributos {

    final int HORIZONTAL = 1;
    final int VERTICAL = 2;
    final int DIAGONAL = 3;

    Color colorFrente;
    Color colorFondo;
    Stroke stroke;
    float transp;

    AlphaComposite comp;
    RenderingHints antialiasing;

    AlphaComposite comp_sin_tansparencia = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f);

    RenderingHints antialiasing_sin_alisado = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_OFF);

    GradientPaint gradiente;

    boolean alisado;
    boolean transparencia;
    boolean relleno;
    boolean gradienteB;

    Point2D p1 = null;
    Point2D p2 = null;
    int tipoGrad;

    public Atributos() {
        colorFrente = Color.BLACK;
        colorFondo = Color.BLACK;
        tipoGrad = 0;
        transp = 0.5f;
        stroke = new BasicStroke(1.0f);
        comp = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, transp);
        antialiasing = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        alisado = false;
        transparencia = false;
        relleno = false;
        gradienteB = false;
    }

    public void conf(Graphics2D g2d) {
        g2d.setPaint(colorFrente);
        g2d.setStroke(stroke);

        if (isTransparencia()) {
            g2d.setComposite(comp);
        } else {
            g2d.setComposite(comp_sin_tansparencia);
        }

        if (isAlisado()) {
            g2d.setRenderingHints(antialiasing);
        } else {
            g2d.setRenderingHints(antialiasing_sin_alisado);
        }

        if (isGradiente()) {
            g2d.setPaint(gradiente);
        }
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

    public void setTransparenciaValue(float val) {
        if (val > 1.0f) {
            val = 1.0f;
        } else if (val < 0.0f) {
            val = 0.0f;
        }

        comp = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, val);
        transp = val;
        transparencia = true;
    }

    public float getTrnaspareciaValue() {
        return transp;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public Color getColorFrente() {
        return colorFrente;
    }

    public void setColorFrente(Color color) {
        this.colorFrente = color;
    }

    public Color getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(Color colorFondo) {
        this.colorFondo = colorFondo;
    }

    public Stroke getStroke() {
        return stroke;
    }

    public void setStroke(Stroke stroke) {
        this.stroke = stroke;
    }

    public void setStrokeDash(float[] dash) {
        int cap = ((BasicStroke) stroke).getEndCap();
        int join = ((BasicStroke) stroke).getLineJoin();
        float width = ((BasicStroke) stroke).getLineWidth();

        stroke = new BasicStroke(width, cap, join, 10.0f, dash, 0.0f);
    }

    public void setStrokeWidth(float w) {
        int cap = ((BasicStroke) stroke).getEndCap();
        int join = ((BasicStroke) stroke).getLineJoin();
        float dash[] = ((BasicStroke) stroke).getDashArray();

        stroke = new BasicStroke(w, cap, join, 10.0f, dash, 0.0f);
    }

    public boolean isGradiente() {
        return gradienteB;
    }

    public void setGradiente(boolean gradienteB) {
        this.gradienteB = gradienteB;
    }

    public void setConfigGradiente(int tipo, MiShape s) {
        tipoGrad = tipo;

        calcularPuntosGradiente(tipo, s);

        gradiente = new GradientPaint(p1, colorFrente, p2, colorFondo);
        gradienteB = true;
    }

    void updateGradiente(MiShape s) {
        calcularPuntosGradiente(tipoGrad, s);
        gradiente = new GradientPaint(p1, colorFrente, p2, colorFondo);
    }

    public int getTipoGrad() {
        return tipoGrad;
    }

    private void calcularPuntosGradiente(int tipo, MiShape s) {
        Rectangle2D rect = s.getBounds();
        switch (tipo) {
            case HORIZONTAL: 
                p1 = new Point2D.Double(rect.getX(), rect.getY());
                p2 = new Point2D.Double(rect.getX() + rect.getWidth(), rect.getY());
                break;
            case VERTICAL: 
                p1 = new Point2D.Double(rect.getX(), rect.getY());
                p2 = new Point2D.Double(rect.getX(), rect.getY() + rect.getHeight());
                break;
            case DIAGONAL: 
                p1 = new Point2D.Double(rect.getX(), rect.getY());
                p2 = new Point2D.Double(rect.getX() + rect.getWidth(), rect.getY() + rect.getHeight());
                break;
        }
    }
}
