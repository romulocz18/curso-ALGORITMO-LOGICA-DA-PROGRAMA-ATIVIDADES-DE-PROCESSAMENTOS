package ex4;
import javax.swing.JOptionPane;
public class troca_de_valores
{
	public static void main (String[] args)
	 {
		int A, B, Auxiliar;
		
		A = 5;
		B = 10;
		Auxiliar = A;
		A = B;
		B = Auxiliar;
		JOptionPane.showMessageDialog(null,"A =  "+A+" e B = "+B); 								
	 }
}