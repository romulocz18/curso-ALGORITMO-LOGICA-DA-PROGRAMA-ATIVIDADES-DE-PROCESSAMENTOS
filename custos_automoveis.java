package ex5;
import javax.swing.JOptionPane;
public class custos_automoveis
{
	public static void main(String[]args)
	{
	float custo_fabrica, perc_revendedor,impostos, prec_final;
	custo_fabrica = Float.parseFloat(JOptionPane.showInputDialog("Digite o custo de produção: "));
	perc_revendedor = (25 * custo_fabrica) / 100;
	impostos = (45 * custo_fabrica) / 100;
	prec_final = custo_fabrica + perc_revendedor + impostos;
	JOptionPane.showMessageDialog(null, "\n O custo com a fabricação........:"+custo_fabrica+
			                     "\n O custo com revendedor..................:"+perc_revendedor+
			                     "\n O custo com impostos....................:"+impostos+
			                     "\n O custos do automovel...................:"+prec_final);
                                  
			
			
			
	}
}