package Br.Com.Alura.ScreenMatch.Modelos;
import Br.Com.Alura.ScreenMatch.Calculos.Classificavel;
public class Filme extends Titulo implements Classificavel {
    // Armazena O Nome Do Diretor Do Filme
    private String diretor;
    // Construtor Que Inicializa Um Filme Com Nome E Ano De Lançamento
    public Filme(String nome, int anoDeLancamento) {
        super(anoDeLancamento, nome);
    }
    // Getter Que Retorna O Nome Do Diretor
    public String getDiretor() {
        return diretor;
    }
    // Setter Que Define O Nome Do Diretor
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    // Método Que Implementa A Interface Classificavel E Calcula A Classificação
    @Override
    public int getClassificacao() {
        // Obtém A Média De Avaliações Do Filme
        double media = pegaMedia();
        // Verifica Se O Filme Não Foi Avaliado
        if (media == 0) {
            return 0;  // Indica Filme Não Avaliado
        }
        // Converte A Média Para Uma Classificação De 0 A 5
        return (int) media / 2;
    }
    // Sobreescreve O Método ToString Para Exibir O Filme De Forma Legível
    @Override
    public String toString() {
        return "Filme " + this.getNome() + " ( " + this.getAnoDeLancamento() + " ) "; 
    }
}
