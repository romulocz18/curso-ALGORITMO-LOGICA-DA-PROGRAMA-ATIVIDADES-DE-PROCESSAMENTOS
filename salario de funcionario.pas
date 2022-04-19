program salario_funcionario;
var fixo, valor_venda, valor_comissao, salario : real;

begin

fixo := 800;
write('qual o valor da venda: ');
readln(valor_venda);                             //entradas;

valor_comissao := (valor_venda * 15) / 100;

salario := (fixo + valor_comissao);                 //processamento;

writeln('O valor do salrio fixo.: ',fixo:6:2);
writeln('O valor da venda.: ',valor_venda:6:2);
writeln('O valor da comissão e de.: ',valor_comissao:6:2);  //saídas;
writeln('O valor do salario e de.: ',salario:6:2);

writeln('>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Fim de sistema<<<<<<<<<<<<<<<<');
readln();

end.


