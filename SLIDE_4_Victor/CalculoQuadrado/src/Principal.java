
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rodri
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Quadrado quad = new Quadrado();
        int escolha;
        double ladoA;
        
        ladoA = Double.parseDouble(JOptionPane.showInputDialog(
                    "### Calculo de Quadrado ###"+"\n"+
                    "Digite o valor do lado: "
            ));
        do{ 
            escolha = Integer.parseInt(JOptionPane.showInputDialog(
                    "### MENU DE OPÇÕES ###"+"\n"+
                    "1 - Calcular Area Quadrado"+"\n"+
                    "2 - Calcular Perimetro Quadrado"+"\n"+
                    "3 - Mostrar Valores"+"\n"+
                    "4 - Sair"
            ));
            
            switch(escolha){
            case 1:
                quad.calcularArea(ladoA);
            break;
            case 2:
                quad.calcularPerimetro(ladoA);
            break;
            case 3:
                quad.mostrarValores();
            break;
            case 4:
                JOptionPane.showMessageDialog(null, "Saindo...");
            break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida");
            break;
        }
           
        }while(escolha != 4);
    }
    
}
