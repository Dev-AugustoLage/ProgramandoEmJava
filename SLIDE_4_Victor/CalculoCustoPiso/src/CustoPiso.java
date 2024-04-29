
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
public class CustoPiso {
    
   private double comprimentoComodo, larguraComodo, precoPorArea, custoTotalComodo;

    public CustoPiso() {
    }

    public CustoPiso(double comprimentoComodo, double larguraComodo, double precoPorArea, double custoTotalComodo) {
        this.comprimentoComodo = comprimentoComodo;
        this.larguraComodo = larguraComodo;
        this.precoPorArea = precoPorArea;
        this.custoTotalComodo = custoTotalComodo;
    }

    public double getComprimentoComodo() {
        return comprimentoComodo;
    }

    public void setComprimentoComodo(double comprimentoComodo) {
        this.comprimentoComodo = comprimentoComodo;
    }

    public double getLarguraComodo() {
        return larguraComodo;
    }

    public void setLarguraComodo(double larguraComodo) {
        this.larguraComodo = larguraComodo;
    }

    public double getPrecoPorArea() {
        return precoPorArea;
    }

    public void setPrecoPorArea(double precoPorArea) {
        this.precoPorArea = precoPorArea;
    }

    public double getCustoTotalComodo() {
        return custoTotalComodo;
    }

    public void setCustoTotalComodo(double custoTotalComodo) {
        this.custoTotalComodo = custoTotalComodo;
    }
   
   public void inserirValores(){
       setComprimentoComodo(Double.parseDouble(JOptionPane.showInputDialog("Digite o Comprimento do Cômodo: ")));
       setLarguraComodo(Double.parseDouble(JOptionPane.showInputDialog("Digite a Largura do Cômodo: ")));
       setPrecoPorArea(Double.parseDouble(JOptionPane.showInputDialog("Digite o Preço Cobrado por Área: ")));      
   }
    
   public void calcularPrecoArea(){
       setCustoTotalComodo(getComprimentoComodo()*getLarguraComodo()*getPrecoPorArea());
   }
   
   public void mostrarValores(){
       JOptionPane.showMessageDialog(null, 
               "Comprimento: "+getComprimentoComodo()+"\n"+
               "Lagura: "+getLarguraComodo()+"\n"+
               "Preço por Àrea: "+getPrecoPorArea()+"\n\n"+
               "Preço Total: "+getCustoTotalComodo()
       );
   }
}
