//page 87
//12. Faça um programa que receba o código correspondente ao cargo de um funcionário e seu salário atual
//e mostre o cargo, o valor do aumento e seu novo salário. Os cargos estão na tabela a seguir.
//Código CArgo PErCENTuAL
//1 Escriturário 50%
//2 Secretário 35%
//3 Caixa 20%
//4 Gerente 10%
//5 Diretor Não tem aumento

import java.util.Scanner;
import java.text.DecimalFormat;

public class SalarioFuncionarioPorCargo {

    public static void main(String args[]) {
        double salario, novo_salario, percentual_aumento, percentual;
        int cargo;

        Scanner dado = new Scanner(System.in);
        System.out.println(" Codigo |   Cargo   | Percentual |");
        System.out.println("   1    | Escritorio |    50%     |");
        System.out.println("   2    | Secretario |    35%     |");
        System.out.println("   3    |   Caixa    |    20%     |");
        System.out.println("   4    |  Gerente   |    10%     |");
        System.out.println("   5    |  Diretor   |    0%      |");
        System.out.println("");
        System.out.println("Digite o código do seu cargo");
        cargo = dado.nextInt();
        System.out.println("Digite o seu salário");
        salario = dado.nextDouble();

        // Verifica o código do cargo e calcula o percentual de aumento correspondente
        if (cargo == 1) {
            System.out.println("Cargo Escritorio");
            percentual = 50.0 / 100.0;
        } else if (cargo == 2) {
            System.out.println("Cargo Secretario");
            percentual = 35.0 / 100.0;
        } else if (cargo == 3) {
            System.out.println("Cargo Caixa");
            percentual = 20.0 / 100.0;
        } else if (cargo == 4) {
            System.out.println("Cargo Gerente");
            percentual = 10.0 / 100.0;
        } else if (cargo == 5) {
            System.out.println("Não tem aumento");
            percentual = 0.0;
        } else {
            System.out.println("Código inexistente");
            return;
        }

        percentual_aumento = salario * percentual;
        novo_salario = salario + percentual_aumento;

        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.println("Valor do aumento: R$ " + df.format(percentual_aumento));
        System.out.println("Novo salário: R$ " + df.format(novo_salario));
    }
}
