
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Reza Hosseini
 */
public class Chart {
    private Dimension size;
    private DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    private final String namn,xNamn,yNamn;
    private Color color;
    private final JPanel panel;
    
    public Chart(String n, String xn, String yn, JPanel p){
        this.namn = n;
        this.xNamn = xn;
        this.yNamn = yn;
        this.panel = p;
        
        
    }

    public void setSize(int x, int y) {
        this.size = new Dimension(x,y);
    }
    

    /**
     * 
     * @param data
     * @param type visar vilken digram den är: 0=nya fall   1=regioner  2=åldersgrupper
     */
    public void setDataset(ArrayList data, int type) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        if(type==0){ // listan är statistiken om nya fall
            ArrayList<Region> regioner = data;
            for(Region r:regioner){
                dataset.addValue(r.getNyaFall(), "sjuka", r.getNamn());
            }
        }
        else if(type==1) { // listan är statistiken om regioner
            ArrayList<Region> regioner = data;
            for(Region r:regioner){
                dataset.addValue(r.getTotaltAntalFall(), "sjuka", r.getNamn());
                dataset.addValue(r.getTotaltAntalAvlidna(), "avlidna", r.getNamn());
            }
        }
        else { // listan är statistiken om åldersgrupper
            ArrayList<Ålder> åldrar = data;
            for(Ålder å:åldrar){
                dataset.addValue(å.getTotaltAntalFall(), "sjuka", å.getÅldersGrupp());
                dataset.addValue(å.getAvlidna(), "avlidna", å.getÅldersGrupp());
            }
        }
        this.dataset = dataset;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public ChartPanel skapa(){
        // skapa bar chart 
        JFreeChart barChart = ChartFactory.createBarChart(
                this.namn,
                this.xNamn, this.yNamn,
                this.dataset,
                PlotOrientation.VERTICAL,
                true, true, false);
        // set färg
        CategoryPlot plot = (CategoryPlot) barChart.getPlot();
        plot.getRenderer().setSeriesPaint(0, this.color);
        // skapa panel för charten
        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(size);
        return chartPanel;
    }
    
    public void draw(){
        ChartPanel chartPanel = this.skapa();
        panel.removeAll();    // ta bort allt från panel
        panel.add(chartPanel, BorderLayout.CENTER);
        panel.validate();       // updatera paneln
        panel.updateUI();
    }
    
    @Override
    public String toString(){
        return "Charten "+namn+" visar "+xNamn+" i jämförelse till "+yNamn;
    }
    
 
}
