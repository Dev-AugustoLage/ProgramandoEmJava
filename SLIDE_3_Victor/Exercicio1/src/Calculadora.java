import javax.swing.JOptionPane;

public class Calculadora {
    private double n1, n2, r;

    public Calculadora() {
    }

    public Calculadora(double n1, double n2, double r) {
        this.n1 = n1;
        this.n2 = n2;
        this.r = r;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public void somar(){
        setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro Valor:")));
        setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo Valor:")));
        setR(getN1()+getN2());
        JOptionPane.showMessageDialog(null,
                "Primeiro Valor = "+getN1()+"\n"+
                "Segundo Valor = "+getN2()+"\n\n"+
                "Resultado: "+getN1()+" + "+getN2()+" = "+getR()
        );  
    }
    
    public void subtrair(double valor1, double valor2){
        setR(valor1-valor2);
        
        JOptionPane.showMessageDialog(null, "Resultado: "+getR());
    };
    
    public void multiplicar(){
        setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro Valor:")));
        setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo Valor:")));
        setR(getN1()*getN2());
        JOptionPane.showMessageDialog(null,
                "Primeiro Valor = "+getN1()+"\n"+
                "Segundo Valor = "+getN2()+"\n\n"+
                "Resultado: "+getN1()+" x "+getN2()+" = "+getR()
        );  
    }
    
    public double dividir(double valor1, double valor2){
        setR(valor1/valor2);
        
        JOptionPane.showMessageDialog(null, "Resultado: "+getR());
        
        return getR();
    };
    
    
}
