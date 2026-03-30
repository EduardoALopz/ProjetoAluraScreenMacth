package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(anoDeLancamento, nome);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        double media = pegaMedia();
        if (media == 0) {
            return 0;  // Indica filme não avaliado
        }
        return (int) media / 2;
    }

    // Sobreescreve o Metodo toString e Estiliza com Caracteres
    @Override
    public String toString() {
        
        return "Filme " + this.getNome() + " ( " + this.getAnoDeLancamento() + " ) "; 
    }

}
