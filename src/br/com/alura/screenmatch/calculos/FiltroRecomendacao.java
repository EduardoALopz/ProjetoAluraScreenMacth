package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está Entre os Preferidos do Momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito Bem Avaliado no Momento!");
        } else {
            System.out.println("Coloque Na sua Lista para Assistir Depois");
        }
    }
}
