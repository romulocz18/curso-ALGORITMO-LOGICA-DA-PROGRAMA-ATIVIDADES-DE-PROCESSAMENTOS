// algoritmo mostrando o valor da prestação, a taxa, e tempo em dias; 

#include <stdio.h>
int main()  // corresponde ao metodo principal;
{
    float prestacao, valorprest, taxa; //Definição das variáveis do tipo "Reais";
    int atraso; // Definição das variáveis do tipo "Inteiros"; 

     printf("\n Qual o valor da prestação: "); // As entradas com as informações colocadas pelo o usuário;
     scanf("%f",&valorprest);

     printf("\n Qual a taxa de juros: "); // As entradas com as informações colocadas pelo o usuário; 
     scanf("%f",&taxa);

     printf("\n Quantos soa os dias em atarso: "); // As infromaçẽos colocadas pelos os usuário;
     scanf("%d",&atraso);

     prestacao = valorprest + (valorprest * (taxa/100) * atraso); // fase de processamentodos dos dados para saber as prestacao a ser paga;

     printf("\n O valor da prestação =  %f",valorprest);
     printf("\n A taxa de juros corresponde = %f",taxa);  // fase das saídas com todas as informaçẽos solicitadas pelo o problema em questão;
     printf("\n O total de dias em atraso = %d",atraso);
     printf("\n O valor da prestação a ser paga e de = %f",prestacao);

    printf("\n\n>>>>>>>>>>>>>>>>>>> fim de sistema<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    return 0;         



}