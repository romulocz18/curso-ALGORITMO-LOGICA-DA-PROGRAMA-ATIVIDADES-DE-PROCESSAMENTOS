
//Esse Algoritmo mostra a quantidade de parcelas, as parcelas que ja foram pagas e tambem o valor e o saldo devedor.

package JAVA;
import javax.swing.JOptionPane; // biblioteca para as caixa de saída interação;
class consorcio {
        public static void main(String args[]) { // correponder ao metodo principal
         
        float QtdParcelas, Qtdpg, ValorAtual, Valorpg, SaldoP;
        QtdParcelas = Float.parseFloat(JOptionPane.showInputDialog("quantas parcelas tem o consorcio: "));
        Qtdpg = Float.parseFloat(JOptionPane.showInputDialog("Quantas parcelas ja foram pagas: "));         //Definição das entradas;
        ValorAtual = Float.parseFloat(JOptionPane.showInputDialog("qual o valor da parcela: "));

        Valorpg = ValorAtual * Qtdpg;
        SaldoP =  ValorAtual * (Qtdpg - QtdParcelas); // processamento dos dados;
        
        JOptionPane.showMessageDialog(null, "A quantidade total de parcelas do consorcio....:"+QtdParcelas);
        JOptionPane.showMessageDialog(null,"As parcelas pagas sao..........................:"+Qtdpg);            //saidas com apresentação das caixas; 
        JOptionPane.showMessageDialog(null,"O valor atual do consorcio......................:"+ValorAtual);
        JOptionPane.showMessageDialog(null,"O valor do que já foi pago .....................:"+Valorpg);
        JOptionPane.showMessageDialog(null,"O saldo devedor e ..............................:"+SaldoP);

        JOptionPane.showMessageDialog(null,"A quandidade de parcelas e = "+QtdParcelas+ 
                                                           "\n já foram pagas e = "+Qtdpg+                // Conjunto das saídas em uma só caixa de texto;
                                                           "\n O valor atual é de = "+ValorAtual+
                                                           "\n O valor que foi pago = "+Valorpg+
                                                           "\n O saldo devedor = "+SaldoP);
                                            
                                                        
    

    


    

         
        }    
}
