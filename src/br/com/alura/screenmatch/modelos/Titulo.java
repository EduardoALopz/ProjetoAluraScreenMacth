package Br.Com.Alura.ScreenMatch.Modelos;
// Classe Base Para Representar Um Título (Filme ou Série)
public class Titulo implements Comparable<Titulo>{
    // Armazena O Nome Do Título
    private String nome;
    // Armazena O Ano De Lançamento Do Título
    private int anoDeLancamento;
    // Armazena Se O Título Está Incluído No Plano De Assinatura
    private boolean incluidoNoPlano;
    // Armazena A Soma De Todas As Avaliações Para Calcular Média
    private double somaDasAvaliacoes;
    // Armazena A Quantidade Total De Avaliações Recebidas
    private int totalDeAvaliacoes;
    // Armazena A Duração Do Título Em Minutos
    private int duracaoEmMinutos;
    // Construtor Que Inicializa Um Título Com Ano E Nome
    public Titulo(int anoDeLancamento, String nome) {
        this.anoDeLancamento = anoDeLancamento;
        this.nome = nome;
    }
    // Getter Que Retorna O Nome Do Título
    public String getNome() {
        return nome;
    }
    // Getter Que Retorna O Ano De Lançamento Do Título
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    // Getter Que Retorna Se O Título Está No Plano De Assinatura
    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }
    // Getter Que Retorna A Duração Em Minutos
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    // Getter Que Retorna O Total De Avaliações Recebidas
    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
    // Setter Que Define O Nome Do Título
    public void setNome(String nome) {
        this.nome = nome;
    }
    // Setter Que Define O Ano De Lançamento
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    // Setter Que Define Se O Título Está No Plano
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }
    // Setter Que Define A Duração Em Minutos
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    // Método Que Exibe As Informações Técnicas Do Título
    public void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }
    // Método Que Adiciona Uma Avaliação À Soma Total De Avaliações
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    // Método Que Calcula E Retorna A Média De Avaliações
    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo OutroTitulo) {
        return this.getNome().compareTo(OutroTitulo.getNome());
    }
}
