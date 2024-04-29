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

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CustoPiso piso = new CustoPiso();
        int escolha;
        
        
        do{
            escolha = Integer.parseInt(JOptionPane.showInputDialog(
                    "### MENU DE OPÇÕES ###"+"\n"+
                    "1 - Inserir Valores do Comodo"+"\n"+
                    "2 - Calcular preco por Area"+"\n"+
                    "3 - Mostrar Valores"+"\n"+
                    "4 - Sair"
            ));
            
            switch(escolha){
            case 1:
                piso.inserirValores();
            break;
            case 2:
                piso.calcularPrecoArea();
            break;
            case 3:
                piso.mostrarValores();
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
