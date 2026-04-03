package Br.Com.Alura.ScreenMatch.Principal;
import java.util.ArrayList;
import Br.Com.Alura.ScreenMatch.Calculos.CalculadoraDeTempo;
import Br.Com.Alura.ScreenMatch.Calculos.FiltroRecomendacao;
import Br.Com.Alura.ScreenMatch.Modelos.Episodio;
import Br.Com.Alura.ScreenMatch.Modelos.Filme;
import Br.Com.Alura.ScreenMatch.Modelos.Serie;
// Classe Principal Que Executa O Programa
public class Principal {
    // Método Main Que É O Ponto De Entrada Do Programa
    public static void main(String[] args) {
        // Cria Um Novo Filme Com Nome E Ano De Lançamento
        Filme PoderosoChefao = new Filme("O Poderesso Chefão ", 1970);
        // Exibe As Informações Do Filme
        System.out.println("Nome do Filme: " + PoderosoChefao.getNome() + ", Ano de Lançamento: " + PoderosoChefao.getAnoDeLancamento());
        // Cria Uma Nova Série Com Ano E Nome
        Serie Lost = new Serie(2000, "Lost");
        // Exibe As Informações Da Série
        System.out.println("Nome da Série: " + Lost.getNome() + ", Ano de Lançamento: " + Lost.getAnoDeLancamento());
        // Cria Outro Filme
        Filme Avatar = new Filme("Avatar", 2015);
        // Exibe As Informações Do Filme
        System.out.println("Nome do Filme: " + Avatar.getNome() + ", Ano de Lançamento: " + Avatar.getAnoDeLancamento());
        // Cria Mais Um Filme
        Filme FilmeDoEdu = new Filme("Eduardo", 2006);
        // Exibe As Informações Do Filme
        System.out.println("Nome do Filme: " + FilmeDoEdu.getNome() + ", Ano de Lançamento: " + FilmeDoEdu.getAnoDeLancamento());
    }
}
