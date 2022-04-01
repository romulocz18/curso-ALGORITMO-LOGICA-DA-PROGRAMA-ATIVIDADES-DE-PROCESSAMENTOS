package ex2;
import javax.swing.JOptionPane;// A biblicioteca do JAVA;
public class meida_ler // nome do programa 
{
	public static void main(String[] args) // Caractériza qual será a variáveis que vamos utilizar; // DataInputStream = manipula dados de entrada
                  {
                  float nota1, nota2, calc_media; //escolha das variáveis; 
                  nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: ")); //entradas 
                  nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: ")); //entradas 
                  calc_media = (nota1 + nota2) / 2; //processamento das entradas;
                  JOptionPane.showMessageDialog(null,"A media = "+ calc_media); // saídas  
                  }
                	  
}

// JOptionPane = corresponde a biblioteca dos de texto;
// quando colocamos um comando JOptionPane.showInputDialog esta relado atravez de texto, caso o usuário tenha colocar um numero devemos fazer sua conversão para que não ocorra erros seja excutado com sucesso;
