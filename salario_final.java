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
    	  
    	  JOptionPane.showMessageDialog(null,"O valor fixo é: "+fixo);
    	  JOptionPane.showMessageDialog(null,"O valor da venda é: "+valor_venda);
    	  JOptionPane.showMessageDialog(null,"O valor da comissão é: "+comissao);
    	  JOptionPane.showMessageDialog(null,"O valor do salario total é: "+salario_total);
    	  
    	 
    	  
    	  
    	 
      }
}
