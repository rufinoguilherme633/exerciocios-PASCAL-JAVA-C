/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//page 1
//. Um funcionário de uma empresa recebe, anualmente, aumento salarial. Sabe-se que: 
//a) Esse funcionário foi contratado em 2005, com salário inicial de R$ 1.000,00. 
//b) Em 2006, ele recebeu aumento de 1,5% sobre seu salário inicial. 
//c) A partir de 2007 (inclusive), os aumentos salariais sempre corresponderam ao dobro do percentual do ano 
//anterior. 
//Faça um programa que determine o salário atual desse funcionário.

#include <stdio.h>

int main() {
    float salario, novo_salario, percentual;
    int i, ano_atual;
    
    printf("Digite o ano atual: ");
    scanf("%d", &ano_atual);
    
    salario = 1000;
    percentual = 1.5 / 100;
    
    printf("Percentual inicial: %.2f\n", percentual);
    printf("Salário inicial (2007): %.2f\n", salario);
    
    if (ano_atual >= 2007) {
        for (i = 2007; i <= ano_atual; i++) {
            novo_salario = salario + (salario * percentual);
            salario = novo_salario;
            
            printf("\n----------------------\n");
            printf("Ano: %d\n", i);
            printf("Percentual: %.2f\n", percentual);
            printf("Salário do ano: %.2f\n", salario);
            
            percentual = percentual * 2; // Aumento do percentual para o próximo ano
        }
        printf("\nSalário atual: %.2f\n", novo_salario);
    }
    else {
        printf("\nNão foi possível calcular o salário\n");
    }
    
    return 0;
}
