{O custo ao consumidor de um carro novo, é soma do custo,
de fabrica com a porcentagem do revendedor e com o custo
dos impostos (aplicados ao custo de fabrica).Supondo que a
a porcentagem do revededor seja de do custo de fabrica que
e que os impostos custam 45% do custo de fabrica um algoritmo
que leia o valor de custo de fabrica e determinado o preço
final de automovel.}

////////resolução ///////////////////////////////////////////////////////
 program custos_automovel;
 var custo_fabrica, percentual_revenda, perc_revenda, impostos, preco_final : Real;

 begin
     write('Digite o valor do custo de fabrica do automovel .:');
     readln(custo_fabrica);// conforme o usuário detreminar;
     write('Digite o valor do perecentual de revendar .:');
     readln(percentual_revenda);// conforme o usuário detreminar;
     perc_revenda :=(percentual_revenda * custo_fabrica) / 100;// calculando percentual de venda;
     impostos := (45 * custo_fabrica) / 100;// calculando custo de fabrica;
     preco_final := custo_fabrica + perc_revenda + impostos;// calculando preço final;
     writeln('Custo de Fabrica ...............:',custo_fabrica:6:2);
     writeln('Percentual de revendar ..........:',percentual_revenda:6:2); // entradas
     writeln('impostos.........................:',impostos:6:2);
     writeln('O preco Final e .................:',preco_final:6:2);
     writeln('................Fim do Sistema..............');
     readln();
end.







