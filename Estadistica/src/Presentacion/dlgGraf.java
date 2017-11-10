package Presentacion;

import estadistica.modelo.Clase;
import estadistica.modelo.Frecuencia;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


public class dlgGraf extends JDialog {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Frecuencia frecuencia;

    public dlgGraf(Frecuencia frec, Frame owner, boolean modal) {
        super(owner, modal);
        frecuencia = frec;

        JTabbedPane tbnPane = new JTabbedPane();

        JPanel contenedor = new JPanel(new FlowLayout());
        JPanel botonera = new JPanel(new FlowLayout());
        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        botonera.add(btnCerrar);

        tbnPane.add("Histograma", panelHistograma());
        tbnPane.add("Poligono", panelPoligono());
        tbnPane.add("Histograma AC", panelHistograma_ac());
        tbnPane.add("Poligono AC", panelPoligono_ac());

        setLayout(new BorderLayout(5, 5));
        add(tbnPane, BorderLayout.CENTER);
        add(botonera, BorderLayout.SOUTH);
        pack();
    }

    private JPanel panelHistograma() {
        JFreeChart jfreechart = crearHistograma(crearDatosHistograma());
        ChartPanel panel = new ChartPanel(jfreechart);
        return panel;
    }

    private JFreeChart crearHistograma(IntervalXYDataset datos) {
        JFreeChart jfreechart = ChartFactory.createXYBarChart("Histograma", "X", false, "Y", datos, PlotOrientation.VERTICAL, false, false, false);
        return jfreechart;
    }

    private IntervalXYDataset crearDatosHistograma() {
        SimpleIntervalXYDataset dataset = new SimpleIntervalXYDataset(frecuencia);
        return dataset;
    }
    
    /// Frecuencia relativa acumulada
      private JPanel panelHistograma_ac() {
        JFreeChart jfreechart = crearHistograma_ac(crearDatosHistograma_ac());
        ChartPanel panel = new ChartPanel(jfreechart);
        return panel;
    }

    private JFreeChart crearHistograma_ac(IntervalXYDataset datos) {
        JFreeChart jfreechart = ChartFactory.createXYBarChart("Histograma Frecuencia Relativa Acumulada", "X", false, "Y", datos, PlotOrientation.VERTICAL, false, false, false);
        return jfreechart;
    }

    private IntervalXYDataset crearDatosHistograma_ac() {
        SimpleIntervalXYDataset_ac dataset = new SimpleIntervalXYDataset_ac(frecuencia);
        return dataset;
    }
    
    

    private XYDataset crearDatosPoligono() {
        XYSeries poligono = new XYSeries("Poligono");

        Clase[] clase = frecuencia.getClases();
        float[] rel = frecuencia.getFrecRel();
        int k = frecuencia.getK();
        for (int i = 0; i < clase.length; i++) {
            poligono.add(clase[i].getMarca(), rel[i]);
        }
        XYSeriesCollection series = new XYSeriesCollection();
        series.addSeries(poligono);
        return series;
    }

    private JPanel panelPoligono() {
        JFreeChart jfreechart = crearPoligono(crearDatosPoligono());
        ChartPanel chart = new ChartPanel(jfreechart);
        return chart;
    }

    private JFreeChart crearPoligono(XYDataset datosPoligono) {
        JFreeChart jfreechart = ChartFactory.createXYLineChart("Poligono de frecuecias", "X", "Y", datosPoligono, PlotOrientation.VERTICAL, false, false, false);
        return jfreechart;
    }
    
    // Poligono para frecuencia relativa acumulada
    private XYDataset crearDatosPoligono_ac() {
        XYSeries poligono = new XYSeries("Poligono AC");

        Clase[] clase = frecuencia.getClases();
        float[] rel = frecuencia.getFrecRelAc();
        int k = frecuencia.getK();
        for (int i = 0; i < clase.length; i++) {
            poligono.add(clase[i].getMarca(), rel[i]);
        }
        XYSeriesCollection series = new XYSeriesCollection();
        series.addSeries(poligono);
        return series;
    }

    private JPanel panelPoligono_ac() {
        JFreeChart jfreechart = crearPoligono_ac(crearDatosPoligono_ac());
        ChartPanel chart = new ChartPanel(jfreechart);
        return chart;
    }

    private JFreeChart crearPoligono_ac(XYDataset datosPoligono) {
        JFreeChart jfreechart = ChartFactory.createXYLineChart("Poligono de Frecuecias Relativas Acumuladas", "X", "Y", datosPoligono, PlotOrientation.VERTICAL, false, false, false);
        return jfreechart;
    }
}
