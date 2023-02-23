package atividade3_PSII;

public class Principal{

    public static void main(String args[]) {

        Carro meuCarro = new Carro();
        meuCarro.setMarca("BMW");
        meuCarro.setModelo("525i");
        meuCarro.setAnoFabricacao(1992);
        meuCarro.setAnoModelo(1992);

        meuCarro.imprimirInformacoes();
    }
}
/* Classe Principal
1º Falta inicializar o objeto com o  'Carro meuCarro = new Carro();
2º utilizar o set ou get ta classe;
3º Ao executar a corficará sem informação pois não foi atribuida.

 */
