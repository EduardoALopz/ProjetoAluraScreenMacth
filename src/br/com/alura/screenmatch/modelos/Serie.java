package Br.Com.Alura.ScreenMatch.Modelos;
// Classe Que Representa Uma Série De Televisão
public class Serie extends Titulo {
    // Armazena A Quantidade De Temporadas Da Série
    private int temporadas;
    // Armazena Se A Série Ainda Está Em Produção
    private boolean ativa;
    // Armazena A Quantidade De Episódios Por Temporada
    private int episodiosPorTemporada;
    // Armazena A Duração Em Minutos De Cada Episódio
    private int minutosPorEpisodio;
    // Construtor Que Inicializa Uma Série Com Ano E Nome
    public Serie(int anoDeLancamento, String nome) {
        super(anoDeLancamento, nome);
    }
    // Getter Que Retorna A Quantidade De Temporadas
    public int getTemporadas() {
        return temporadas;
    }
    // Setter Que Define A Quantidade De Temporadas
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    // Getter Que Retorna Se A Série Está Ativa
    public boolean isAtiva() {
        return ativa;
    }
    // Setter Que Define Se A Série Está Ativa
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    // Getter Que Retorna A Quantidade De Episódios Por Temporada
    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }
    // Setter Que Define A Quantidade De Episódios Por Temporada
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
    // Getter Que Retorna A Duração Em Minutos De Cada Episódio
    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }
    // Setter Que Define A Duração Em Minutos De Cada Episódio
    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
    // Sobreescreve O Método GetDuracaoEmMinutos Para Calcular Total De Minutos
    @Override
    public int getDuracaoEmMinutos() {
        // Verifica Se Algum Valor Está Vazio Para Evitar Cálculos Incorretos
        if (temporadas == 0 || episodiosPorTemporada == 0 || minutosPorEpisodio == 0) {
            System.err.println("AVISO: Serie " + getNome() + " com valores incompletos. Temporadas: "
                    + temporadas + ", Episódios: " + episodiosPorTemporada + ", Minutos: " + minutosPorEpisodio);
            return 0;
        }
        // Calcula E Retorna O Total De Minutos (Temporadas * Episódios * Minutos Por Episódio)
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }
    // Sobreescreve O Método ToString Para Uma Saída Legível
    @Override
    public String toString() {
        return "Série " + this.getNome() + " ( " + this.getAnoDeLancamento() + " )";
    }
}
