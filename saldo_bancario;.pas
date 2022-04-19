program saldo_bancario;
var saldo, cheque_entrou, saldo_final: Real;
begin
saldo := 500;
write('Digite o valor de entrada no cheque.: ');
readln(cheque_entrou);
saldo_final := saldo - cheque_entrou;

writeln('O saldo atual da conta bancaria............:',saldo_final:6:2);
writeln('>>>>>>>>>>>>>>>>>>>>>>>>>>>FIM DE SISTEMA<<<<<<<<<<<<<<<<<<<<');
readln();
end.


