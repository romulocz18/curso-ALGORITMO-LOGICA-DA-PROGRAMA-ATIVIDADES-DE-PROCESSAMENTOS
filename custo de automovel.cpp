#include <conio.h>
#include <stdio.h>

main()
{
	float custo_fabrica, perc_revendedor, impostos, preco_final;
	printf ("Qual o custo de producao.: ");
	scanf("%f",&custo_fabrica);
	perc_revendedor = (25 * custo_fabrica) / 100;
	impostos = (45 * custo_fabrica) / 100;
	preco_final = custo_fabrica + perc_revendedor + impostos;
	printf("\n O custos de fabrica............: %f",custo_fabrica);
	printf("\n O percentual do revendedor.............: %f",perc_revendedor);
	printf("\n Os impostos ............................: %f",impostos);
	printf("\n O preco final do automovel...............: %f",preco_final);
	getch();	
}
