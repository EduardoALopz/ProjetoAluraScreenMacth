package br.com.alura.screenmatch.principal;

import java.util.ArrayList;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme PoderosoChefao = new Filme("O Poderesso Chefão ", 1970);
        System.out.println("Nome do Filme: " + PoderosoChefao.getNome() + ", Ano de Lançamento: " + PoderosoChefao.getAnoDeLancamento());
        Serie Lost = new Serie(2000, "Lost");
        System.out.println("Nome da Série: " + Lost.getNome() + ", Ano de Lançamento: " + Lost.getAnoDeLancamento());
        Filme Avatar = new Filme("Avatar", 2015);
        System.out.println("Nome do Filme: " + Avatar.getNome() + ", Ano de Lançamento: " + Avatar.getAnoDeLancamento());
        Filme FilmeDoEdu = new Filme("Eduardo", 2006);
        System.out.println("Nome do Filme: " + FilmeDoEdu.getNome() + ", Ano de Lançamento: " + FilmeDoEdu.getAnoDeLancamento());

    }
}