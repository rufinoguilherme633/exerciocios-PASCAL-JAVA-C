/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main() {
    float salario, novo_salario, percentual;
    int i, ano_atual;
    printf("Digite o ano atual: ");
    scanf("%d", &ano_atual);
    salario = 1000;
    percentual = 1.5 / 100;
    printf("%f\n", percentual);
    printf("%f\n salario", salario);
    printf("ano digitado: %d\n", ano_atual);
    if (ano_atual != 0) {
        for (i = 2007; i <= ano_atual; i++) {
            percentual = percentual * 2;
            novo_salario = salario + (salario * percentual);
            salario = novo_salario;
              printf("\n----------------------\n");
              printf("ano %i\n", i);
              printf("ano %f\n", percentual);
            printf("salario do ano: %f\n", salario);
        }
        printf("salario atual: %f\n", novo_salario);
    }
    else {
        printf("Não foi possível calcular o salário\n");
    }
    return 0;
}


