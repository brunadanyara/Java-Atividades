package atividade3_PSI;

import javax.swing.*;

public class FolhaFuncionario {
    public static void main(String[] args) {
/*      - informe o salário;
        - informe a quantidade de dependentes.
        Atenção: cada dependente o funcionário receberá R$ 134,98 e uma acréscimo de 3%.
        Após ser lançado as informações, a empresa espera que sejam exibidos:
        - resultado do salário;
        - quantidade de dependentes;
        - total do salário família;
        - salário final. */

        double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe Salário do Funcionário"));
        int qtdDependentes = Integer.parseInt(JOptionPane.showInputDialog("Informe quantidade Dependentes"));
        double salarioFamilia=0;
        double salarioFinal=0;
        double salarioResultado=0;

        salarioResultado = salario + (qtdDependentes *((3.0/100) * salario));
        for (int i = 0; i < qtdDependentes; i++) {
            salarioFamilia+= 134.98;
        }
        salarioFinal = salarioResultado + salarioFamilia ;


        System.out.println("Resultado Salário: R$"+ salarioResultado +"\n"+
                "Quantidade de Dependentes: "+ qtdDependentes +"\n"+
                "Total do Salário Família: " + salarioFamilia +"\n"+
                "Salário Final: " + salarioFinal);

    }
}
