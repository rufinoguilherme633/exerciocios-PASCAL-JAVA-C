import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        int num, resultado;

        Scanner dado = new Scanner(System.in);

        System.out.println("Digite um número:");
        num = dado.nextInt();

        resultado = num % 2;

        if (resultado == 0) {
            System.out.println("Esse número é par");
        } else {
            System.out.println("Esse número é ímpar");
        }
    }
}
