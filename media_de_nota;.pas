program avaliacao;
var prova1, prova2, prova3, media_final: real;

begin
write('Escreva a primira nota.: ');
readln(prova1);
write('Esccreva a segunada nota.: ');     // corresponde a entadas das notas;
readln(prova2);
write('Escreva a terceira nota.: ');
readln(prova3);

Prova1 := prova1 * 2 /10;                  //processamento das entradas;
Media_final :=(prova1 + prova2 + prova3);

write('A nota do aluno foi:',media_final);   //mostra na tela;
readln();

end.




