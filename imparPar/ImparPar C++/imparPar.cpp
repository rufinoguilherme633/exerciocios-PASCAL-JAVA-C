/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main() {
    int num, resultado;

    printf("Digite um número: ");
    scanf("%d", &num);

    resultado = num % 2;

    if (resultado == 0) {
        printf("%d é um número par\n", num);
    } else {
        printf("%d é um número ímpar\n", num);
    }

    return 0;
}