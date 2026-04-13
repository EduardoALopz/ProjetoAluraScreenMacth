package Br.Com.Alura.ScreenMatch.Modelos;

import com.google.gson.annotations.SerializedName;

public class TituloOmdb {

    @SerializedName("Title")
    private String nome;

    @SerializedName("Year")
    private String ano;

    @SerializedName("Runtime")
    private String duracao;

    @SerializedName("imdbRating")
    private String avaliacao;

    public String getNome() {
        return nome;
    }

    public String getAno() {
        return ano;
    }

    public String getDuracao() {
        return duracao;
    }

    public String getAvaliacao() {
        return avaliacao;
    }
}
