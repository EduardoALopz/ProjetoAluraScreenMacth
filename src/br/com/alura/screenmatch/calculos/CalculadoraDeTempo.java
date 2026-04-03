package Br.Com.Alura.ScreenMatch.Calculos;
import Br.Com.Alura.ScreenMatch.Modelos.Filme;
import Br.Com.Alura.ScreenMatch.Modelos.Serie;
import Br.Com.Alura.ScreenMatch.Modelos.Titulo;
// Classe Que Calcula O Tempo Total De Visualização De Vários Títulos
public class CalculadoraDeTempo {
    // Armazena O Tempo Total Acumulado Em Minutos
    private int tempoTotal;
    // Getter Que Retorna O Tempo Total Acumulado
    public int getTempoTotal() {
        return this.tempoTotal;
    }
    // Método Que Adiciona A Duração De Um Título Ao Tempo Total
    public void inclui(Titulo titulo) {
        System.out.println("Adicionando Duração em Minutos de " + titulo);
        // Soma A Duração Do Título Ao Tempo Total Acumulado
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
