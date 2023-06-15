import java.util.Scanner;

public class NovoSalario {
    public static void main(String args[]) {
        float i, ano_atual, salario, novo_salario, percentual;

        Scanner dado = new Scanner(System.in);

        System.out.println("Digite o ano atual");
        ano_atual = dado.nextFloat();

        salario = 1000;
        percentual = 1.5f / 100;

        System.out.println("Salário inicial: " + salario);
        System.out.println("-------------------------------------------");

        for (i = 2007; i <= ano_atual; i++) {
            novo_salario = salario + (salario * percentual);
            percentual = 2 * percentual;
            salario = novo_salario;

            System.out.println("Ano: " + i);
            System.out.println("Percentual: " + percentual);
            System.out.println("Novo salário: " + novo_salario);
            System.out.println("-------------------------------------------");
        }
    }
}
