import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Calculadora calcular = new Calculadora();
        
        int opcao;
        do{
        opcao = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "[Escolha sua Operação]"+"\n"+
                        "1- Somar"+"\n"+
                        "2- Subtrair"+"\n"+
                        "3- Multiplicar"+"\n"+
                        "4- Dividir"+"\n\n"+
                        "0- Sair"+"\n\n"
                ));
            switch(opcao)
            {
                case 1:
                    calcular.somar();
                    break;
                case 2:
                    double valor1 = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    "Digite o valor 1: "
                            ));
                    double valor2 = Double.parseDouble(
                           JOptionPane.showInputDialog(
                                   "Digite o valor 2: "
                           ));
                    calcular.subtrair(valor1,valor2);
                    break;
                case 3:
                    calcular.multiplicar();
                    break;
                case 4:
                    double valor01 = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    "Digite o valor 1: "
                            ));
                    double valor02 = Double.parseDouble(
                           JOptionPane.showInputDialog(
                                   "Digite o valor 2: "
                           ));
                    calcular.dividir(valor01,valor02);
                    break;
                case 0:
                    
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
            
            }while(opcao!=0);
        
        
    }
    
}
