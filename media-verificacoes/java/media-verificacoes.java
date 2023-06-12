import java.util.Scanner;

public class Nome {
    public static void main(String args[]) {
        float nota_trab, aval_sem, exame, media;
        Scanner dado = new Scanner(System.in);

        System.out.println("Digite a nota do trabalho de laboratório:");
        nota_trab = dado.nextFloat();

        System.out.println("Digite a nota da avaliação semestral:");
        aval_sem = dado.nextFloat();

        System.out.println("Digite a nota do exame:");
        exame = dado.nextFloat();

        media = (nota_trab * 2 + aval_sem * 3 + exame * 5) / 10;

        System.out.println("A média dos números é: " + media);

        if (media >= 8 && media <=10) {
            System.out.println("Obteve conceito A");
        } else if (media >= 7 && media < 8) {
            System.out.println("Obteve conceito B");
        } else if (media >= 6 && media < 7) {
            System.out.println("Obteve conceito C");
        } else if (media >= 5 && media < 6) {
            System.out.println("Obteve conceito D");
        } else if (media >= 0 && media < 5) {
            System.out.println("Obteve conceito E");
        } else {
            System.out.println("Não foi possível realizar os cálculos");
        }
    }
}
