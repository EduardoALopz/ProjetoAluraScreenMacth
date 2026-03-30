package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public Serie(int anoDeLancamento, String nome) {
        super(anoDeLancamento, nome);
    }


    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        if (temporadas == 0 || episodiosPorTemporada == 0 || minutosPorEpisodio == 0) {
            System.err.println("AVISO: Serie " + getNome() + " com valores incompletos. Temporadas: "
                + temporadas + ", Episódios: " + episodiosPorTemporada + ", Minutos: " + minutosPorEpisodio);
            return 0;
        }
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }
}