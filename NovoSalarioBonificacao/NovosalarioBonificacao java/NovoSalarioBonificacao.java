import java.util.Scanner;

public class NovoSalarioBonificacaoEscola {

    public static void main(String args[]) {
        float salario, novo_salario, bonificacao, auxilio;
        Scanner dado = new Scanner(System.in);
        System.out.print("Digite o salário atual: ");
        salario = dado.nextFloat();
        System.out.println("Salário informado: " + salario);

        if (salario <= 600) {
            auxilio = 150;
            if (salario <= 500) {
                bonificacao = salario * (5.0f / 100);
                novo_salario = salario + auxilio + bonificacao;
            } else {
                bonificacao = 0;
                novo_salario = salario + auxilio;
            }

            System.out.println("Novo salário: " + novo_salario);
            System.out.println("auxilio: " + auxilio);
            System.out.println("bonificacao: " + bonificacao);
        } else {
            auxilio = 100;
            novo_salario = salario + auxilio;
            System.out.println("Novo salário: " + novo_salario);
        }
    }
}
