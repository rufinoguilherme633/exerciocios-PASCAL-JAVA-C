                                             program NovoSalario;
                                             uses crt;
                                             var salario,novo_salario,percentual:real;
                                             i,ano_atual:integer;
                                             begin
                                             writeln('Digite o ano');
                                             readln(ano_atual);
                                             salario:=1000;
                                             percentual:=1.5/100;
                                             writeln(salario:7:2);
                                             writeln(percentual:7:2);
                                             for i:= 2007 to ano_atual do
                                             begin
                                             novo_salario:= salario + (salario * percentual);   ;
                                             percentual:= 2 * percentual;
                                             salario:= novo_salario;
                                             end;
                                             writeln('Percentual ', percentual:7:3);
                                             writeln('novo salario ',novo_salario:7:2);
                                             writeln('----------------');

                                            readln;
                                             end.
