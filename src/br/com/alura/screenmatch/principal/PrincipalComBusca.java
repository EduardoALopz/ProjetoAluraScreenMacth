package Br.Com.Alura.ScreenMatch.Principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.Gson;
import Br.Com.Alura.ScreenMatch.Modelos.TituloOmdb;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Nome do Filme para Busca: ");
        String nomeDoFilme = leitura.nextLine();

        String endereco = "https://www.omdbapi.com/?t=" + nomeDoFilme.replace(" ", "+") + "&apikey=f301de91";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        TituloOmdb meuTitulo = gson.fromJson(response.body(), TituloOmdb.class);
        System.out.println("Nome: " + meuTitulo.getNome());
        System.out.println("Ano: " + meuTitulo.getAno());
        System.out.println("Duration: " + meuTitulo.getDuracao());
        System.out.println("Avaliation: " + meuTitulo.getAvaliacao());

    }
}
