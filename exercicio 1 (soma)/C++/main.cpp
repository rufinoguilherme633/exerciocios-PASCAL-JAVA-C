/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main() {
    int n1, n2, n3, n4, soma;

    printf("Digite o primeiro número: ");
    scanf("%d%*c", &n1);

    printf("Digite o segundo número: ");
    scanf("%d%*c", &n2);

    printf("Digite o terceiro número: ");
    scanf("%d%*c", &n3);

    printf("Digite o quarto número: ");
    scanf("%d%*c", &n4);

    soma = n1 + n2 + n3 + n4;

    printf("A soma dos números é: %d", soma);

    return 0;
}