/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>


int main()
{
    int quantidade_numeros_do_usuario,numero_expecifico_usuario,fatorial,i,j;
    
    printf("quantos numeros quer fazer o calculo do fatorial\n");
    scanf("%d", &quantidade_numeros_do_usuario);
    
    //printf("%d\n",quantidade_numeros_do_usuario);
    
    for (i = 1; i <= quantidade_numeros_do_usuario; i++) {
        printf("digite o %d° numero \n", i );
        scanf("%d", &numero_expecifico_usuario);
       // printf("%d",i);
       fatorial = 1;
       for(j = 1; j <= numero_expecifico_usuario; j++){
           
           fatorial = fatorial *j;
        
       }
       printf("o fatorial de %d é %d \n",numero_expecifico_usuario, fatorial);
      
    }

    return 0;
}