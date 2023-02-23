public class Pessoa {
    String nome;
    String cpf;
    String enderereco;
    int numero;
    String telefone;

    public Pessoa(){
    }

    public Pessoa(String nome, String cpf, String enderereco, int numero, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.enderereco = enderereco;
        this.numero = numero;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEnderereco() {
        return enderereco;
    }

    public void setEnderereco(String enderereco) {
        this.enderereco = enderereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }



}
