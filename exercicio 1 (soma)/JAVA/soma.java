import java.util.Scanner;

public class Nome {

    public static void main(String args[]) {

        float n1, n2, n3, n4, soma;
        Scanner dado = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        n1 = dado.nextFloat();

        System.out.println("Digite o segundo número:");
        n2 = dado.nextFloat();

        System.out.println("Digite o terceiro número:");
        n3 = dado.nextFloat();

        System.out.println("Digite o quarto número:");
        n4 = dado.nextFloat();

        soma = n1 + n2 + n3 + n4;

        System.out.println("A soma dos números é: " + soma);
    }
}