import java.util.Scanner;

public class TestaSalarioFuncionario {

    public static void main(String[] args) {
        Funcionario testefuncionario = new Funcionario();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do Funcionario: ");
        testefuncionario.setNome(scanner.nextLine());
        System.out.println("Informe o Salário Bruto do Funcionario: ");
        testefuncionario.setSalarioBruto(scanner.nextDouble());
        System.out.println("Informe o Percentual de Desconto: ");
        testefuncionario.setPercentualDesconto(scanner.nextDouble());

        testefuncionario.setValorDesconto((testefuncionario.getPercentualDesconto() / 100) * testefuncionario.getSalarioBruto());
        testefuncionario.setSalarioLiquido(testefuncionario.getSalarioBruto() - testefuncionario.getValorDesconto());


        System.out.println("Nome Funcionário: " + testefuncionario.getNome() + "\n" + "Salário Bruto: " + testefuncionario.getSalarioBruto() + "\n" + "Valor Desconto: " + testefuncionario.getValorDesconto() +
                "\n" + "Salário Líquido: " + testefuncionario.getSalarioLiquido());

    }
}
