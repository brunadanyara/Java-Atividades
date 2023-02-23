package atividade3_PSII;

public class Carro {
        private String marca;
        private String modelo;
        private int anoFabricacao;
        private int anoModelo;
        private String cor;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void imprimirInformacoes(){
            System.out.println("Marca: "+this.marca);
            System.out.println("Modelo: "+this.modelo);
            System.out.println("Ano de Fabricação: "+this.anoFabricacao);
            System.out.println("Ano do Modelo: "+this.anoModelo);
            System.out.println("Cor: "+this.cor);
        }
    }


/* 1º Precisa conter public ao iniciar a classe Carro;
2º De acordo com a Orientação a Objeto, o ideal é os atributos serem privados e serem acessando através do Get e Set
por questões de segurança, mas não é obrigatório, é possivel compilar igual.
 */