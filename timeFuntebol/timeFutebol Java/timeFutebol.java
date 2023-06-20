// page 141
//Em um campeonato de futebol existem cinco times e cada um possui onze jogadores. Faça um programa que receba a idade, o peso e a altura de cada um dos jogadores, calcule e mostre:
//■■ a quantidade de jogadores com idade inferior a 18 anos; 
//■■ a média das idades dos jogadores de cada time; 
//■■ a média das alturas de todos os jogadores do campeonato; e
//■■ a porcentagem de jogadores com mais de 80 kg entre todos os jogadores do campeonato. 

import java.util.Scanner;

public class TimeFutebol {
    public static void main(String[] args) {
        int idade, contador_time, contador_jogador, quantidade_menor_que18, total_idade, total_altura;
        float peso, altura, media_altura, media_idade, porcentagem, total_peso, media_peso, porcentagem_peso_maior80, total_peso_maior80;

        Scanner dado = new Scanner(System.in);

        quantidade_menor_que18 = 0;
        total_peso = 0;
        media_peso = 0;
        media_idade = 0;
        total_idade = 0;
        porcentagem_peso_maior80 = 0;
        total_altura = 0;
        media_altura = 0;

        total_peso_maior80 = 0;

        for (contador_time = 1; contador_time <= 5; contador_time++) {
            System.out.println("Time " + contador_time);
            for (contador_jogador = 1; contador_jogador <= 11; contador_jogador++) {
                System.out.println("Qual a idade do " + contador_jogador + "° jogador?");
                idade = dado.nextInt();

                if (idade <= 18) {
                    quantidade_menor_que18 += 1;
                }
                total_idade += idade;

                System.out.println("Qual o peso do " + contador_jogador + "° jogador?");
                peso = dado.nextFloat();
                if (peso != 0) {
                    total_peso++;
                    if (peso >= 80) {
                        total_peso_maior80++;
                    }
                }

                System.out.println("Qual a altura do " + contador_jogador + "° jogador?");
                altura = dado.nextFloat();
                total_altura += altura;
            }

            media_idade = total_idade / 11;
            media_altura = total_altura / 11;
            porcentagem = (total_peso > 0) ? (total_peso_maior80 * 100.0f) / total_peso : 0;

            System.out.println("Jogadores menores de 18 anos no time " + contador_time + ": " + quantidade_menor_que18);
            System.out.println("A média da idade do time " + contador_time + " é: " + media_idade);
            System.out.println("A média da altura do time " + contador_time + " é: " + media_altura);
            System.out.println("A porcentagem de jogadores com peso maior ou igual a 80 é: " + porcentagem + "%");

            quantidade_menor_que18 = 0; // Reinicia a contagem para o próximo time
            total_idade = 0; // Reinicia a soma da idade para o próximo time
            total_peso = 0; // Reinicia a soma do peso para o próximo time
            total_peso_maior80 = 0; // Reinicia a contagem de jogadores com peso maior ou igual a 80 para o próximo time
            total_altura = 0; // Reinicia a soma da altura para o próximo time
        }
    }
}
