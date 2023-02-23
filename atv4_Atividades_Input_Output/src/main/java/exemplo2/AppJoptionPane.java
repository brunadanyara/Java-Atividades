package exemplo2;

import javax.swing.*;

public class AppJoptionPane {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("informe nome: ");
        JOptionPane.showMessageDialog(null, "Nome: " + nome);
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
        JOptionPane.showMessageDialog(null, "Idade: " + idade);

    }
}
