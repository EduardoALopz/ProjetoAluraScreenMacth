package Br.Com.Alura.ScreenMatch.Principal;
import Br.Com.Alura.ScreenMatch.Modelos.Filme;
import Br.Com.Alura.ScreenMatch.Modelos.Serie;
import Br.Com.Alura.ScreenMatch.Modelos.Titulo;
import java.util.ArrayList;
// Classe Principal Que Executa O Programa Com Listas
public class PrincipalComListas {
    // Método Main Que É O Ponto De Entrada Do Programa
    public static void main(String[] args){
        // Cria Um Novo Filme Com Nome E Ano De Lançamento
        Filme OPoderosoChefao = new Filme("O Poderesso Chefão ", 1970);
        // Cria Uma Nova Série Com Ano E Nome
        Serie Lost = new Serie(2000, "Lost");
        // Cria Outro Filme
        Filme Avatar = new Filme("Avatar", 2015);
        // Cria Mais Um Filme
        Filme FilmeDoEdu = new Filme("Eduardo", 2006);
        // Cria Uma Nova Lista De Títulos (Polimorfismo)
        ArrayList<Titulo> ListadeFilmes = new ArrayList<>();
        // Adiciona O Primeiro Filme À Lista
        ListadeFilmes.add(OPoderosoChefao);
        // Adiciona A Série À Lista
        ListadeFilmes.add(Lost);
        // Adiciona O Segundo Filme À Lista
        ListadeFilmes.add(Avatar);
        // Adiciona O Terceiro Filme À Lista
        ListadeFilmes.add(FilmeDoEdu);
        // Foreach Para Iterar Sobre A Lista De Títulos
        for (Titulo titulo : ListadeFilmes) {
            // Exibe A Duração Em Minutos De Cada Título
            System.out.println("Filme: " + titulo);
        }
    }
}
