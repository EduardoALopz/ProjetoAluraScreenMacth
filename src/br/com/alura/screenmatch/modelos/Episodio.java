package Br.Com.Alura.ScreenMatch.Modelos;
import Br.Com.Alura.ScreenMatch.Calculos.Classificavel;
// Classe Que Representa Um Episódio De Uma Série
public class Episodio implements Classificavel {
    // Armazena O Número Do Episódio Na Série
    private int numero;
    // Armazena O Nome Do Episódio
    private String nome;
    // Armazena A Série À Qual O Episódio Pertence
    private Serie serie;
    // Armazena A Quantidade De Vezes Que O Episódio Foi Visualizado
    private int totalVisualizacoes;
    // Getter Que Retorna O Total De Visualizações
    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }
    // Setter Que Define O Total De Visualizações
    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }
    // Getter Que Retorna O Número Do Episódio
    public int getNumero() {
        return numero;
    }
    // Setter Que Define O Número Do Episódio
    public void setNumero(int numero) {
        this.numero = numero;
    }
    // Getter Que Retorna O Nome Do Episódio
    public String getNome() {
        return nome;
    }
    // Setter Que Define O Nome Do Episódio
    public void setNome(String nome) {
        this.nome = nome;
    }
    // Getter Que Retorna A Série Do Episódio
    public Serie getSerie() {
        return serie;
    }
    // Setter Que Define A Série Do Episódio
    public void setSerie(Serie serie) {
        this.serie = serie;
    }
    // Método Que Implementa A Interface Classificavel E Calcula A Classificação
    @Override
    public int getClassificacao() {
        // Verifica Se O Episódio Tem Muitas Visualizações
        if (totalVisualizacoes > 100) {
            return 4; // Episódio Muito Popular
        } else {
            return 2; // Episódio Pouco Popular
        }
    }
}
