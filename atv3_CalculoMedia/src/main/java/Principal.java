import java.util.Scanner;

/** Referente ao exercicio 1 aula 3
 * @author bruna.danyara
 * @version 1.0
 */

public class Principal {
    public static void main(String[] args) {
        /* nome matricula fone*/
        System.out.println("Informe o nome");
        Scanner scannerNome = new Scanner(System.in);
        String nome = scannerNome.nextLine();

        System.out.println("Informe a Matricula");
        Scanner scannerMatricula = new Scanner(System.in);
        int matricula = scannerMatricula.nextInt();

        System.out.println("Informe o Telefone");
        Scanner scannerFone = new Scanner(System.in);
        int fone = scannerFone.nextInt();

         System.out.println("Nome: "+nome+"\n" +
            "Matricula: "+matricula+"\n" +
            "Telefone: "+fone+"\n");


    }




}
