program venda_bonus;
var fixo, bonus, quant_sotfw, valor_bonus, salario_final: Real;

begin
 fixo := 500;
 bonus := 50;
 write('Quatidade de sotfware vendidos: '); //entradas;
 readln(quant_sotfw);

 valor_bonus :=(quant_sotfw * bonus);    //processamento;
 salario_final :=(fixo + valor_bonus);

 writeln('O valor fixo.....................................: ',fixo:6:2);
 writeln('O bonus por cada sistema vendido.................: ',bonus:6:2);
 writeln('Quantidade de sotfware vendidos..................: ',quant_sotfw:6:2);
 writeln('O valor do bonus a ser recebido..................: ',valor_bonus:6:2);    //saídas;
 writeln('O salario total e de.............................: ',salario_final:6:2);

 writeln('>>>>>>>>>>>>>>>>>>>>>>>>>>>fim de sistema>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>');
 readln(); // espera o resultado no terminal;
end.


