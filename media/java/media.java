import java.util.Scanner;

public class Nome {
    public static void main(String args[]) {
        float n1, n2, n3, soma, media;
        Scanner dado = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        n1 = dado.nextFloat();

        System.out.println("Digite o segundo número:");
        n2 = dado.nextFloat();

        System.out.println("Digite o terceiro número:");
        n3 = dado.nextFloat();

        soma = n1 + n2 + n3;
        media = soma / 3;

        System.out.println("A media dos números é: " + media);
    }
}
