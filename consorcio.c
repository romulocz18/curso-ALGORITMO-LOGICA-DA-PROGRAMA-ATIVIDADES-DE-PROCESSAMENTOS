// O algoritmo  mostra quantas parcelas tem no consorcio, quantidade de parcelas, o valor que foi pago e
// seu saldo devedor;

#include <stdio.h> 
int main () //metodo principal 
{
    float QtdParcelas, QtdPPg , ValorAtual, ValorPg, SaldoP; // quantas variáveis 
    
    printf("\n A quantidade de parcelas do Consorcio: "); // entradas; 
    scanf("%f",&QtdParcelas);

    printf("\n A quantidades de parcelas que foram pagas: "); // entradas;
    scanf("%f",&QtdPPg);

    printf("\n Valor atual das parcelas e R$ ");
    scanf("%f",&ValorAtual);

    ValorPg = ValorAtual * QtdPPg; // Processamento; 

    SaldoP = ValorAtual * (QtdParcelas - QtdPPg); //processamento;

    //printf("\n A quantidade de parcelas do seu consorcio............:%f",QtdParcelas);
    //printf("\n A quantidade de parcelas que foram pagas.............:%f",QtdPPg);
    //printf("\n Atual o senhor paga .................................:R$ %f",ValorAtual);  // Mostra separado como  valor 
    //printf("\n O valor que foi pago pelo pago........................:R$ %f",ValorPg);
    //printf("\n O valor pentende.......................................:R$ %f",SaldoP);

    printf("\n Senhor(a)");
    printf("\n A quantidade de parcelas sao = %f, foram pagas = %f parcelas. \n O  valor atual da parcela R$ %f , foi pago R$ %f  \n e seu saldo Devededor R$ %f",QtdParcelas,QtdPPg,ValorAtual,ValorPg,SaldoP); // Conjunto de todos a informações necessarias;

 printf("\n\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> O esperamos ter ajudado!<<<<<<<<<<<<<<<<<<<<");
 return 0; //mostra na tela;



}