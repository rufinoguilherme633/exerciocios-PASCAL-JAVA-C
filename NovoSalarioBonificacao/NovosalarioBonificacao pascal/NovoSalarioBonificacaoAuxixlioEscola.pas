program NovoSalarioBonificacaoAuxilioEscola;
uses crt;
var salario,novo_salario,bonificacao,auxilio:real;
begin
writeln('Digite o seu salario');
readln(salario);
writeln('salario informado ', salario:7:2);
if salario <= 600 then
begin
auxilio:=150;
if salario <= 500 then
bonificacao:= salario * (5/100)
else if salario <= 1200 then
bonificacao:= salario *(12/100)
//writeln(salario);
end
else
begin
auxilio:=100;
bonificacao:=salario * (12/100);
end;
novo_salario:=salario + bonificacao + auxilio;
writeln('novo salario',novo_salario:7:2);
writeln('bonificacao',bonificacao:7:2);
writeln('auxilio',auxilio:7:2);
readln;
end.