package ex8;
import javax.swing.JOptionPane;
public class salario_final 
{
	public static void main(String[]args)
      {
    	  float fixo, valor_venda, comissao, salario_total;
    	  
    	  fixo = 800;
    	  valor_venda = Float.parseFloat(JOptionPane.showInputDialog("qual o valor da venda: "));
    	  comissao = (valor_venda * 15) / 100;
    	  salario_total = fixo + comissao;
    	  
    	  JOptionPane.showMessageDialog(null,"O valor fixo �: "+fixo);
    	  JOptionPane.showMessageDialog(null,"O valor da venda �: "+valor_venda);
    	  JOptionPane.showMessageDialog(null,"O valor da comiss�o �: "+comissao);
    	  JOptionPane.showMessageDialog(null,"O valor do salario total �: "+salario_total);
    	  
    	 
    	  
    	  
    	 
      }
}
