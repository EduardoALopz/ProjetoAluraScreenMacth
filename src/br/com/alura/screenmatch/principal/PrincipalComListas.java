package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args){

        Filme OPoderosoChefao = new Filme("O Poderesso Chefão ", 1970);
        Serie Lost = new Serie(2000, "Lost");
        Filme Avatar = new Filme("Avatar", 2015);
        Filme FilmeDoEdu = new Filme("Eduardo", 2006);

        ArrayList<Titulo> ListadeFilmes = new ArrayList<>();
        ListadeFilmes.add(OPoderosoChefao);
        ListadeFilmes.add(Lost);
        ListadeFilmes.add(Avatar);
        ListadeFilmes.add(FilmeDoEdu);
        System.out.println(ListadeFilmes);



    }
}
