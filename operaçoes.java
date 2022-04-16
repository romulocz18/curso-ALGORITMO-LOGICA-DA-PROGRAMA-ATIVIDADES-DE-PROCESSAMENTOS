package ex3;
import javax.swing.JOptionPane;
public class operaçoes 
{
       public static void main(String[] args)
       {
    float num1,num2,soma,divisao,multiplicacao,subtracao;
    
             num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o numero 1: "));
             num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o numero 2: "));
    
    soma = num1 + num2;
    multiplicacao = num1 * num2;
    divisao = num1 / num2;
    subtracao = num1 - num2;
    
//JOptionPane.showMessageDialog(null,"A soma = "+soma);
//JOptionPane.showMessageDialog(null,"A multiplicacao = "+multiplicacao);
//JOptionPane.showMessageDialog(null,"A divisao = "+divisao );
//JOptionPane.showMessageDialog(null,"A subtracao = "+subtracao);
JOptionPane.showMessageDialog(null,"A soma = "+soma+"\nA divisao = "+divisao+ "\nA multipicacao = " +multiplicacao+ "\nA subtratracao = " +subtracao);    

}
       
}
