                    program NovoSalarioBonificacaoAuxilioEscola;
                    uses crt;
                    var salario,novo_salario,bonificacao, auxilio:real;

                    begin
                    writeln('Digite o seu salario');
                    readln(salario);
                    writeln('salario informado ' ,salario:7:2);
                   // if salario <= 500 then
                     //   bonificacao:= salario * (5/100)

                   // else if salario <=  1200 then
                     //   bonificacao:= salario * (12/100)
                       // writeln(salario);
                   // else
                  //  bonificacao:=0;

                    if salario <= 600 then
                    auxilio:= salario + 150
                   else

                  auxilio:= salario + 100;

                    novo_salario:= salario + bonificacao;

                    writeln('novo salario' ,novo_salario:7:2);
                    writeln('bonificacao' ,bonificacao:7:2);
                    writeln('Auxilio' ,auxilio:7:2);
                    readln;
                    end.
