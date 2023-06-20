/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main() {
    float nota_trab, aval_sem, exame, media;
    printf("Digite a nota do trabalho de laboratório: ");
    scanf("%f", &nota_trab);
    printf("Digite a nota da avaliação semestral: ");
    scanf("%f", &aval_sem);
    printf("Digite a nota do exame: ");
    scanf("%f", &exame);

    media = (nota_trab * 2 + aval_sem * 3 + exame * 5) / 10;
    printf("Média: %f\n", media);

    if (media >= 8 && media <= 10) {
        printf("Obteve conceito A\n");
    } else if (media >= 7 && media < 8) {
        printf("Obteve conceito B\n");
    } else if (media >= 6 && media < 7) {
        printf("Obteve conceito C\n");
    } else if (media >= 5 && media < 6) {
        printf("Obteve conceito D\n");
    } else if (media >= 0 && media < 5) {
        printf("Obteve conceito E\n");
    } else {
        printf("Não foi possível realizar os cálculos\n");
    }

    return 0;
}