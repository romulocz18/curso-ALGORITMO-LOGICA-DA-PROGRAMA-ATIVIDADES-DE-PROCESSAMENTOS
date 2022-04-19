package ex9;
import javax.swing.JOptionPane;
public class salario_bonus 
{
        public static void main(String[]args) 
        {
        float fixo, bonus, quant_vendas, valor_bonus, salario_final;// variáveis;
        fixo = 500;
        bonus = 50;
        quant_vendas = Float.parseFloat(JOptionPane.showInputDialog("quantidade de vendas: ")); // entradas;
        
        valor_bonus = quant_vendas * bonus; //processamento;
        salario_final = fixo + valor_bonus; //processamento;
        
       JOptionPane.showMessageDialog(null,"salario fixo = "+fixo+
    		                              "\nvalor do bonus = "+bonus+
    		                              "\nA quantidade de vendas ="+quant_vendas+
    		                              "\nO valor do bonus a ser recebido ="+valor_bonus+
    		                              "\nO salario final = "+salario_final);
       
        
        //JOptionPane.showMessageDialog(null,"O valor do salario fixo................................: "+fixo);
       //JOptionPane.showMessageDialog(null,"O bonus por cada venda é de............................: "+bonus);
       //JOptionPane.showMessageDialog(null,"Quantidade de sotfwares vendidos.......................: "+quant_vendas);       //saídas 
       //JOptionPane.showMessageDialog(null,"O valor do bonus que o funcionario vai receber.........: "+salario_final);
        
   }

}
        
