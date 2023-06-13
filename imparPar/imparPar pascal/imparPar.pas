                                   program parImpar;
                                   uses crt;
                                   var num,resultado: integer;
                                   begin
                                   writeln('Digite um n£mero');
                                   readln(num);
                                   resultado:= num mod 2;
                                   if resultado = 0 then
                                        writeln('Esse numero ‚ par')
                                    else
                                        writeln('Esse numero ‚ impar');
                                   readln;
                                   end.