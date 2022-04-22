package ex6;
import javax.swing.JOptionPane; //biblioteca utilizada
class PrestacaoAtraso{
    public static void main(String args[]){ //metodo princial;
    
        float prestacao, ValorPrest, taxa; 
        int DiasAtraso;

        ValorPrest = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da prestação: ")); //entradas; 
        taxa = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da taxa: "));//entradas;
        DiasAtraso = Integer.parseInt(JOptionPane.showInputDialog("Quantos dias apos o vencimento:"));//entradas;

        prestacao = ValorPrest + (ValorPrest *(taxa / 100)*DiasAtraso);// calculo para saber qual o valor corrigido da prestação;

        JOptionPane.showMessageDialog(null,"O valor da prestacao atual = "+ValorPrest);
        JOptionPane.showMessageDialog(null,"A taxa de juros e = "+taxa); // saídas com os resultados inviduais; 
        JOptionPane.showMessageDialog(null,"Os dias em atraso sao = "+DiasAtraso); 
        JOptionPane.showMessageDialog(null,"O valor da prestacao ser paga = "+prestacao);

        JOptionPane.showMessageDialog(null,"O valor da prestacao atual = " +ValorPrest+
                                            "\n A taxa de juros e = "+taxa+      // Saídas com resltudados com indivuais;
                                            "\n Os dias em atraso sao = "+DiasAtraso+
                                            "\n O valor da prestacao ser paga = "+prestacao);

    }
}

// O algoritmo mostra quando o valor da prestação atual, sua taxa e quantidade e os dias em atraso e valor valor corrigido da prestação com juros;