import javax.swing.*;
import java.util.Scanner;

public class Funcionario {

    String nome;
    double salarioBruto;
    double salarioLiquido;
    double percentualDesconto;
    double valorDesconto;

    public Funcionario() {
    }

    public Funcionario(String nome, double salarioBruto, double salarioLiquido, double percentualDesconto, double valorDesconto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
        this.percentualDesconto = percentualDesconto;
        this.valorDesconto = valorDesconto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
}


