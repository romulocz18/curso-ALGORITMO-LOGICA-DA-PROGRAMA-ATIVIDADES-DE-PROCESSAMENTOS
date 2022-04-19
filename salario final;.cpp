#include <conio.h>
#include <stdio.h>
main()
{
	float fixo, valor_venda, comissao, salario_final;
    
	fixo = 800;
    printf("Digite o valor da venda = ");
    scanf("%f",&valor_venda);
    
    comissao = (valor_venda * 15) / 100;
    salario_final = fixo + comissao;
    
printf("\n O salario fixo e igual:............... %f",fixo);
printf("\n O valor da venda e igual:............... %f",valor_venda);
printf("\n O valor da comissao e igual:............... %f",comissao);
printf("\n O salario final e de..........................: %f.",salario_final);
printf("\n\n >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Fim do sistema <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
getch();

    
	
}
