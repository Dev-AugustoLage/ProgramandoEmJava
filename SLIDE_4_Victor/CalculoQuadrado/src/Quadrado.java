
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class Quadrado {
    
    private double areaQuadrado, perimetroQuadrado;

    public Quadrado() {
    }

    public Quadrado(double areaQuadrado, double perimetroQuadrado) {
        this.areaQuadrado = areaQuadrado;
        this.perimetroQuadrado = perimetroQuadrado;
    }

    public double getAreaQuadrado() {
        return areaQuadrado;
    }

    public void setAreaQuadrado(double areaQuadrado) {
        this.areaQuadrado = areaQuadrado;
    }

    public double getPerimetroQuadrado() {
        return perimetroQuadrado;
    }

    public void setPerimetroQuadrado(double perimetroQuadrado) {
        this.perimetroQuadrado = perimetroQuadrado;
    }
    
    
    public void calcularArea(double ladoA){
        setAreaQuadrado(Math.pow(ladoA,2));  
    }
    
    public void calcularPerimetro(double ladoA){
        setPerimetroQuadrado(4*ladoA);
    }
    
    public void mostrarValores(){
        JOptionPane.showMessageDialog(null,
                "Valor Lado: "+getPerimetroQuadrado()/4+"\n"+
                "Valor Quadrado: "+getAreaQuadrado()+"\n"+
                "Valor Perimetro: "+getPerimetroQuadrado()
        );
    
    }
}
