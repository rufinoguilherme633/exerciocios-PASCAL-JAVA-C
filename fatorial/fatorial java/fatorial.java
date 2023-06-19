//Faça um programa que leia um número N que indica quantos valores inteiros e positivos devem ser
//lidos a seguir. Para cada número lido, mostre uma tabela contendo o valor lido e o fatorial desse valor
//page 218

import java.util.Scanner;
public class FatorialNumero {
    public static void main(String []arg) {
        int n, num, i, j, fat;
        Scanner dado = new Scanner(System.in);
        System.out.println("Digite quandos numeros quer que eu realize o fatorial");
        n = dado.nextInt();
       // System.out.println(n);
       for (i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "º número: ");
            num = dado.nextInt();
            //System.out.println(i);
            fat = 1;
            for (j = 1; j <= num ; j++ ) {
                fat = fat * j;

            }

              System.out.println("Valor lido: " + num + " - Fatorial desse valor: " + fat);
       }
    }
}