/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7_paint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Stroke;
import java.io.File;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;

/**
 *
 * @author antonio
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPincipal
     */
    public VentanaPrincipal() {
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
        barraHerramientas = new javax.swing.JToolBar();
        botonNuevo = new javax.swing.JButton();
        botonAbrir = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        botonPunto = new javax.swing.JToggleButton();
        botonLinea = new javax.swing.JToggleButton();
        botonRectangulo = new javax.swing.JToggleButton();
        botonElipse = new javax.swing.JToggleButton();
        botonEditar = new javax.swing.JToggleButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        Color colors[] = { Color.BLACK,Color.WHITE, Color.GRAY, Color.GREEN,
            Color.PINK, Color.RED, Color.MAGENTA, Color.BLUE,
            Color.ORANGE, Color.YELLOW
        }
        ;
        menuColores = new javax.swing.JComboBox(colors);
        jSeparator3 = new javax.swing.JToolBar.Separator();
        spinnerGrosor = new javax.swing.JSpinner();
        botonRelleno = new javax.swing.JToggleButton();
        botonTransparencia = new javax.swing.JToggleButton();
        botonAlisar = new javax.swing.JToggleButton();
        panelInferior = new javax.swing.JPanel();
        barraEstado = new javax.swing.JLabel();
        escritorio = new javax.swing.JDesktopPane();
        barraMenu = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        miNuevo = new javax.swing.JMenuItem();
        miAbrir = new javax.swing.JMenuItem();
        miGuardar = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        miVerBarraEstado = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Paint Básico");

        barraHerramientas.setRollover(true);

        botonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo.png"))); // NOI18N
        botonNuevo.setFocusable(false);
        botonNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });
        barraHerramientas.add(botonNuevo);

        botonAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/abrir.png"))); // NOI18N
        botonAbrir.setFocusable(false);
        botonAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbrirActionPerformed(evt);
            }
        });
        barraHerramientas.add(botonAbrir);

        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar.png"))); // NOI18N
        botonGuardar.setFocusable(false);
        botonGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        barraHerramientas.add(botonGuardar);
        barraHerramientas.add(jSeparator1);

        grupoBotonesFormas.add(botonPunto);
        botonPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/punto.png"))); // NOI18N
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
        botonLinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/linea.png"))); // NOI18N
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
        botonRectangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/rectangulo.png"))); // NOI18N
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
        botonElipse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/elipse.png"))); // NOI18N
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

        grupoBotonesFormas.add(botonEditar);
        botonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/seleccion.png"))); // NOI18N
        botonEditar.setFocusable(false);
        botonEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });
        barraHerramientas.add(botonEditar);
        barraHerramientas.add(jSeparator2);

        menuColores.setRenderer(new ColorCellRenderer());
        menuColores.setMaximumRowCount(4);
        menuColores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuColoresActionPerformed(evt);
            }
        });
        barraHerramientas.add(menuColores);
        barraHerramientas.add(jSeparator3);

        spinnerGrosor.setToolTipText("Borde");
        spinnerGrosor.setPreferredSize(new java.awt.Dimension(50, 29));
        spinnerGrosor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerGrosorStateChanged(evt);
            }
        });
        barraHerramientas.add(spinnerGrosor);

        botonRelleno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/rellenar.png"))); // NOI18N
        botonRelleno.setFocusable(false);
        botonRelleno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonRelleno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonRelleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRellenoActionPerformed(evt);
            }
        });
        barraHerramientas.add(botonRelleno);

        botonTransparencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/transparencia.png"))); // NOI18N
        botonTransparencia.setFocusable(false);
        botonTransparencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonTransparencia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonTransparencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTransparenciaActionPerformed(evt);
            }
        });
        barraHerramientas.add(botonTransparencia);

        botonAlisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/alisar.png"))); // NOI18N
        botonAlisar.setFocusable(false);
        botonAlisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAlisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonAlisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlisarActionPerformed(evt);
            }
        });
        barraHerramientas.add(botonAlisar);

        getContentPane().add(barraHerramientas, java.awt.BorderLayout.PAGE_START);

        panelInferior.setLayout(new java.awt.BorderLayout());

        barraEstado.setText("Barra de estado");
        barraEstado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelInferior.add(barraEstado, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(panelInferior, java.awt.BorderLayout.PAGE_END);

        escritorio.setPreferredSize(new java.awt.Dimension(900, 500));
        getContentPane().add(escritorio, java.awt.BorderLayout.CENTER);

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
        VentanaInterna vi = new VentanaInterna(this);
        escritorio.add(vi);
        vi.setVisible(true);
    }//GEN-LAST:event_miNuevoActionPerformed

    private void miAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAbrirActionPerformed
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showOpenDialog(this);
        if (resp == JFileChooser.APPROVE_OPTION) {
            File f = dlg.getSelectedFile();
            //TODO
        }
    }//GEN-LAST:event_miAbrirActionPerformed

    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoActionPerformed
        VentanaInterna vi = (VentanaInterna) this.escritorio.getSelectedFrame();
        if (vi != null) {
            vi.getLienzo().setForma(sm.avj.ui.Forma.PUNTO);
            vi.getLienzo().setEditar(false);
        }
        //this.barraEstado.setText("Punto seleccionado");

    }//GEN-LAST:event_botonPuntoActionPerformed

    private void botonLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLineaActionPerformed
        VentanaInterna vi = (VentanaInterna) this.escritorio.getSelectedFrame();
        if (vi != null) {
            vi.getLienzo().setForma(sm.avj.ui.Forma.LINEA);
            vi.getLienzo().setEditar(false);
        }
        //this.barraEstado.setText("Linea seleccionada");

    }//GEN-LAST:event_botonLineaActionPerformed

    private void botonRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRectanguloActionPerformed
        VentanaInterna vi = (VentanaInterna) this.escritorio.getSelectedFrame();
        if (vi != null) {
            vi.getLienzo().setForma(sm.avj.ui.Forma.RECTANGULO);
            vi.getLienzo().setEditar(false);
        }
        //this.barraEstado.setText("Rectangulo seleccionado");

    }//GEN-LAST:event_botonRectanguloActionPerformed

    private void botonElipseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonElipseActionPerformed
        VentanaInterna vi = (VentanaInterna) this.escritorio.getSelectedFrame();
        if (vi != null) {
            vi.getLienzo().setForma(sm.avj.ui.Forma.ELIPSE);
            vi.getLienzo().setEditar(false);
        }
        //this.barraEstado.setText("Elipse seleccionada");

    }//GEN-LAST:event_botonElipseActionPerformed

    private void miVerBarraEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVerBarraEstadoActionPerformed
        this.barraEstado.setVisible(this.miVerBarraEstado.isSelected());
    }//GEN-LAST:event_miVerBarraEstadoActionPerformed

    private void miGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGuardarActionPerformed
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showSaveDialog(this);
        if (resp == JFileChooser.APPROVE_OPTION) {
            File f = dlg.getSelectedFile();
            //TODO
        }
    }//GEN-LAST:event_miGuardarActionPerformed

    private void spinnerGrosorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerGrosorStateChanged
        VentanaInterna vi = (VentanaInterna) this.escritorio.getSelectedFrame();
        if (vi != null) {
            Stroke st = new BasicStroke((Integer) this.spinnerGrosor.getValue());
            vi.getLienzo().setStroke(st);
        }
        this.repaint();
    }//GEN-LAST:event_spinnerGrosorStateChanged

    private void botonRellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRellenoActionPerformed
        VentanaInterna vi = (VentanaInterna) this.escritorio.getSelectedFrame();
        if (vi != null) {
            vi.getLienzo().setRelleno(this.botonRelleno.isSelected());
        }
        this.repaint();
    }//GEN-LAST:event_botonRellenoActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        VentanaInterna vi = (VentanaInterna) this.escritorio.getSelectedFrame();
        if (vi != null) {
            vi.getLienzo().setEditar(true);
        }
        this.repaint();
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonTransparenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTransparenciaActionPerformed
        VentanaInterna vi = (VentanaInterna) this.escritorio.getSelectedFrame();
        if (vi != null) {
            vi.getLienzo().setTransparencia(this.botonTransparencia.isSelected());
        }
        this.repaint();
    }//GEN-LAST:event_botonTransparenciaActionPerformed

    private void botonAlisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlisarActionPerformed
        VentanaInterna vi = (VentanaInterna) this.escritorio.getSelectedFrame();
        if (vi != null) {
            vi.getLienzo().setAlisado(this.botonAlisar.isSelected());
        }
        this.repaint();
    }//GEN-LAST:event_botonAlisarActionPerformed

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        VentanaInterna vi = new VentanaInterna(this);
        escritorio.add(vi);
        vi.setVisible(true);
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void botonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbrirActionPerformed
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showOpenDialog(this);
        if (resp == JFileChooser.APPROVE_OPTION) {
            File f = dlg.getSelectedFile();
            //TODO
        }
    }//GEN-LAST:event_botonAbrirActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showSaveDialog(this);
        if (resp == JFileChooser.APPROVE_OPTION) {
            File f = dlg.getSelectedFile();
            //TODO
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void menuColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuColoresActionPerformed

        int R, G, B;

        StringTokenizer st = new StringTokenizer(this.menuColores.getSelectedItem().toString(), "java.awt.Color[],=rgb");

        R = Integer.parseInt(st.nextToken());
        G = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        Color c = new Color(R, G, B);

        this.menuColores.setBackground(c);

        VentanaInterna vi = (VentanaInterna) this.escritorio.getSelectedFrame();
        if (vi != null) {
            vi.getLienzo().setColor(this.menuColores.getBackground());
            repaint();
        }
    }//GEN-LAST:event_menuColoresActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JLabel barraEstado;
    private javax.swing.JToolBar barraHerramientas;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton botonAbrir;
    protected javax.swing.JToggleButton botonAlisar;
    protected javax.swing.JToggleButton botonEditar;
    protected javax.swing.JToggleButton botonElipse;
    private javax.swing.JButton botonGuardar;
    protected javax.swing.JToggleButton botonLinea;
    private javax.swing.JButton botonNuevo;
    protected javax.swing.JToggleButton botonPunto;
    protected javax.swing.JToggleButton botonRectangulo;
    protected javax.swing.JToggleButton botonRelleno;
    protected javax.swing.JToggleButton botonTransparencia;
    protected javax.swing.JDesktopPane escritorio;
    private javax.swing.ButtonGroup grupoBotonesFormas;
    private javax.swing.ButtonGroup gurupoBotonesColores;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JMenu menuArchivo;
    protected javax.swing.JComboBox<String> menuColores;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenuItem miAbrir;
    private javax.swing.JMenuItem miGuardar;
    private javax.swing.JMenuItem miNuevo;
    private javax.swing.JCheckBoxMenuItem miVerBarraEstado;
    private javax.swing.JPanel panelInferior;
    protected javax.swing.JSpinner spinnerGrosor;
    // End of variables declaration//GEN-END:variables
}
