package Br.Com.Alura.ScreenMatch.Calculos;
// Classe Que Filtra E Exibe Recomendações Baseadas Na Classificação De Títulos
public class FiltroRecomendacao {
    // Armazena Uma Mensagem De Recomendação (Pode Ser Utilizado Futuramente)
    private String recomendacao;
    // Método Que Recebe Um Objeto Classificável E Determina Se Deve Ser Recomendado
    public void filtra(Classificavel classificavel) {
        // Verifica Se A Classificação É Muito Alta (4 Ou Mais)
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está Entre os Preferidos do Momento");
            // Verifica Se A Classificação É Média (2 Ou Mais)
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito Bem Avaliado no Momento!");
            // Se A Classificação É Baixa (Menos Que 2)
        } else {
            System.out.println("Coloque Na sua Lista para Assistir Depois");
        }
    }
}
