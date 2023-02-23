package exemplo4;

import java.util.Scanner;

public class AppINSS {
    public static void main(String[] args) {
        System.out.println("Informe nome: ");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();

        System.out.println("Informe o  salário: ");
        double salarioBruto = scanner.nextDouble();

        double imposto = salarioBruto * (0.11);
        double salarioLiquido = salarioBruto - imposto;

        System.out.println("Nome: " +  nome);
        System.out.println("Salário bruto R$\n" + salarioBruto);
        System.out.println("Imposto R$\n" + imposto);
        System.out.println("Salário líquido R$\n" + salarioLiquido);




    }
}
