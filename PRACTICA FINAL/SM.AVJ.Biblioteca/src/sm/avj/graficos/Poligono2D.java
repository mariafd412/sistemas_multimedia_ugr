package sm.avj.graficos;

import java.awt.Polygon;
import java.awt.geom.Point2D;

/**
 *
 * @author antonio
 */
public final class Poligono2D extends MiShape {

    public Poligono2D() {
        geometria = new Polygon();
    }

    public Poligono2D(Point2D p) {
        geometria = new Polygon();
        this.addPoint(p);
    }

    public void addPoint(Point2D p) {
        ((Polygon) geometria).addPoint((int) p.getX(), (int) p.getY());
    }

    @Override
    /**
     * @TODO Preguntar por invalidate
     */
    public void setLocation(Point2D pos) {
        ((Polygon)geometria).translate((int)pos.getX(),(int)pos.getY() );

        ((Polygon) geometria).invalidate();
    }

    @Override
    public boolean contains(Point2D p) {
        return ((Polygon) geometria).contains(p);
    }

    @Override
    public void updateShape(Point2D p1, Point2D p2) {
        //No hace nada
    }
}
