package ex7;
import javax.swing.JOptionPane;
public class saldo_bancario 
{
          public static void main(String[]args)
     {
       float saldo, cheque_entrou, saldo_atual;
       saldo = 500;
       cheque_entrou = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de entrada do cheque.: "));
       saldo_atual = saldo - cheque_entrou;
       
      JOptionPane.showMessageDialog(null,"Sua conta ficou com o saldo de.: "+saldo_atual);
      ;
     }
}
