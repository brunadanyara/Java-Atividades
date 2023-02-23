public class PessoaMain {

    public static void main(String[] args) {
        nomeAndCpf( "Bruna Danyara Nascimento" , "999.999.999-99");
        nomeAndTelefoneAndEndereco();

    }

    public static void nomeAndCpf(String nome, String cpf) {
        Pessoa pessoaTeste = new Pessoa();
        pessoaTeste.nome = nome;
        pessoaTeste.cpf = cpf;
        System.out.println("Nome: " + pessoaTeste.nome + "\n" + "CPF: " + pessoaTeste.cpf);
    }

    public static void nomeAndTelefoneAndEndereco() {
        Pessoa pessoaTeste = new Pessoa();
        pessoaTeste.nome = "João Nascimento";
        pessoaTeste.telefone = "99999999";
        pessoaTeste.enderereco = "Av. Brasil Cascavel PR";
        pessoaTeste.numero = 799;
        System.out.println("Nome: " + pessoaTeste.nome + "\n" + "Telefone: " + pessoaTeste.telefone + "\n" + "Endereço: " + pessoaTeste.enderereco + "\n" + "Nº: " + pessoaTeste.numero);
    }
}

