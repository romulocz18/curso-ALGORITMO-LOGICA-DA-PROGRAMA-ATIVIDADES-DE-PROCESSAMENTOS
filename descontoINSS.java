
// O algoritmo mostra o desconto de 9% do Inss, no salario liquido do funcionario;

package JAVA;// coresponde ao arquivo a ser utilizado; 
import javax.swing.JOptionPane; //Biblioteca das caixa saídas com uma melhor interação com usuário;
class descontoInss {
    
public static void main(String args[]) { //metodo principal;
    
    float SalarioBruto, Inss, SalarioLiquido; // As variáveis do tipo numeros; 
    String NomeFuncionario;// A variável do tipo alfanumerico;

    NomeFuncionario =  JOptionPane.showInputDialog("O funcionario = ");
    SalarioBruto = Float.parseFloat(JOptionPane.showInputDialog("O salario =")); //entradas; 
    Inss = (SalarioBruto * 9) / 100;
    SalarioLiquido = SalarioBruto - Inss; //processamento das informações;
    
    JOptionPane.showMessageDialog(null, "O Funcionario = "+NomeFuncionario);
    JOptionPane.showMessageDialog(null,"O salario = "+SalarioBruto);          //comandos de mostra a saídas modo cada uma separado;
    JOptionPane.showMessageDialog(null,"O desconto no Inss = "+Inss);
    JOptionPane.showMessageDialog(null,"O salario liquido = "+SalarioLiquido);

    JOptionPane.showMessageDialog(null,"O funcionario = "+NomeFuncionario+
                                                 "\n O salario = "+SalarioBruto+            //opção de todos a informações reunidas;
                                                 "\n O desconto do Inss = "+Inss+
                                                 "\n O salario liquido = " +SalarioLiquido);
        
    }

}