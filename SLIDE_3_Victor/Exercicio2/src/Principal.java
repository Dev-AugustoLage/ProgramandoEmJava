import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor();
        
        int opcao;
        do {
            String mensagem = "[Escolha sua Ação]" + "\n" +
                    "1- Nome" + "\n" +
                    "2- Salário Base" + "\n" +
                    "3- Valor Vendido" + "\n\n" +
                    "0- Sair" + "\n";

            if (vendedor.getNome() != null && !vendedor.getNome().equals("")) {
                mensagem += "\n\n[ VENDEDOR SELECIONADO ]"+"\n"+
                            "Nome: " + vendedor.getNome() + "\n" +
                            "Salário Base: " + vendedor.getSalarioBase() + "\n"+
                            "Valor Vendido: "+ vendedor.getValorVendido() + "\n"+
                            "Salário Comissão: "+ vendedor.calculoComissao(vendedor.getValorVendido()) + "\n";
            }

            opcao = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
            switch (opcao) {
                case 1:
                    vendedor.entrarNome();
                    break;
                case 2:
                    vendedor.entrarSalarioBase();
                    break;
                case 3:
                    vendedor.valorVendido();
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
        } while (opcao != 0);
    }
}
