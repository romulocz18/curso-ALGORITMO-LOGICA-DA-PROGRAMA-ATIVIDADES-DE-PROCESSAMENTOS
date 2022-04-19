#include <conio.h>
#include <stdio.h>
main()
{
	float fixo, bonus, quant_vendas, valor_bonus, salario_final; // variáveis;
	fixo = 500;
	bonus = 50;
	printf("quantidade de sotfwares vendidos: "); // entradas; 
	scanf("%f",&quant_vendas);
	valor_bonus = quant_vendas * bonus; //processamento;
	salario_final = fixo + valor_bonus; //processamento;
	
	printf("\n O valor fixo...................................................: %f",fixo);
	printf("\n O valor do bonus por cada venda................................: %f",bonus);
	printf("\n A quantidade de sotfwares vendidos.............................: %f",quant_vendas);    //saídas; 
	printf("\n Valor do bonus para ser recebido...............................: %f",valor_bonus);
	printf("\n\n O salario final e de.........................................: %f",salario_final);
	printf("\n\n<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<fim de sistema>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	getch(); // ver resultados no terminal;
	

	
}
