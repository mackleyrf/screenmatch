public class Main {

    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("A média é: " + media);

        String sinopse;
        sinopse = "Filme de aventura com ator dos anos 80.";
        System.out.println("Sinopse do filme: " + sinopse);

        int classificacao = (int) (media/2);
        System.out.println("A classificação é: " + classificacao);

    }
}