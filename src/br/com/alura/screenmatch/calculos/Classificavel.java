package Br.Com.Alura.ScreenMatch.Calculos;
// Interface Que Define O Contrato Para Classes Que Podem Ser Classificadas
public interface Classificavel {
    // Método Que Deve Ser Implementado Por Classes Que Desejam Ser Classificáveis
    // Retorna Uma Nota De Classificação (Geralmente De 0 A 5)
    int getClassificacao();
}
