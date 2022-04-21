 
 // O algoritmo mostra o desconto de 9% do Inss, no salario liquido do funcionario. 
 
 
 #include <stdio.h> 
 int main() //metodo principal;
 {
     
     char NomeFuncionario[30]; // Representa a variável do tipo alfanumerico;
     float SalarioBruto, Inss, SalarioLiquido; // Tipos de variáveis; 
    
    printf("\n qual o nome do funcionario: ");    //As entradas; 
    scanf("%s",NomeFuncionario);
    printf("\n qual o salario bruto do funcionario: "); //As entradas;
    scanf("%f",&SalarioBruto);
    Inss = (SalarioBruto * 9) / 100; // Os processamento;
    SalarioLiquido = SalarioBruto - Inss;
   printf("\n O funcionario ...............: %s",NomeFuncionario);
   printf("\n O salario dele ...............: %f",SalarioBruto);        // saídas de todas as informações;
   printf("\n O desconto do Inss no salario..............: %f",Inss);
   printf("\n O salario liquido dele...................: %f",SalarioLiquido);
   
//printf("\n O funcionario = %s \n O salario do funcionario = %f \n O desconto do Inss = %f \n O salario liquido = %f",NomeFuncionario,SalarioBruto,Inss,SalarioLiquido);

    printf("\n\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Fim de Sistema<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    return 0;


    
 }
